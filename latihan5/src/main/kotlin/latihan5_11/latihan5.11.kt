package com.basyair7.latihan5_11

// Fold, Drop, dan Take
// Fold
private var numbers = listOf(1, 2, 3)
private fun test1() {
    val fold = numbers.fold(10) { current, item ->
        println("current: $current")
        println("item: $item")
        current + item
    }
    println("Fold result: $fold")
}

private fun test2() {
    val fold = numbers.foldRight(10) { item, current ->
        println("current: $current")
        println("item: $item")
        println()
        item + current
    }
    println("Fold result: $fold")
}

// Drop
private fun test3() {
    numbers = listOf(1, 2, 3, 4, 5, 6)
    var drop = numbers.drop(3)
    // maka hasilnya
    println(drop) // output: [4, 5, 6]
    // atau pangkas item dari posisi akhir ke posisi awal? gunakan dropLast()
    drop = numbers.dropLast(3)
    println(drop) // output: [1, 2, 3]
}

// Take
private fun test4() {
    numbers = listOf(1,2,3,4,5,6)
    var take = numbers.take(3)
    println(take) // output: [1,2,3]
    // atau ambil 3 item dari akhir ke awal? gunakan takeLast(), sama seperti dropLast()
    take = numbers.takeLast(3)
    println(take) // output: [4,5,6]
}

private fun main() {
//    test1()
//    test2()
//    test3()
    test4()
}