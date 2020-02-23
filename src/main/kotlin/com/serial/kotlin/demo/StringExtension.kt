package com.serial.kotlin.demo

fun String.format() = this.substring(0, 1).toUpperCase() + this.substring(1).toLowerCase()
