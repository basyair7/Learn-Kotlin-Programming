package com.basyair7.latihan3_4

// Penggunaan blok if else statement

fun main() {
//    test1()
//    test2()
    test3()

}

fun test1() {
    val openHours = 7
    val now = 20
    if(now > openHours) {
        println("office already open")
    } else {
        println("office is closed")
    }
}

fun test2() {
    val openHours = 7
    val now = 0
    val office: String
    if(now > openHours) {
        office = "office already open"
    } else {
        office = "office is closed"
    }

    println(office)
}

fun test3() {
    val openHours = 7
    val now = 0
    val office : String
    office =
    if (now > openHours) {
        "office already open"
    }
    else if(now == openHours) {
        "wait a minute, office will be open"
    }
    else {
        "office is closed"
    }

    println(office)
}