package com.basyair7.latihan4_7

// Visibility Modifiers
/*
public      : Hak akses yang cakupannya paling luas. Anggota yang diberi modifier ini dapat diakses dari manapun.
private     : Hak akses yang cakupannya paling terbatas. Anggota yang menerapkannya hanya dapat diakses pada scope yang sama.
protected   : Hak akses yang cakupannya terbatas pada hirarki kelas. Anggota hanya dapat diakses pada kelas turunannya atau kelas itu sendiri.
internal    : Hak akses yang cakupannya terbatas pada satu modul. Anggota yang menggunakannya tidak dapat diakses diluar dari modulnya tersebut.
*/

open class Animal(val name: String, protected val weight: Double)

class Cat(name: String, weight: Double, age: Int, isMammal: Boolean): Animal(name, weight) {
    val age: Int
    val isMammal: Boolean
    init {
        this.age = age
        this.isMammal = isMammal
        println("Berat : ${weight}")
    }
}

internal fun main() {
    val myCat = Cat("Kucing Oren", 1.5, 1, true)
    println("Nama : ${myCat.name}")
    println("Umur : ${myCat.age}")
//    println("Berat : ${myCat.weight}") // Cannot access 'weight': it is protected in 'Cat'
    println("Mamalia : ${myCat.isMammal}")
}