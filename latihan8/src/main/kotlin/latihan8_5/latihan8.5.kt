package com.basyair7.latihan8_5

import kotlinx.coroutines.*
import kotlinx.coroutines.channels.Channel

private fun main() = runBlocking(CoroutineName("main")) {
    val channel = Channel<Int>()
    launch(CoroutineName("v1coroutine")) {
        println("Sending from ${Thread.currentThread().name}")
        for (x in 1..5) channel.send(x * x)
    }

    repeat(5) { println(channel.receive()) }
    println("received in ${Thread.currentThread().name}")
}