package com.serial.kotlin.demo

import java.time.LocalDate
import java.time.Period

open class Person(val firstName: String, val lastName: String) {

    var age: Int? = null

    var partner: Person? = null;

    var dob: LocalDate? = null
        get() = field
        set(dob) {
            field = dob
            age = Period.between(dob, LocalDate.now()).years
        }

    fun getFullName() = firstName.format() + " " + lastName.format()

    operator fun plus(p: Person) {
        this.partner = p
        p.partner = this
    }

    infix fun marry(p: Person) {
        this.partner = p
        p.partner = this
    }
}
