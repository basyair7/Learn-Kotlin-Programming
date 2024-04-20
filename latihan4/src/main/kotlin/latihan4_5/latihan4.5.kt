package com.basyair7.latihan4_5

// Primary Constructor

class Animal(name: String, weight: Double, age: Int, isMammal: Boolean) {
    val name: String
    val weight: Double
    val age: Int
    val isMammal: Boolean

    init {
        this.weight = if (weight < 0) 0.1 else weight
        this.age = if (age < 0) 0 else age
        this.name = name
        this.isMammal = isMammal
    }
}

private fun test1() {
    val animal = Animal("Kucing Oren", 4.2, 2, true)
    println("Nama: ${animal.name}, Berat : ${animal.weight}, Umur : ${animal.age}, Mamalia : ${animal.isMammal}")
}

private fun main() {
    test1()

}
