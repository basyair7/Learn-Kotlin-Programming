package com.basyair7.latihan3_6

// Penggunaan Numbers

//val inNumber: Int = 100 // int (32 bit)
//val longNumber: Long = 100 // Long (64 bit)
//val longNumber = 100L // Long (64 bit)
//val shortNumber: Short = 100 // Short (16 bit)
//val byteNumber = 0b11010010 // Byte (8 bit)
//val doubleNumber: Double = 1.3 // Double (64 bit)
//val floatNumber: Float = 0.123f // Float (32 bit)

fun main () {
//    test1()
//    test2()
//    test3()
//    test4()
    test5()

}

fun test1() {
    // untuk mengetahui nilai maksimal yang dapat disimpan oleh suatu tipe number dapat menggunakan
    // MAX_VALUE, lalu untuk mengetahui nilai minimal yang dapat disimpan yaitu menggunakan MIN_VALUE
    // seperti contoh
    val maxInt: Int = Int.MAX_VALUE
    val minInt: Int = Int.MIN_VALUE
    val maxDouble: Double = Double.MAX_VALUE
    val minDouble: Double = Double.MIN_VALUE
    val maxByte: Byte = Byte.MAX_VALUE
    val minByte: Byte = Byte.MIN_VALUE

    println("Maksimal tipe number Int yang dapat disimpan = $maxInt")
    println("Minimal tipe number Int yang dapat disimpan = $minInt")
    println("Maksimal tipe number Double yang dapat disimpan = $maxDouble")
    println("Minimal tipe number Double yang dapat disimpan = $minDouble")
    println("Maksimal tipe number Byte yang dapat disimpan = $maxByte")
    println("Minimal tipe number Byte yang dapat disimpan = $minByte")

}

fun test2() {
    val maxInt = Int.MAX_VALUE
    val overRangeInt = Int.MAX_VALUE + 1 // This operation has led to an overflow

    println("Max Int: $maxInt")
    println("Over range Int: $overRangeInt")
}

fun test3() {
    var numberOne: Int; var numberTwo: Int
    numberOne = 1
    numberTwo = 2
    print("$numberOne + $numberTwo = ${numberOne + numberTwo}")

    numberOne = 27
    numberTwo = 10
    println("$numberOne / $numberTwo = ${numberOne/numberTwo}")

    println("5 + 4 * 4 = ${ 5 + 4 * 4}")
    println("(5 + 4) * 4 = ${(5 + 4) * 4}")
}

fun test4() {
    // cara convert byte ke int
    /*
    cara salah :
        val byteNumber: Byte = 1
        val intNumber: Int = byteNumber // compile error
    cara benar :
        val byteNumber: Byte = 10
        val intNumber: Int = byteNumber.toInt() // ready to go
     */

    val byteNumber: Byte = 10
    var intNumber: Int = byteNumber.toInt() // ready to go
    println(intNumber)

    /*
    Kode di atas menggunakan fungsi toInt() untuk melakukan konversi secara eksplisit dari tipe data Byte
    ke tipe data Int. Adapun beberapa fungsi konversi yang dapat kita gunakan antara lain:
    toByte(): Byte
    toShort(): Short
    toInt(): Int
    toLong(): Long
    toFloat(): Float
    toDouble(): Double
    toChar(): Char
     */

    // contoh lain :
    val stringNumber = "23"
    intNumber = 3

    print(intNumber + stringNumber.toInt())

}

fun test5() {
    // Dengan Kotlin kita juga bisa menuliskan nilai numerik yang “readable”
    // dengan menggunakan tanda underscores seperti berikut:
    val readableNumber = 1_000_000
    print(readableNumber)
}


