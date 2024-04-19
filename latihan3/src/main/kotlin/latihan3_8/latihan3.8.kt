package com.basyair7.latihan3_8

// Penggunaan Nullable Types
/*
cara salah:
    val text: String = null // compile time error
cara benar:
    val text: String? = null // ready to go
*/

fun main() {
//    test1()
    test2()

}

/*
cara salah:
    val text: String? = null
    val textLength = text.length // compile time error
cara benar:
*/

fun test1() {
    var string: String? = "Dicoding"
    if(string != null) { // smart cast
        print(string.length) // It works now!
    }
}

fun test2() {
    var obj: Any = "Dicoding"

    if(obj is String) {
        // Tidak membutuhkan casting secara eksplisit.
        println("String length is ${obj.length}")
    }
}
