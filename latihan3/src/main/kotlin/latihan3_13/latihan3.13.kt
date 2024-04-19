package com.basyair7.latihan3_13

// Varrag (Variable Argument)

fun main() {
    var number = sumNumbers(10, 20, 30, 40)
    println("Sum : $number")

    number = getNumberSize(10, 20, 30, 40, 50)
    print("Get size : $number")
}

fun sumNumbers(vararg number: Int): Int {
    return number.sum()
}

fun getNumberSize(vararg number: Int): Int {
    return number.size
}