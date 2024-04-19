package com.basyair7.latihan3_7

// Penggunaan Array
// Selanjutnya adalah Array, yakni tipe data yang memungkinkan kita untuk menyimpan beberapa objek di dalam sebuah variabel.
// Array di Kotlin direpresentasikan oleh kelas Array yang memiliki fungsi get dan set serta properti size.
// Untuk membuat sebuah Array kita bisa memanfaatkan sebuah library function arrayOf() seperti berikut:

// val array = arrayOf(1, 3, 5, 7)
// val mixArray = arrayOf(1, 3, 5, 7 , "Dicoding" , true)

/*
    Kotlin juga memungkinkan kita untuk membuat Array
    dengan tipe data primitif dengan memanfaatkan beberapa fungsi spesifik berikut:
        intArrayOf() : IntArray
        booleanArrayOf() : BooleanArray
        charArrayOf() : CharArray
        longArrayOf() : LongArray
        shortArrayOf() : ShortArray
        byteArrayOf() : ByteArray
 */

fun main() {
//    test1()
    test2()
}

fun test1() {
    val intArray = intArrayOf(1, 3, 5, 7)
    println("intArray ke 2 adalah = ${intArray[2]}")
}

fun test2() {
    val intArray = intArrayOf(1, 3, 5, 7)  // [1, 3, 5, 7]
    intArray[2] = 11                       // [1, 3, 11, 7]

    print(intArray[2])
}
