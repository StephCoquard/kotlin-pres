package com.serial.kotlin

import java.lang.IllegalArgumentException

// Function main (arguments optionnels)


// Function outside class possible


// No semi-colon


// 'if' and 'switch/when' are expressions

fun calculate(a: Int, b: Int, operation: Operation): Int {
    return when (operation) {
        Operation.ADDITION -> a + b
        Operation.SUBTRACTION -> a - b
        Operation.MULTIPLICATION -> a * b
        Operation.DIVISION -> a / b
    }
}

// Type inference (only with functions with no body)


enum class Operation {
    ADDITION, SUBTRACTION, MULTIPLICATION, DIVISION
}

fun main() {

}
