package com.basyair7.latihan6_3

// Higher-Order Function

private fun main() {
//    test1()
    test2()
}

private fun test1() {
//    printResult(10, sum)
    // atau
//    printResult(10, { value ->
//        value + value
//    })
    // bisa juga dituliskan argumen di luar paranthesis seperti ini.
    printResult(10) { value ->
        value + value
    }

}

private fun printResult(value: Int, sum: (Int) -> Int) {
    val result = sum(value)
    println(result)
}

var sum: (Int) -> Int = { value -> value + value }

// Inline Function
private fun test2() {
    PrintResult(20) { value ->
        value + value
    }
}

private inline fun PrintResult(value: Int, sum: (Int) -> Int) {
    val result = sum(value)
    println(result)
}