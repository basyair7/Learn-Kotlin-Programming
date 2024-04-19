package com.basyair7.latihan3_19

// Break and Continue

fun main() {
//    test1()
//    test2()
    test3()
}

fun test1() {
    val listOfInt = listOf(1, 2, 3, null, 5, null, 7)
    for (i in listOfInt) {
        print("$i ")
    }
}

fun test2() {
    val listOfInt = listOf(1, 2, 3, null, 5, null, 7)

    for (i in listOfInt) {
        // if (i == null) continue
        if (i == null) break
        print("$i ")
    }
}

fun test3() {
    loop@ for (i in 1..10) {
        println("Outside Loop")

        for (j in 1..10) {
            println("Inside Loop")
            if (j > 5) break@loop
        }
    }
}