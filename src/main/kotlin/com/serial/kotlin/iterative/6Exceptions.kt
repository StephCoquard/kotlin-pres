package com.serial.kotlin.iterative

import java.lang.IllegalArgumentException

// All exceptions are unchecked in Kotlin

fun div(numerator: Double, denominator: Double): Double =
    if (denominator != 0.0) numerator / denominator else throw IllegalArgumentException("O forbidden")

// Elvis

fun main() {

}
