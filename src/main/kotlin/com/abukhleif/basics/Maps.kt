package com.abukhleif.basics

fun main(args: Array<String>) {
    val map = mapOf(
            5 to "Alpha",
            6 to "Beta",
            7 to "Delta"
    )

    println(map[6])
    println(map[7])
    println(map[8])

    println()
    println()


    val strings = listOf("Alpha", "Beta", "Delta")

    val stringsByLengths = mutableMapOf<Int, String>()

    for (s in strings)
        stringsByLengths[s.length] = s

    println(stringsByLengths)
}