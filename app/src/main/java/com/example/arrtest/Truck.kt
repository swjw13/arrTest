package com.example.arrtest

class Truck: Car() {
    override fun runProfessional() {
        println("Run Heavily")
    }
    override fun run(){
        super.run()
        println("I run, too")
    }

    override fun price() {
        println("20000won")
    }

    fun availableWeight(){
        println(2000)
    }
}