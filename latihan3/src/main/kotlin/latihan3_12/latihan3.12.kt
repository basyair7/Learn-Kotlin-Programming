package com.basyair7.latihan3_12

// Named dan Default Argument

// Named Argument
//fun getFullName(first: String, middle: String, last: String): String {
//    return "$first $middle $last"
//}

fun getFullName( first: String = "Kotlin", middle: String = "is", last: String = "Awesome"): String {
    return "$first $middle $last"
}

fun main() {
    val fullName = getFullName(first = "Java") // getFullName(first = "Kotlin" , middle = "is", last = "Awesome")
    print(fullName)

}