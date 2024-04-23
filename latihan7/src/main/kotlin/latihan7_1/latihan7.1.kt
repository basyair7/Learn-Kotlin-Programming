package com.basyair7.latihan7_1

// Mendeklarasikan Kelas Generic
private fun main() {
    test1()
}

private fun test1() {
    val longArrayList = ArrayList<Long>()
//    val firstLong = longArrayList.get(0)
}

class LongList : List<Long> {
    override fun get(index: Int): Long {
        return this[index]
    }
}

class ArrayList <T> : List<T> {
    override fun get(index: Int): T {
        return this[index]
    }
}

interface List<T> {
    operator fun get(index: Int) : T
}