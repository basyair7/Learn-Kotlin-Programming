package com.basyair7.latihan5_10

// find(), firstOrNull(), & lastOrNull()
private val numberList = listOf(1,2,3,4,5,6,7,8,9,10)
private val firstOddNumber = numberList.find { it % 2 == 1 }
private val firstOrNullNumber = numberList.firstOrNull{ it % 2 == 3 }

private fun test1() {
    println("numberList: $numberList")
    println("firstOddNumber: $firstOddNumber")       // output: 1
    println("firstOrNullNumber: $firstOrNullNumber") // output: null
}

// first() & last()
/*
Hampir sama seperti fungsi firstOrNull() dan lastOrNull(), fungsi first() dan last()
digunakan untuk menyaring item pertama atau terakhir dari sebuah collection.
*/
private fun test2() {
    val moreThan10 = numberList.first { it > 10 }
    println(moreThan10) // output: Collection contains no element matching the predicate.
}

// sum()
/*
Fungsi sum() khusus hanya bisa digunakan untuk collection yang bertipe angka.
Fungsi ini akan menjumlahkan setiap data yang ada pada collection.
*/
private fun test3() {
    val total = numberList.sum()
    println(total) // 1..10 = 55
}

// sroted()
/*
sorted() digunakan untuk mengurutkan item yang ada di dalam collection.
Secara default fungsi sorted() ini akan mengurutkan data secara ascending.
example :
*/
private val charList = listOf('k', 'o', 't', 'l', 'i', 'n')
private fun test4() {
    val ascendingSort = charList.sorted()
    println(ascendingSort) // output : [i, k, l, n, o, t]
}

// untuk sorting secara descending, dapat menggunakan fungsi sortedDescending()
private fun test5() {
    val descendingSort = charList.sortedDescending()
    println(descendingSort) // output : [t, o, n, l, k, i]
}

private fun main() {
//    test1()
//    test2()
//    test3()
//    test4()
    test5()
}