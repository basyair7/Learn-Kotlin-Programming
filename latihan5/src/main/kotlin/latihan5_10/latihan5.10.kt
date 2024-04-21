package com.basyair7.latihan5_10

// Collections Operations

// filter() dan filterNot()
private val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
private val eventList = numberList.filter {
    it % 2 == 0
}
private val notEventList = numberList.filterNot { it % 2 == 0 }

private fun test1() {
    println(eventList) // output : [2, 4, 6, 8, 10]
    println(notEventList) // output : [1, 3, 5, 7, 9]

    // jadi, dapat disimpulkan filterNot() merupakan kebalikan dari filter()
}

// map()
private val multipliedBy5 = numberList.map { it * 5 }
private fun test2 () {
    println(multipliedBy5) // output : semuanya dikali 5 -> [5, 10, 15, 20, 25, 30, 35, 40, 45, 50]
}

// count()
private fun test3() {
    val countNumberList = numberList.count()
    println(countNumberList)
    // atau bisa juga untuk menghitung index yang habis dibagi 2
    println(numberList.count{ it % 2 == 0})
}

private fun main() {
//    test1()
//    test2()
    test3()
}
