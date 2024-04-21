package com.basyair7.latihan5_3

// Destructuring Declarations
/*
Destructuring Declaration adalah proses memetakan objek menjadi sebuah
variabel. Ini bisa dengan mudah dilakukan pada data class. Dengan fungsi
componentN() yang ada pada data class, kita bisa menguraikan sebuah objek
menjadi beberapa properti yang dimilikinya.
*/

// Contoh
data class DataUser(val name: String, val age: Int)

// atau juga bisa
data class DataUser2(val name: String, val age: Int) {
    fun intro() {
        println("Hello, my name is $name. I'm $age years old")
    }
}

private fun test1() {
    val dataUser = DataUser("Lily", 19)
    val name = dataUser.component1()
    val age = dataUser.component2()
    println("Hello, my name is $name. I'm $age years old")
    // output : Hello, my name is Lily. I'm 19 years old
}

private fun test2() {
    val dataUser2 = DataUser2("Lily", 19)
    dataUser2.intro()
}

private fun main() {
//    test1()
    test2()
}