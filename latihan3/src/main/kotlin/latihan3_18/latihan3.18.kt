package com.basyair7.latihan3_18

// Looping : For Loop

fun main() {
//    test1()
//    test2()
//    test3()
    test4()
}

fun test1() {
//    val ranges = 1..5
    val ranges = 1.rangeTo(5)
    for (i in ranges) {
        println("value is $i")
    }
}

fun test2(){
    val ranges = 1.rangeTo(10) step 3
    for (i in ranges) {
        println("value is $i!")
    }
}

fun test3() {
    val rangers = 1.rangeTo(10) step 3
    for ((index, value) in rangers.withIndex()) {
        println("value $value with index $index")
    }
}

fun test4() {
    val ranges = 1.rangeTo(10) step 3
    ranges.forEach { value ->
        println("value is $value!")
    }
}