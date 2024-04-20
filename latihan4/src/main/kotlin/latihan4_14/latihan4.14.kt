package com.basyair7.latihan4_14

// Import dan Packages

import com.basyair7.latihan4_14.packageBaru.* // dengan menambahkan bintang (*), jadi memanggil seluruh method/fungsi yang ada di dalam packageBaru
import kotlin.math.PI
import kotlin.math.cos as cosinus
import kotlin.math.sqrt as akar

private fun main() {
//    test1()
//    test2()
    test3()
}

private fun test1() {
    println("Phi = $PI")
    println("cos 120° = ${cosinus(120.0)}")
    println("Akar dari 9 = ${akar(9.0)}")
}

private fun test2() {
    sayHello()
}

private fun test3() {
    println(factorial(4.0))
    println(pow(3.0, 2.0))
    println(areaOfCircle(120.0))
}