package com.basyair7.latihan5_7

// Anonymous Class
/*
interface IFly {
    fun fly()
}

fun flyWithWings(bird: IFly) {
    bird.fly()
}

class Bird : IFly {
    override fun fly() {
        println("The Bird flying")
    }
}
*/
// jadi ubah kode diatas menggunakan anonymous class
/*
interface IFly {
    fun fly()
}
*/

// atau bisa juga menggunakan Function (SAM) Interface
fun interface IFly {
    fun fly()
}

fun flyWithWings(bird: IFly) {
    bird.fly()
}

private fun main() {

    // flyWithWings(Bird()) //-> tanpa anonymous class
    /*
    flyWithWings(object : IFly { //-> dengan anonymous class
        override fun fly() {
            println("The Bird flying")
        }
    })
    */
    // jika sudah menggunakan SAM Interface, maka hasilnya seperti ini
    flyWithWings {
        println("The Bird flying")
    }
}