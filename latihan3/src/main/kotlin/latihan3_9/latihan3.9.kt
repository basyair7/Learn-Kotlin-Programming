package com.basyair7.latihan3_9

// Penggunaan safe call dan elvis operator

fun main() {
    val text: String? = null
    println(text?.length) // null

    val textLength = text?.length ?: 7
    println(textLength) // 7
}