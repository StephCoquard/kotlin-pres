package com.serial.kotlin.demo

fun main() {
    val paul = Person("Paul", "Bismuth")
    val samantha = Person("Samantha", "qfqs")

    //paul + samantha
    paul marry samantha

    println(paul.partner?.firstName)
    println(samantha.partner?.firstName)
}
