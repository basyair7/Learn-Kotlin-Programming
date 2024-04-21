package com.basyair7.latihan5_9

// Map

val capital = mapOf(
    "Jakarta" to "Indonesia",
    "London" to "England",
    "Tokyo" to "Japan"
)

private fun test1() {
    println(capital)
    println(capital["Tokyo"])
    // atau bisa juga dengan getValue()
    println(capital.getValue("Jakarta"))
}

// untuk menambahkan key-value ke dalam map, kita perlu memastikan bahwa
// map digunakan adalah mutable. Coba mengubah map capital menjadi mutable sebagai berikut
private fun test2() {
    val mutableCapita = capital.toMutableMap()
    // selanjutnya kita bisa menambahkan key-value baru ke dalam map capital
    mutableCapita.put("Berlin", "Germany")
    mutableCapita.put("Paris", "France")

    // dan hasilnya
    println(mutableCapita)
/*
Namun tidak disarankan jika menggunakan mutable collection yang diubah
oleh lebih dari 1 proses, hasilnya akan sulit untuk diperdiksi. Untuk itu,
sebaiknya gunakan immutable sebisa mungkin, jika memang dibutuhkan untuk
diubah baru gunakan mutable.
*/
}

private fun main() {
//    test1()
    test2()
}