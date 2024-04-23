package com.basyair7.latihan6_5

// Kotlin Standard Library
/*
Kotlin standard library memiliki beberapa fungsi yang tujuan utamanya adalah bagaimana menuliskan
logika kode di dalam konteks dari sebuah objek. Dalam menggunakan fungsi tersebut, kita akan memanfaatkan
lambda expression yang memiliki ruang lingkupnya sendiri yang dapat mengakses konteks dari sebuah objek.
Fungsi inilah yang dinamakan sebagai scope function. Beberapa fungsi yang berada di dalamnya antara lain
let, run, with, apply, dan also. Pada dasarnya beberapa fungsi tersebut melakukan tugas yang sama yaitu
mengeksekusi blok kode dari dalam sebuah objek. Yang membedakannya adalah bagaimana objek tersebut tersedia
dan seperti apa hasil yang didapat dari seluruh expression yang berada di dalam blok.
*/

// contoh
private fun test1() {
    val text = "Hello"
    text.let {
        val message = "$it Kotlin"
        println(message)
    }
    // atau bisa juga
    text.let { value ->
        val message = "$value basyair"
        println(message)
    }
}

private fun main() {
    test1()
}