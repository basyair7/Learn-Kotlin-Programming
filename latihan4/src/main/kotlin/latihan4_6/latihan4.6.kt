package com.basyair7.latihan4_6

// Secondary Constructor

class Animal(name: String, weight: Double, age: Int) {
    // default constructor
    val name: String
    val weight: Double
    val age: Int
    var isMammal: Boolean

    init {
        this.weight = if(weight < 0) 0.1 else weight
        this.age = if(age < 0) 0 else age
        this.name = name
        this.isMammal = false
    }

    // secondary constructor
    constructor(name: String, weight: Double, age: Int, isMammal: Boolean): this(name, weight, age) {
        this.isMammal = isMammal
    }
}

private fun test1() {
    val kucingKu = Animal("Kucing Miaw", 2.5, 2, true)
    println("Nama: ${kucingKu.name}, Berat: ${kucingKu.weight}, Umur: ${kucingKu.age}, Mamalia: ${kucingKu.isMammal}")

    val ayamKu = Animal("Rembo", 1.1, 1)
    println("Nama: ${ayamKu.name}, Berat: ${ayamKu.weight}, Umur: ${ayamKu.age}, Mamalia : ${ayamKu.isMammal}")
}

private fun main() {
    test1()

}