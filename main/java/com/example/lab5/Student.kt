package com.example.lab5

class Student(public var name: String, public var lastName: String) {
    override fun toString(): String {
        return "$name $lastName";
    }
}