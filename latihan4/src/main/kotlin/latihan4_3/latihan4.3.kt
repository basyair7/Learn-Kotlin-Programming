package com.basyair7.latihan4_3

// Lateinit & Lazy Propety

lateinit var name1: String
val name2: String by lazy {
    "Kucing Miaw"
}

private fun test1() {
    name1 = "Kucing Miaw"
    println(name1.length)
}

private fun test2() {
    name1 = "Kucing Miaw"
    if (::name1.isInitialized)
        println(name1.length)
    else
        println("Not Initialized")
}

private fun test3() {
    println(name2.length)
}

private fun main() {
//    test1()
//    test2()
    test3()
}