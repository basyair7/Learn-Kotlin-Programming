package com.basyair7.latihan5_8

// Set

private fun test1() {
    val integerSet = setOf(1, 2, 3, 4, 5)
    print(integerSet)
}

private fun test2() {
    val setA = setOf(1, 2, 4, 2, 1, 5)
    val setB = setOf(1, 2, 4, 5)
//    println(setA == setB)
//    println(5 in setA && 5 in setB)
    val setC = setOf(1, 5, 7)
    val union = setA.union(setC)
    val intersect = setA.intersect(setC)
    println(union)
    println(intersect)
}

private fun main() {
    test2()
}