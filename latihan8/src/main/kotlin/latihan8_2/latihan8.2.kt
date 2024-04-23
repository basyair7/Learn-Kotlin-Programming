package com.basyair7.latihan8_2

// Coroutine dengan async

import kotlinx.coroutines.*
import kotlin.time.measureTime

private fun main() {
//    test1()
//    test2()
    test3()
}

private fun test3() = runBlocking {
    val timeOne = measureTime {
        val capital = getCapital()
        val income = getIncome()
        println("Your profit is ${income - capital}")
    }

    val timeTwo = measureTime {
        val capital = async { getCapital() }
        val income = async { getIncome() }
        println("Your profit is ${income.await() - capital.await()}")
    }

    println("Complete in $timeOne ms vs $timeTwo")
}

private fun test2() = runBlocking {
    val capital = async { getCapital() }
    val income = async { getIncome() }

    println("Your profit is ${income.await() - capital.await()}")
}

private fun test1() = runBlocking {
    val capital = getCapital()
    val income = getIncome()
    println("Your profit is ${income - capital}")
}

private suspend fun getCapital(): Int {
    delay(1000L)
    return 50000
}

private suspend fun getIncome(): Int {
    delay(1000L)
    return 75000
}