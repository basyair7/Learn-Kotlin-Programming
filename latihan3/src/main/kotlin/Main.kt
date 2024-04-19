package com.basyair7


fun main() {
    val text: String = "Hello, World"
    val firstChar: Char = text[0]
    println(text)
    println(firstChar)
    for(char in text) {
        print("$char ")
    }
}