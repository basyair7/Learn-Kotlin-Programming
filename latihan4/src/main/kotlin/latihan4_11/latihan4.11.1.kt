package com.basyair7.latihan4_11

// Abstracts and Interfaces
// Abstract
abstract class Animal {
    // default value not allowed
    abstract val age: Int

    // default value allowed
    open val isEating = true
    val isRespire = true // can not be overridden
}

interface IWalk {
    // default value not allowed
    val numberOfLeg: Int // must be overridden
    fun walk() // must be overridden
}

interface IDrink {

}

class Camel: Animal(), IWalk, IDrink {
    override val age: Int = 7               // this property must exist, try to remove it
    override val isEating: Boolean = true   // this property optional, try to remove it
    override val numberOfLeg = 2            // this property must exist, try to remove it
    override fun walk() {   // this method must exist, try to remove it
        println("Camel can walk")
    }
}

private fun main() {
    val camel = Camel()
    println(camel.age)
    println(camel.isEating)
    println(camel.numberOfLeg)
    camel.walk()
}