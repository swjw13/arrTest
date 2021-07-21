package com.example.arrtest

class Jw(
    val name: String,
    val age: Int,
    val height: Double,
    val weight: Double
) {
    fun getBMI(): Double = weight / Math.pow(height, 2.0)

    fun getMyName():String = name

    fun getMyAge() = age
}