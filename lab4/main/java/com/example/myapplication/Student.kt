package com.example.myapplication

import java.util.*

class Student:Person {
//    private var name: String = ""
//        get() {
//            return field.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
//        }

    private var university: String

    val studentStatus = { x: String, y: String -> println("$x has a $y face color") }

    constructor(name: String, university: String="pk") : super(name) {
        this.university = university
    }

    public fun showStudent() {
        println(name)
        println(university)
    }


}