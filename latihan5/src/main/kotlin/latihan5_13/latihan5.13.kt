package com.basyair7.latihan5_13

// Sequences
/*
Tiga jenis collection yang sudah dipelajari sebelumnya merupakan jenis
collection yang menjalankan eager evaluation. berbeda dengan itu, sequences
merupakan collection yang bisa dikategorikan ke dalam lazy evaluation. Jika
eager evaluation mengevaluasi item jika benar-benar diperlukan.
*/
private val list = (1..10000).toList()
private fun test1() {

    val first = list.filter { it % 5 == 0 }.map { it * 2 }.first()
    val last = list.filter { it % 5 == 0 }.map { it * 2 }.last()
    println(first) // output: 10
    println(last) // output: 20000
}

/*
untuk menerapkan lazy atau vertical evaluation, kita perlu mengubah list
menjadi sequence. dengan cara memanggil fungsi asSequence().
sebagai contoh :
*/
private fun test2() {
    val first = list.asSequence().filter { it % 5 == 0 }.map { it * 2 }.first()
    val last = list.asSequence().filter { it % 5 == 0 }.map { it * 2 }.last()
    println("First: $first\nLast: $last")
    /*
    First: 10
    Last: 20000
    */
}

// untuk membuat objek Sequence, bisa juga menggunakan fungsi yang tersedia pada
// standard library yaitu generateSequence()
// Sebagai contoh:
private fun test3() {
    val sequenceNumber = generateSequence(1) { it + 1 }
    sequenceNumber.take(5).forEach { print("$it ") } // output : 1 2 3 4 5
}

private fun main() {
//    test1()
//    test2()
    test3()

}