package com.basyair7.latihan5_4

// Nested Class & Inner Class

// Nested Class example
class BuildingEx {
    val buildingArea = 230
    class Block {
        val totalBlock = 20
        fun measureRoomArea() {
            // Member class tidak dapat mengakses properti pada outer class
            // println(buildingArea / totalBlock) // muncul error : Unresolved reference -> buildingArea
        }
    }
}

// Maka dari itu tambahkan inner class pada member class
class Building {
    val buildingArea = 230
    val totalBlocks = 10
    inner class Block {
        val totalBlocks = 10
        fun measureRoomArea() {
//            println(buildingArea / totalBlocks)
            println(buildingArea / this@Building.totalBlocks)
        }
    }
}

private fun test1 () {
    val building = Building()
    val block = building.Block()
    block.measureRoomArea()
}

private fun main() {
    test1()
}