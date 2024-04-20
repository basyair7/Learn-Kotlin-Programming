package com.basyair7.latihan4_2

// membuat class

class Animal() {
    // ini propeties class
    var name: String = "Kucing"
    var weight: Double = 3.2
    var age: Int = 2
    var isMammal: Boolean = true

    // ini method class eat() dan sleep()
    fun eat() {
        println("$name makan!")
    }

    fun sleep() {
        println("$name tidur!")
    }
}

private fun test1() {
    val cat = Animal()
    // deskripsi
    println("Nama : ${cat.name}, Berat : ${cat.weight}, Umur : ${cat.age}, Mamalia : ${cat.isMammal}")
    cat.eat()
    cat.sleep()

    // mengubah propeties dari class Animal
    cat.name = "Kucing Oren"
    cat.weight = 6.0
    cat.age = 3
    println("Nama : ${cat.name}, Berat : ${cat.weight}, Umur : ${cat.age}, Mamalia : ${cat.isMammal}")
    cat.eat()
    cat.sleep()
}

private fun main() {
    test1()
}