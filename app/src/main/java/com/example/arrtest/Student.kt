package com.example.arrtest

class Student: Person {
    override fun name(name: String) {
        println(name)
    }

    override fun age(age: Int) {
        println(age)
    }

    override fun height(height: Double) {
        println(height)
    }
}