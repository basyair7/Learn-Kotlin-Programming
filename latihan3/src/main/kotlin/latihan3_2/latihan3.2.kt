package com.basyair7.latihan3_2

// Penggunaan Characters (Char)

fun main() {
    var char: Char = 'A'
    //char = 'ABC' // Too many characters in a character literal ''ABC''
    println(char)

    for(i in 1 .. 5) {
        println("CHAR :  ${char++}")
    }

}