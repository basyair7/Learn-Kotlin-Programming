package com.basyair7.latihan6_7

// Member References

//val sum: (Int, Int) -> Int = ::count
//private fun count(valueA: Int, valueB: Int): Int {
//    return valueA + valueB
//}

private fun isEvenNumber(number: Int) = number % 2 == 0

private fun main() {
    val numbers = 1.rangeTo(10)
    val evenNumber = numbers.filter(::isEvenNumber)
    println(evenNumber)
}
