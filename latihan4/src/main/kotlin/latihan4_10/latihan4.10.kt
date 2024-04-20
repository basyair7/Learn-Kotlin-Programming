package com.basyair7.latihan4_10

abstract class Animal (var name: String, var weight: Double, var age: Int, var isCarnivore: Boolean) {
    fun eat() {
        println("$name sedang makan!")
    }

    fun sleep() {
        println("$name sedang tidur!")
    }
}

private class latihan4_10_test1{
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
//            val animal = Animal("Kucing Oren", 2.6, 1, true) // Cannot create an instance of an abstract class
//            animal.eat()
//            animal.sleep()

            // Dengan begitu kelas Animal tidak dapat kita inisialisasikan menjadi sebuah objek.
        }
    }
}