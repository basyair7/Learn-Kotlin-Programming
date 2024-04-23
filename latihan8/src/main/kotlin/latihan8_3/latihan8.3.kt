package com.basyair7.latihan8_3

import kotlinx.coroutines.*


private fun main() {
//    test1()
//    test2()
}

// Membuat Job baru
// menggunakan launch()
private fun test1() = runBlocking {
    val job = launch(start = CoroutineStart.LAZY) {
        delay(1000L)
        println("Start new job!")
    }

    job.start() // atau bisa juga dengan job.jon()
    println("Other task")
}

// membatalkan job
private fun test2() = runBlocking {
    val job = launch {
        delay(5000)
        println("Start new job!")
    }

    delay(2000)
    job.cancel()
    println("Cancellin job...")
    if (job.isCancelled) {
        println("Job is cancelled")

    }
}

// atau bisa juga dengan cara seperti ini
private class MainTest {
    companion object {
        @JvmStatic
        @InternalCoroutinesApi
        fun main(args: Array<String>) = runBlocking {
            val job = launch {
                delay(5000)
                println("Start new job!")
            }
            delay(2000)
            job.cancel(cause = CancellationException("time is up!"))
            println("Cancelling job...")
            if(job.isCancelled) {
                println("Job is cancelled because ${job.getCancellationException().message}")

            }
        }
    }
}