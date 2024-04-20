package com.basyair7.latihan5_1

// Penggunaan Data Class

// ex data class User
// data class User(val name: String, val age: Int)

class User(val name: String, val age: Int)
data class DataUser(val name: String, val age: Int)

// untuk melihat perbedaan nya
private fun test1() {
    val user = User("Basyair", 24)
    val dataUser = DataUser("Basyair", 24)
    println(user)       // output : com.basyair7.latihan5_1.User@12edcd21 *@12edcd21 adalah memory address dari kelas tersebut
    println(dataUser)   // output : DataUser(name=Basyair, age=24)
}

private fun main() {
    test1()

}