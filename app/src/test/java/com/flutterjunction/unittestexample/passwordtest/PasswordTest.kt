package com.flutterjunction.unittestexample.passwordtest

import com.flutterjunction.unittestexample.Utils
import org.junit.Assert.assertEquals
import org.junit.Test

class PasswordTest {

    @Test
    fun validatePassword_blank_input() {
        val validatePass = Utils()
        val result = validatePass.validatePassword("  ")

        assertEquals("Password is required", result)
    }

    @Test
    fun validatePassword_lessThan6() {
        val validatePass = Utils()
        val result = validatePass.validatePassword("pass")
        assertEquals("Password should be greater than 6 characters long", result)
    }

    @Test
    fun validatePassword_moreThan15() {
        val validatePass = Utils()
        val result = validatePass.validatePassword("passssssssssssssssssssssssssssss")
        assertEquals("Password should be less than 15 characters long", result)
    }

    @Test
    fun validatePassword_Success() {
        val validatePass = Utils()
        val result = validatePass.validatePassword("password")
        assertEquals("Valid", result)
    }
}