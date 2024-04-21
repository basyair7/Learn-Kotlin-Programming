package com.basyair7.latihan5_7

// Singleton Object, Companion Object, & Anonymous Class
// Singleton Object
object CentrallLibrary {
    fun borrowBookById(id: Int) {
        println("Book with $id has been borrowed")
    }
}

// Companion Object
class Library {
    companion object {
        fun borrowBookById(id: Int) = println("Book with $id has been borrowed")
    }
}

private fun test1() {
    CentrallLibrary.borrowBookById(100)
}

private fun test2() {
    Library.Companion.borrowBookById(21)
    Library.borrowBookById(23)
}

private fun main() {
//    test1()
    test2()
}