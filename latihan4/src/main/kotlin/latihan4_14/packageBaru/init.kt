package com.basyair7.latihan4_14.packageBaru

import kotlin.math.PI

fun sayHello() = println("Hallo, ini adalah package buatan saya sendiri dari latihan4_14.packageBaru")

const val Phi = PI

fun pow(number: Double, power: Double) : Double {
    var result = 1.0
    var counter = power
    while (counter > 0) {
        result *= number
        counter--
    }
    return result
}

fun factorial(number: Double) : Double {
    var result = 1.0
    var counter = 1.0
    while (counter <= number) {
        result *= counter
        counter++
    }
    return result
}

fun areaOfCircle(radius: Double) : Double {
    return PI * 2 * radius
}