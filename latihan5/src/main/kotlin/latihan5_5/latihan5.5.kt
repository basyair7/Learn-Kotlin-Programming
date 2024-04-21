package com.basyair7.latihan5_5

// Enum Class
private fun main() {
//    test1()
//    test2()
//    test3()
    test4()
}

private fun test1() {
    val color: Color = Color.RED
    println(color)

}

private fun test2() {
    val colors: Array<Color> = Color.values()
    colors.forEach { color ->
        print("$color ")
    }
}

private fun test3() {
    val color: Color = Color.valueOf("RED")
    println("Color is $color")
    println("Color value is ${color.value.toString(16)}")
}

private fun test4() {
    val color: Color = Color.GREEN
    when(color) {
        Color.RED -> print("Color is RED")
        Color.GREEN -> print("Color is GREEN")
        Color.BLUE -> print("Color is BLUE")
    }
}

enum class Color(val value: Int) {
    RED(0xFF0000) {
        override fun printValue() {
            println("value of RED is $value")
        }
    },
    GREEN(0x00FF00) {
        override fun printValue() {
            println("value of GREEN is $value")
        }
    },
    BLUE(0x0000FF) {
        override fun printValue() {
            println("value of BLUE is $value")
        }
    };

    abstract fun printValue()
}