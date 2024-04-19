package com.basyair7.latihan3_3

// Penggunaan Data Type String / String template

fun main() {
//    test1()
//    test2()
//    test3()
    test4()
}

fun test1() {
    val text: String = "Hello"
    val firstChar: Char = text[0]

    println("Karakter ke 1 dari kata \"Hello\" yaitu $firstChar")
}

fun test2() {
    val text: String = "Kotlin"
    println()
    for (char in text){
        print("$char ")
    }
}

fun test3() {
    val name = "Unicode test: \u00A9"
    println(name)
}

fun test4() {
    val line = """
        Line 1
        Line 2
        Line 3
        Line 4
    """.trimIndent()

    println(line)
}