package com.flutterjunction.unittestexample

class Utils {

    fun validatePassword(input: String) = when {

        input.isBlank() -> {
            "Password is required"
        }

        input.length < 6 -> {
            "Password should be greater than 6 characters long"
        }

        input.length > 15 -> {
            "Password should be less than 15 characters long"
        }

        else -> {
            "Valid"
        }
    }

    fun reverseString(str: String?): String {
        if (str==null){
            throw IllegalArgumentException("Input String is required")
        }
        return str.reversed()
    }


}