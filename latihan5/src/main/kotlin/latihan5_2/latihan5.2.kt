package com.basyair7.latihan5_2

// Menyalin dan memodifikasi data class
data class DataUser(val name: String, val age: Int)

private fun test1() {
    val dataUser1 = DataUser("Basyair", 24)
    val dataUser2 = DataUser("Dimas", 21)
    val dataUser3 = DataUser("Lily", 19)
    val dataUser4 = dataUser3.copy()
    val dataUser5 = dataUser2.copy(age = 20)
    println(dataUser3)
    println(dataUser4)
    println(dataUser5)
}

private fun main() {
    test1()
}