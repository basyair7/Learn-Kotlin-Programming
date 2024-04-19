package com.basyair7.latihan3_17

// Range

fun main() {
//    test1()
//    test2()
//    test3()
    test4()
}

fun test1() {
    val rangeInt = 1..10
    print("${rangeInt.step} ")
}

fun test2() {
    val rangeInt = 1..10 step 2
    rangeInt.forEach {
        print("$it ")
    }
    println("\n${rangeInt.step}")
}

fun test3() {
    val rangeInt = 1.rangeTo(10)
    val downInt = 10.downTo(1)
    rangeInt.forEach {
        print("$it ")
    }
    println()
    downInt.forEach {
        print("$it ")
    }
}

fun test4() {
    val tenToOne = 10.downTo(1)
    if(11 !in tenToOne) {
        println("No value 11 in Range")
    }
}

