package com.basyair7.latihan8_1

// Memulai Coroutines

import kotlinx.coroutines.*

private fun main() = runBlocking {
    launch {
        delay(1000L)
        println("Coroutines!")
    }
    print("Hello, ")
    delay(2000L)
}