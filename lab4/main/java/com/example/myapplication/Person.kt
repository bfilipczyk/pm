package com.example.myapplication

import java.util.*

open class Person {
    protected var name: String = ""
        get() {
            return field.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
        }

    constructor(name: String) {
        this.name = name
    }
}