package com.basyair7.latihan4_13

private fun main() {
//    test1()
    test2()
}

// Nullable Receiver
/*
Menariknya, kita bisa juga mendeklarasikan sebuah extension dengan nullable receiver type.
Alhasil, extension tersebut bisa dipanggil pada objek yang bahkan nilainya null.
*/

// contoh
private fun test1() {
    val value1: Double = 24.0
    println(value1.slice)
}
/*
Lalu kapan kita membutuhkannya? Tentunya jika kita mempunyai sebuah objek yang bernilai null.
Saat kita tidak menetapkannya dengan nullable receiver type, maka kita perlu memeriksa apakah objek
tersebut bernilai null atau tidak? Bisa juga dengan menggunakan operator safe call setiap kali extension
tersebut dipanggil. Contohnya seperti berikut
*/
private fun test2() {
    val value1: Double = 24.0
    val value2: Int? = null

    println(value1.slice)
    println(value2.slice)
}


val Int?.slice: Int
    get() = if (this == null) 0  else this.div(2)

// atau
//val Double.slice: Double
//    get() = this.div(2)

/*
Kita juga bisa menentukan nilai dari receiver object jika bernilai null.
Sehingga kita tidak perlu lagi menggunakan operator safe call ketika ingin memanggil extension tersebut.
*/
val Double?.slice: Double
    get() = this?.div(2) ?: 0.0
