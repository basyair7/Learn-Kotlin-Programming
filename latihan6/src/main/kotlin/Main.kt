package com.basyair7

private class Main {
    companion object {
        @JvmStatic
        fun main (args: Array<String>) {
//            println("Belajar Konsep Functional Programming")
//            for (i in 1..5) {
//                println(i)
//            }
//            val total = listOf(1, 2, 3, 4, 5, 1, 2, 3, 4, 5)
//            val result1 = total.distinct()
//            val result2 = result1.slice(1..3)
//            println(result2)
            val message = {name : String -> "Hello $name"}
            print(message("basyair"))

        }
    }
}