package com.flutterjunction.unittestexample.helper

import org.junit.Assert.*

import org.junit.Test

class HelperTest {

    @Test
    fun isPalindrome() {
        //Arrange
        var helper = Helper()

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