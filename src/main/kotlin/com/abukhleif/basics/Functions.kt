package com.abukhleif.basics

import java.util.concurrent.ThreadLocalRandom

fun main(args: Array<String>) {
    printRandomInt()
    println(generateRandomInt())
    println(generateRandomInt(100, 10))
    println(generateRandomInt(100)) // default values
    println(generateRandomInt(max = 100, min = 10)) // Calling parameters by name!
    println(generateRandomInt(max = 100)) // Calling parameters by name! & default
}

// Functions could be in a different file, ins the same package? or import...
fun printRandomInt() {
    val randomInt = ThreadLocalRandom.current().nextInt()
    println(randomInt)
}

//fun generateRandomInt(): Int{
//    return ThreadLocalRandom.current().nextInt()
//}

fun generateRandomInt() = ThreadLocalRandom.current().nextInt()

fun generateRandomInt(max: Int, min: Int = 0) = ThreadLocalRandom.current().nextInt(min, max + 1)