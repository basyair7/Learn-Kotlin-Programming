package com.basyair7.latihan3_10

// Penggunaan Functions
fun main() {
    val numberOne = 4
    val numberTwo = 2
    println("$numberOne + $numberTwo = ${tambah(numberOne, numberTwo)}")
    println("$numberOne / $numberTwo = ${bagi(numberOne.toFloat(), numberTwo.toFloat())}")
    println(cetak("Hello, World"))
}

// mengembalikan nilai Int pada fungsi tambah
fun tambah(x: Int, y: Int): Int {
    return x+y
}

// mengembalikan nilai Float pada fungsi bagi
fun bagi(x: Float, y: Float): Float {
    return x/y
}

// mengembalikan nilai String pada fungsi cetak
fun cetak(messager: String): String {
    return messager
}

