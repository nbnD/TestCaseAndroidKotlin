package com.flutterjunction.unittestexample

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.google.gson.JsonSyntaxException
import org.junit.Assert.*

import org.junit.After
import org.junit.Before
import org.junit.Test
import java.io.FileNotFoundException

class QuoteManagerTest {

//@Before
// fun setUp() {}
//
//@After
// fun tearDown() {}

    @Test(expected = FileNotFoundException::class)
    fun populateQuoteFromAssets() {
        val quoteManager = QuoteManager()
        val context = ApplicationProvider.getApplicationContext<Context>()
        quoteManager.populateQuoteFromAssets(context, "")
    }

    @Test(expected = JsonSyntaxException::class)
    fun testPopulateQuoteFromAssets_InvalidJson_Expected_Exception() {
        val quoteManager = QuoteManager()
        val context = ApplicationProvider.getApplicationContext<Context>()
        quoteManager.populateQuoteFromAssets(context, "malformed.json")
    }

    @Test
    fun testPopulateQuoteFromAssets_ValidJson_Expected_Count() {
        val quoteManager = QuoteManager()
        val context = ApplicationProvider.getApplicationContext<Context>()
        quoteManager.populateQuoteFromAssets(context, "quotes.json")
        assertEquals(1643, quoteManager.quoteList.size)
    }


    @Test
    fun testPreviousQuote_expected_correctQuote() {
        val quoteManager = QuoteManager()
        quoteManager.populateQuotes(
            arrayOf(
                Quote(
                    "Genius is one percent inspiration and ninety-nine percent perspiration.",
                    "1"
                ),
                Quote("You can observe a lot just by watching.", "2"),
                Quote("hello", "3")
            )
        )

        val quote=quoteManager.getPreviousQuote()

        assertEquals("1",quote.author)
    }
    @Test
    fun testNextQuote_expected_correctQuote() {
        val quoteManager = QuoteManager()
        quoteManager.populateQuotes(
            arrayOf(
                Quote(
                    "Genius is one percent inspiration and ninety-nine percent perspiration.",
                    "1"
                ),
                Quote("You can observe a lot just by watching.", "2"),
                Quote("hello", "3")
            )
        )

        val quote=quoteManager.getNextQuote()

        assertEquals("2",quote.author)
    }
}