package com.basyair7.latihan4_8

// Overloading

class Animal(private var name: String) {
    fun eat() {
        println("$name sedang makan")
    }

    fun eat(typeFood: String) {
        println("$name memakan $typeFood")
    }

    fun eat(typeFood: String, quality: Double) {
        println("$name memakan $typeFood sebanyak $quality grams!")
    }
    
    fun sleep() {
        println("$name tidur...")
    }
}

class Calculator {
    fun add(a: Int, b: Int) = a + b
    fun add(a: Int, b: Int, c: Int) = a + b + c
    fun add(a: Double, b: Double) = a + b
    fun add(a: Float, b: Float) = a + b

    fun min(value1: Int, value2: Int) = if (value1 < value2) value1 else value2
    fun min(value1: Double, value2: Double) = if (value1 < value2) value1 else value2

    fun max(value1: Int, value2: Int) = if (value1 > value2) value1 else value2
    fun max(value1: Double, value2: Double) = if (value1 > value2) value1 else value2
}

private fun test1() {
    val catOren = Animal("Kucing Oren")
    catOren.eat()
    catOren.eat("Ikan Tuna")
    catOren.eat("Ikan Tuna", 450.0)
    catOren.sleep()
}

private fun test2() {
    val cal = Calculator()
    println(cal.add(2, 4))
    println(cal.add(2.5, 4.5))
    println(cal.add(6f, 7f))

    println(cal.min(9, 2))
    println(cal.min(9.2, 9.1))
    println(cal.max(9, 2))
    println(cal.max(9.2, 9.1))
}

private fun main() {
//    test1()
    test2()
}