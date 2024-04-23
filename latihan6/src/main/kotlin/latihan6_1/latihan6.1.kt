package com.basyair7.latihan6_1

// Function Type
// typealias
private typealias Arithmetic1 = (Int, Int) -> Int
private fun test1() {
    val sum: Arithmetic1 = { valueA, valueB -> valueA + valueB }
    val multiply: Arithmetic1 = { valueA, valueB -> valueA * valueB }

    val sumResult = sum(10, 10) // atau sum.invoke(10, 10)
    val multiplyResult = multiply.invoke(20, 20) // atau multiplyResult = multiply(20, 20)
    println("10 + 10 = $sumResult")
    println("20 * 20 = $multiplyResult")

}

// Atau bisa juga menggunakan function type nullable dengan menempatkannya di dalam
// tanda kurung atau diakhiri dengan safe call 

private typealias Arithmetic2 = ((Int, Int) -> Int)?
private fun test2() {
    val sum: Arithmetic2 = { valueA, valueB -> valueA + valueB }
    val sumResult = sum?.invoke(20, 20)
    print("20 + 20 = $sumResult")
}

private fun main() {
//    test1()
    test2()

}