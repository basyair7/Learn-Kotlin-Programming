package com.basyair7.latihan5_12

// Slice, Distinc, dan Chuncked

private val numbers = listOf(1,2,3,4,5,6,7,8,9,10)
// slice
private fun test1() {
    var slice = numbers.slice(3..6) // 3 < x < 6
    println(slice) // output: [4,5,6,7]
    // bisa juga menggunakan step pada range slice
    slice = numbers.slice(3..6 step 2)
    println(slice) // output: [4,6]
}

/*
jika ingin menentukan posisi index yang lebih spesifik, bisa juga
mendefinisikannya di dalam collection, kemudian disematkan sebagai
argumen. Example:
*/
private fun test2() {
    val index = listOf(2,3,5,8)
    val total = numbers
    val slice = total.slice(index)
    println(slice) // output: [3,4,6,9]
    /*
    Kita harus hati-hati dalam menentukan cakupan index untuk mendapatkan data.
    Karena dapat menyebabkan ArrayIndexOutOfBoundsException jika posisi yang ditentukan
    tidak terdapat pada object collection.
    */
}

// distinc
private fun test3() {
    val total = listOf(1, 2, 1, 3, 4, 5, 2, 3, 4, 5)
    val distinct = total.distinct()

    println(distinct) // output: [1,2,3,4,5]
}

// atau distinctBy()
private fun test4() {
    val text = listOf("A","B","CC", "DD","EEE","F","GGGG")
    val distinct = text.distinctBy { it.length }
    println(distinct) // output: [A, CC, EEE, GGGG]
}

// Chunked
private fun test5() {
    val word = "QWERTY"
    val chunked = word.chunked(3)
    println(chunked) // output: [QWE, RTY]
    val chunkedTransform = word.chunked(3) {
        it.toString().toLowerCase()
    }
    println(chunkedTransform) // output: [qwe, rty]
}

private fun main() {
//    test1()
//    test2()
//    test3()
//    test4()
    test5()
}