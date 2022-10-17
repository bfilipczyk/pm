package com.example.myapplication

class Student {
    var hasCredit: Boolean = false
    val name: String
    var uniName: String
    val number: Int
    var aura: String?

    constructor(hasCredit: Boolean, name: String, uniName: String, number: Int, aura: String? = null) {
        this.hasCredit = hasCredit
        this.name = name
        this.uniName = uniName
        this.number = number
        this.aura = aura
    }

    fun auraColor(studentPoints: Int = 2): Unit {
        val satisfactionLevel = (Math.pow(Math.random(), (110 -
                studentPoints) / 100.0) * 20).toInt()

        when(satisfactionLevel){
            in 0 .. 5 -> aura = "red"
            in 6 .. 10 -> aura = "orange"
            in 11 .. 15 -> aura = "purple"
            in 16 .. 20 -> aura = "green"
        }
    }

    fun printStudentStatus(name: String, auraColor: String): Unit{
        println("$name has a $auraColor face color")
    }
}