package com.basyair7.latihan3_15

// When Expressions

fun main() {
//    test1(13)
//    test1(15)
    test1(20)
    test2(6)
}

fun test1(value: Int) {
    when(value) {
        value -> println("Value is $value")
    }
}

fun test2(value: Int) {
    when(value) {
        6 -> println("Value is 6")
        7 -> println("Value is 6")
        8 -> println("Value is 6")
        9 -> println("Value is 6")
        else -> println("value cannot be reached")
    }
}