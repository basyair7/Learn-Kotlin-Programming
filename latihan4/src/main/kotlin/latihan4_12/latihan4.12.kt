package com.basyair7.latihan4_12

// Extensions
/*
Kotlin mendukung 2 (dua) extension yang dapat digunakan,
yaitu Extension Functions dan Extension Properties.
*/

// Extension Functions
/*
Untuk mendeklarasikan sebuah extension functions, kita perlu menentukan terlebih dahulu receiver type,
kemudian nama dari fungsi tersebut yang mana keduanya dipisahkan oleh titik (.). Contohnya seperti berikut:
*/

private fun main() {
//    test1()
//    test2()
//    test3()
//    test4()
    test5()
}

private fun test1() {
    10.printInt()
}

private fun test2() {
    println(10.plusThree())
}

private fun Int.plusThree(): Int {
    return this + 3
}

private fun Int.printInt() {
    print("value $this")
}

// Extension Properties
/*
Seperti yang disebutkan di awal, Kotlin juga mendukung extension untuk menambah sebuah properti baru
pada sebuah kelas tanpa harus menyentuh kode di dalam kelas tersebut.
Deklarasinya pun sama seperti extension functions. Kita terlebih dahulu menentukan receiver type
kemudian nama dari properti tersebut. Contoh seperti berikut:
*/

val Int.slice: Int
    get() = this / 2

// untuk memanggil extension di atas, lakukan cara berikut
private fun test3() {
    println(10.slice) // output : 5
}

// Infix Function
// contoh sebuah fungsi untuk menambahkan dua nilai angka
/*
fun Int.sum(value: Int): Int {
    return this + value
}

val result = 5.sum(3)
*/

// berbeda jika menambahkan keyword infix pada awal function
infix fun Int.sum(value: Int): Int {
    return this + value
}

// maka hasilnya
private fun test4() {
    val result = 5 sum 3
    println(result) // 5+3 = 8 *menggunakan infix function
}

/*
Namun, ada beberapa syarat untuk menggunakan infix function.
Infix function harus merupakan sebuah member function atau extension function.
Harus memiliki satu parameter saja.
Parameter tidak boleh berupa generic dan tidak memiliki nilai default.
*/

// contoh pada class HeroML
class HeroML {
    infix fun addHero(name: String) { /*...*/ }
    fun build() {
        this addHero "GatotKaca"    // cara benar
        addHero("Lylia")      // cara benar
        // addHero "Alucard"        // cara salah
    }
}

private fun test5() {
    val hero = HeroML()
    println(hero.build())
}