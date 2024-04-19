package com.basyair7.latihan3_14

// control flow
// Expressions dan Statements

fun main() {
//    test1(20, 7)
//    test2(0, 7)
    test3()

}

fun office(now: Int, openOffice: Int): String {
    return if(now > openOffice) "Office already open" else "Office closed"
}

fun sum(value1: Int, value2: Int) = value1 + value2

fun test1(now: Int, openOffice: Int) {
    if(now > openOffice) {
        println("Office already open")
    } else {
        println("Office Closed")
    }
}

fun test2(now: Int, openOffice: Int) {
    println(office(now, openOffice))
}

fun test3(){
    val x: Int = 2
    val y: Int = 5
    val value: Int = sum(x, y)
    println("$x + $y = $value")
}
