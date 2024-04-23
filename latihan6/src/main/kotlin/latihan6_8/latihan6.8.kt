package com.basyair7.latihan6_8

// Function Inside Function

private fun setWord(message: String) {
    // printMessage() // output: Unresolved references
    fun printMessage() {
        println(message)
    }
    printMessage()
}

private fun test1() {
    setWord("Hello World")
}

private fun main() {
    test1()
}