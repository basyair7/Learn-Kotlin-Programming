package com.basyair7.latihan7_3

// Variance
abstract class Vehicle(wheel: Int)
class Car(speed: Int) : Vehicle(4)
class MotorCycle(speed: Int) : Vehicle(2)

private fun test1() {
    val car = Car(200)
    val motorCycle = MotorCycle(100)
    var vehicle: Vehicle = car
    vehicle = motorCycle
    println(vehicle)
}

// Covariant
/*
interface List<out E> : Collection<E> {
    operator fun get(index: Int): E
}
*/

// Contravariant
/*
interface Comparable<in T> {
    operator fun compareTo(other: T): Int
}
*/



private fun main() {
    test1()
}

