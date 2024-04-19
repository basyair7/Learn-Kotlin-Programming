package com.basyair7.latihan3_5

// Boolean

fun main() {
//    test1()
//    test2()
    test3()
    test4()
}

fun test1() {
    val officeOpen = 7
    val officeClosed = 16
    val now = 20

    var isOpen = if (now >= officeOpen && now <= officeClosed){
        true
    } else {
        false
    }

    println("Office is open : $isOpen")
}

fun test2() {
    val officeOpen = 7
    val officeClosed = 16
    val now = 20
    val isOpen = now >= officeOpen && now <= officeClosed

    println("Office is open : $isOpen")
}

fun test3() {
    val officeOpen = 7
    val officeClosed = 16
    val now = 20
    val isClose = now < officeOpen || now > officeClosed

    println("Office is closed : $isClose")
}

fun test4() {
    val officeOpen = 7
    val officeClosed = 16
    val now = 20
    val isOpen = now < officeOpen || now > officeClosed

    if (!isOpen) {
        println("Office is open")
    } else {
        println("Office is closed")
    }
}