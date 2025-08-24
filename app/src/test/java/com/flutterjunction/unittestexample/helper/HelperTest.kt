package com.flutterjunction.unittestexample.helper

import org.junit.After
import org.junit.Assert.*
import org.junit.Before

import org.junit.Test

class HelperTest {


    private lateinit var helper:Helper

    @Before
    fun setUp(){
        //Arrange
       helper=Helper()
    }

@After
fun afterTest(){
    println("After every test case")
}
    @Test
    fun isPalindrome() {


        //Act


        val result=helper.isPalindrome("hello")
        //Assert

        assertEquals(false,result)
    }


    @Test
    fun isPalindrome_input() {
        //Arrange
        var helper = Helper()
        //Act


        val result=helper.isPalindrome("level")
        //Assert

        assertEquals(true,result)
    }
}