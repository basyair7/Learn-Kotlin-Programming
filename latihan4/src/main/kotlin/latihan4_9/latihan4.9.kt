package com.basyair7.latihan4_9

// Inheritances

open class Animal(val name: String) {
    open fun eat() {
        println("$name sedang makan!")
    }
}

class Cat(Name: String) : Animal(Name) {
    override fun eat() {
        super.eat()
        println("$name sedang makan ikan!")
    }
}

private class latihan4_9_test1 {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val myCat = Cat("Kucing Miaw")
            myCat.eat()
        }
    }
}

private class latihan4_9_test2 {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println("Test 2")
        }
    }
}