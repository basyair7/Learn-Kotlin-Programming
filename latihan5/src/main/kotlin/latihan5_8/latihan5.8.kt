package com.basyair7.latihan5_8

// Collections
// List
private fun test1() {
    val numberList: List<Int> = listOf(1, 2, 3, 4, 5)
    val charList: List<Char> = listOf('A', 'B', 'C', 'D', 'E')
    // atau bisa juga
    val anyList = listOf('A', "Kotlin", true, 7)
    for(i in 0..3) {
        println(anyList[i])
    }
}

// Mutablelist
private fun test2() {
    val anyList = mutableListOf('A', "Kotlin", true, 7)
    anyList.add(5) // menambahkan item di akhir list
    anyList.add(2, "Iwak") // menambahkan item pada index ke-2
    anyList[3] = false // memodifikasi item pada index ke-3
    anyList.removeAt(0) // menghapus item pada index ke-0
    println(anyList)
}