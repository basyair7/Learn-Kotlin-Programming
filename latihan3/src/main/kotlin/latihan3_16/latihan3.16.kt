package com.basyair7.latihan3_16

fun main() {
//    test1()
    test2()
}

fun test1() {
    var counter = 8
    while(counter <= 7){
        println("Hello, World")
        counter++
    }
}

fun test2() {
    var counter = 1
    do {
        println("Hello, World")
        counter++
    } while(counter <= 7)
}
