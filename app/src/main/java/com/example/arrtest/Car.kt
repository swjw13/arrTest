package com.example.arrtest

abstract class Car {
    open fun run(){
        println("I run!")
    }

    abstract fun runProfessional()

    open fun price(){
        println("1000 won")
    }
}