package com.basyair7.latihan14_15

// Exception
/*
Exception adalah event (kejadian) yang dapat mengacaukan jalannya suatu program.
Pada Kotlin semua exception bersifat Unchecked, yang artinya exception terjadi karena kesalahan pada kode kita.
Berikut ini beberapa contoh Unchecked Exception yang sering mengganggu jalannya program kita:
-> ArithmeticException
-> NumberFormatException
-> NullPointerException
*/

// ArithmeticException merupakan exception yang terjadi karena kita membagi suatu bilangan dengan nilai nol.
private fun test1() {
    val angka = 6
//    print(angka / 0) // hasilnya : Exception in thread "main" java.lang.ArithmeticException: / by zero
}

/*
NumberFormatException disebabkan karena terjadi kesalahan dalam format angka. 
Sebagai contoh, kita akan mengubah sebuah nilai String menjadi Integer tetapi nilai String yang akan 
kita ubah tidak memiliki format angka yang benar, sehingga dapat membangkitkan NumberFormatException. 
Berikut contoh kodenya:
*/

private fun test2() {
    val angka = "7.0"
    // println(angka.toInt()) // hasil : Exception in thread "main" java.lang.NumberFormatException: For input string: "18.0"
}

// NullPointerException
private fun test3() {
    val someNullValue: String? = null
    val someMustNullValue: String = someNullValue!!
    // println(someMustNullValue) // hasil : Exception in thread "main" java.lang.NullPointerException
}

private fun main() {
//    test1()
//    test2()
//    test3()
}