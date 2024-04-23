package com.basyair7.latihan6_6

// Scope Function with lambda receiver run
// run
private fun test1() {
    val text = "Hello"
    val result = text.run {
        val from = this
        val to = this.replace("Hello", "Kotlin")
        "replace text from $from to $to"
    }

    println("result : $result")
}

// with
private fun test2() {
    val message = "Hello Kotlin!"
    val result = with(message) {
        "First Character is ${this[0]}" +
                " and last character is ${this[this.length - 1]}"
    }

    println(result)
}

// apply
private fun test3() {
    val builder = StringBuilder()
    builder.append("Hello ")
    builder.append("Kotlin!")
    println(builder.toString())
}

// dengan fungsi apply kita bisa menuliskan kode seperti ini:
private fun test4() {
    val message = StringBuilder().apply {
        append("Hello ")
        append("Kotlin!")
    }

    println(message.toString())
}

private fun main() {
//    test1()
//    test2()
//    test3()
    test4()
}