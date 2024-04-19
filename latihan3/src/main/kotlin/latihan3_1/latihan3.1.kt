package com.basyair7.latihan3_1

// Penggunaan Data Types & Variable

fun main() {
    var company: String = "Dicoding" // var bisa mengubah nilai yang sudah di inisialisasikan
    val name: String = "Basyair"     // sedangkan  val tidak bisa

    println("Nama : $name")
    println(company)

    println()
    company = "Syiah Kuala"
    //name = "Fathul" // akan muncul "val cannot be reassigned" di terminal
    println("Nama : $name")
    println(company)
}