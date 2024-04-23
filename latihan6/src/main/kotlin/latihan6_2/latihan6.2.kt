package com.basyair7.latihan6_2

// Lambda
/*
 * Regular Function :
 * fun getMessage(val name: String): String {
 *     return "Hello, $name"
 * }
 *
 * Lambda Function :
 * val message : (String) -> String = {
 *      name: String -> "Hello, $name"
 * }
 *
*/

/* dengan menggunakan lambda, kita tidak perlu mendeklarasi tipe spesifik untuk nilai kembaliannya.
 * Tipe tersebut akan ditentukan oleh kompiler secara otomatis.
 * Walaupun merupakan sebuah fungsi, lambda tidak perlu membutuhkan kata kunci 'fun' dan visibility modifier
 * saat dideklarasikan karena lambda bersifat anonymous.
 * Parameter yang akan ditetapkan berada di damal kurung kurawal {}.
 * Ketika ingin mengembalikan nilai, kata kunci return tidak diperlukan lagi karena kompiler akan secara otomatis
 * mengembalikan nilai dari body.
 * Lambdan expression dapat digunakan sebagai argumen untuk sebuah parameter dan dapat disimpan ke dalam sebuah variabel.
 *
 */
/*
val comparator = object : Runnable {
    override fun run() {
        TODO("Not yet implemented")
    }
}

Dengan lambda, kita bisa menyederhanakannya menjadi seperti ini

val comparator = Runnable {
    TODO("Not yet implemented")
}

*/

// sebagai contoh
val message = { println("Hello From Lambda") }
val printMessage = { message: String -> print(message) }
val messageLength = { message: String -> message.length }
private fun test1() {
    val value = "Hello, World"
    message()
    printMessage(value)
    print(" : message length ${messageLength(value)}")
}

// perulangan dengan lambda
private fun test2() {
    // sebagai contoh menggunakan forEach
    val ranges = 1.rangeTo(10) step 3
    ranges.forEach { value ->
        println("value is $value")
    }

    ranges.forEachIndexed { index, value ->
        println("value $value with index $index")
    }
}

private fun main() {
//    test1()
    test2()
}