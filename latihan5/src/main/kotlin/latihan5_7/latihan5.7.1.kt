package com.basyair7.latihan5_7

class MyLibrary {
    // const 'val' are only allowed on top level, in named objects, or in companion objects
    // const val LIBRARY_NAME = "Perpustakaan Onlen"

    fun totalBook() {
        print("Total book in $LIBRARY_NAME is unlimited")
    }

    companion object {
        const val LIBRARY_NAME = "Perpustakaan Onlen"
    }
}

private fun test1() {
    val name = MyLibrary.LIBRARY_NAME
    println(name)
    MyLibrary().totalBook()
}

private fun main() = test1()