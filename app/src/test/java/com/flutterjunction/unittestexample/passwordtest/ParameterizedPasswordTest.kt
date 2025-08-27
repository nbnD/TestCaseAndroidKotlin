package com.flutterjunction.unittestexample.passwordtest


import com.flutterjunction.unittestexample.Utils
import com.flutterjunction.unittestexample.helper.Helper
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameters


@RunWith(Parameterized::class)
class ParameterizedPasswordTest(private val input: String, private val expectedValue: String) {

    @Test
    fun test() {
        val helper = Utils()
        val result = helper.validatePassword(input)
        assertEquals(expectedValue, result)
    }

    companion object {
        @JvmStatic
        @Parameters(name = "{index}:{0} is validated -{1} ")
        fun data(): List<Array<Any>> {
            return listOf(
                arrayOf("  ", "Password is required"),
                arrayOf("pass", "Password should be greater than 6 characters long"),
                arrayOf("passssssssssssssssssssssssssssss", "Password should be less than 15 characters long"),
                arrayOf("password", "Valid"),
            )
        }
    }
}