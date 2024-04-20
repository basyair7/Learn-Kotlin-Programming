package com.basyair7.latihan4_1

// Object Everywhere

private fun main() {
//    test1()
    test2()
}

private fun test1() {
    val someString: String = "Basyair"
    println(someString.reversed())
    println(someString.uppercase())
    println(someString.lowercase())
}

private fun test2() {
    val someString = "123"
    val someInt = someString.toInt()
    val someOtherString = "12.34"
    val someDouble = someOtherString.toDouble()

    println(someInt is Int)
    println(someDouble is Double)
}