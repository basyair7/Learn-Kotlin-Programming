package com.basyair7.latihan14_15

// Exception Handling

// try-catch
/*
try {
    // Blok try, menyimpan code yang membangkitkan exception
} catch (e: SomeException) {
    // Blok catch akan terpanggil jika exception bangkit
}
*/

private fun test1() {
    val someNullValue: String? = null
    lateinit var someMustNotNullValue: String

    try {
        someMustNotNullValue = someNullValue!!
        println(someMustNotNullValue)
    } catch (e: Exception) {
        someMustNotNullValue = "Nilai String ini Null"
        println(someMustNotNullValue)
    }
}

// atau bisa juga menggunakan try-catch-finally
private fun test2() {
    val someNullValue: String? = null
    lateinit var someMustNotNullValue: String

    try {
        someMustNotNullValue = someNullValue!!
    } catch (e: Exception) {
        someMustNotNullValue = "Nilai String ini Null"
    } finally {
        println(someMustNotNullValue)
    }
}

// Multi Catch
// sebagai contoh catch NullPointerException, NumberFormatException, dan Exception
private fun ex() {
    try {
        // TODO, ini blok kode try yang membangkitkan exception
    } catch (e: NullPointerException) {
        // TODO, blok ini akan bangkit ketika terjadi NullPointerException
    } catch (e: NumberFormatException) {
        // TODO, blok ini akan bangkit ketika terjadi NumberFormatException
    } catch (e: Exception) {
        // TODO, blok ini akan bangkit ketika terjadi Exception selain blok di atas
    } finally {
        // TODO, blok ini akan bangkit ketika sudah melalui blok try-catch
    }
}

private fun test3() {
    val someStringValue: String? = null
    var someIntValue: Int = 0

    try {
        someIntValue = someStringValue!!.toInt()
    } catch (e: NullPointerException) {
        someIntValue = 0
    } catch (e: NumberFormatException) {
        someIntValue = -1
    } finally {
        when(someIntValue){
            0 -> println("Catch block NullPointerException terpanggil !")
            -1 -> println("Catch block NumberFormatException terpanggil !")
            else -> println(someIntValue)
        }
    }
}

private fun main() {
//    test1()
//    test2()
    test3()
}