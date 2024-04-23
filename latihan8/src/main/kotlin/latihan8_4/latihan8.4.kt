package com.basyair7.latihan8_4

// Coroutine Dispatchers
import kotlinx.coroutines.*

private fun main() {
//    test1()
}

private fun test1() = runBlocking<Unit> {
    launch(Dispatchers.Unconfined) {
        println("Starting in ${Thread.currentThread().name}")
        delay(1000)
        println("Resuming in ${Thread.currentThread().name}")
    }.start()
}

// Single Thread Context
private class MainTest2 {
    @ObsoleteCoroutinesApi
    companion object {
        @JvmStatic
        fun main(args: Array<String>) = runBlocking<Unit> {
//            val dispatcher = newSingleThreadContext("myThread")
            val dispatcher = newFixedThreadPoolContext(3, "myPool")
            launch(dispatcher) {
                println("Starting in ${Thread.currentThread().name}")
                delay(1000)
                println("Resuming in ${Thread.currentThread().name}")
            }
        }
    }
}