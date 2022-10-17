package com.example.myapplication

fun main(args: Array<String>) {
    var student = Student(false, "Jan", "UJ", 123453)

    student.auraColor(17)

    student.printStudentStatus(student.aura.toString(),student.name)
}