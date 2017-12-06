package com.abukhleif.basics

fun main(args: Array<String>) {
    val samples = arrayOf(
            Vehicle("Tesla", "Model S", 2017, kilowattHours = 75),
            Vehicle("Ford", "Fusion", 2016, highwayMpg = 26, kilowattHours = 38),
            Vehicle("Mazda", "6", 2017, highwayMpg = 100)
    )

    println(samples[1])
    println()
    println("###############################q")
    println()

    for (car in samples)
        println(car)

    println()
    println("###############################")
    println()

    for ((index, car) in samples.withIndex())
        println("Item at $index is $car")

    println()
    println("###############################")
    println()


    val vector = doubleArrayOf(1.0, 2.5, 5.6, 3.9)
    println(vector.joinToString(separator = ", ", prefix = "[", postfix = "]"))
    vector[2] = 6.5 // mutate
    println(vector.joinToString(separator = ", ", prefix = "[", postfix = "]"))

    println()
    println("###############################")
    println()


    val matrix = arrayOf(
            doubleArrayOf(1.0, 2.0, 3.0),
            doubleArrayOf(1.1, 2.2, 3.3),
            doubleArrayOf(1.2, 2.3, 3.4)
    )
    println(matrix[1][2])
}