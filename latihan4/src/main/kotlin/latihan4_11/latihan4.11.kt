package com.basyair7.latihan4_11

// Abstract dan Interfaces


// Interfaces
interface IFly {
    fun fly()
    val numberOfWings: Int
}

class Bird1(override val numberOfWings: Int) : IFly {
    override fun fly() {
        if (numberOfWings > 0) println("Flying with $numberOfWings wings")
        else println("I'm Flying without wings")
    }
}

private fun test1() {
    val myBird = Bird1(4)
    myBird.fly()
}

private fun main() {
    test1()
}