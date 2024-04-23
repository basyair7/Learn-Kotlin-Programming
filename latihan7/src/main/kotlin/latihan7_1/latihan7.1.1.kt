package com.basyair7.latihan7_1

private fun main() {
    val numbers = (1..100).toList()
    print(numbers.slice<Int>(1..10))
}