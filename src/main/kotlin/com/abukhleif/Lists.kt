package com.abukhleif

fun main(args: Array<String>) {
    // Immutable
    val strings = listOf("Alpha", "Bravo", "Delta")
//    strings[1] = "Edited" // error --> immutable
    for (s in strings)
        println(s)

    println()

    val  reversed = strings.reversed()
    for (s in reversed)
        println(s)

    println()
    println()

    val mutableStrings = mutableListOf("Alpha", "Bravo", "Delta")
    for (s in mutableStrings)
        println(s)
    mutableStrings[1] = "Edited"
    println()
    for (s in mutableStrings)
        println(s)
}