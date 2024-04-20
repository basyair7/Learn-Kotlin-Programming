package com.basyair7.latihan4_4

import kotlin.reflect.KProperty

class DelegateName {
    private var value: String = "Default"

    operator fun getValue(classRef: Any?, property: KProperty<*>): String {
        println("Fungsi ini sama seperti getter untuk properti ${property.name} pada class $classRef")
        return value
    }

    operator fun setValue(classRef: Any?, property: KProperty<*>, newValue: String) {
        println("Fungsi ini sama seperti setter untuk properti ${property.name} pada class $classRef")
        println("Nilai ${property.name} dari $value akan berubah menjadi $newValue")
        value = newValue
    }
}

class DelegateGenericClass {
    private var value: Any = "Default"

    operator fun getValue(classRef: Any, property: KProperty<*>): Any {
        println("Fungsi ini sama seperti getter untuk properti ${property.name} pada class $classRef")
        return value
    }

    operator fun setValue(classRef: Any, property: KProperty<*>, newValue: Any) {
        println("Nilai ${property.name} dari $value akan berubah menjadi $newValue")
        value = newValue
    }
}

class Animal {
    var name: Any by DelegateGenericClass()
    var weight: Any by DelegateGenericClass()
    var age: Any by DelegateGenericClass()
}

class Person {
    var name: String by DelegateName()
}

class Hero {
    var name: String by DelegateName()
}

private fun test1() {
    val animal = Animal()
    animal.name = "Kucing Oren"
    println("Nama Hewan ${animal.name}")

    val person = Person()
    person.name = "Yanto"
    println("Nama Orang : ${person.name}")

    val hero = Hero()
    hero.name = "Lylia"
    println("Nama Pahlawan : ${hero.name}")
}

private fun test2() {
    val animal = Animal()
    animal.name = "Kucing Miaw"
    animal.weight = 6.2
    animal.age = 1

    println("Nama : ${animal.name}")
    println("Berat : ${animal.weight}")
    println("Umur : ${animal.age} Tahun")
}

private fun main() {
//    test1()
    test2()
}