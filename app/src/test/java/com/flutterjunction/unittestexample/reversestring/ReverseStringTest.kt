package com.flutterjunction.unittestexample.reversestring

import com.flutterjunction.unittestexample.Utils
import org.junit.Assert.assertEquals
import org.junit.Test

class ReverseStringTest {

    @Test(expected = IllegalArgumentException::class)
    fun nullString() {
        val utils = Utils()
        val result = utils.reverseString(null)

    }

    @Test
    fun reverseSuccess_ValidInput() {
        val utils = Utils()
        val result = utils.reverseString("abc")
        assertEquals("cba", result)
    }

    @Test
    fun reverseSuccess_ValidInput_singleChar() {
        val utils = Utils()
        val result = utils.reverseString("a")
        assertEquals("a", result)
    }




}