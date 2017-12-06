package com.abukhleif.basics

fun main(args: Array<String>) {
    val strings = listOf("Alpha", "Beta", "Delta")

    strings.forEach { println(it) }
    println()

    val lengths = strings.map { it.length }  // map each string to its length!
    lengths.forEach { println(it) }
    println()


    val filteredStrings = strings.filter { it.length >4 }
    filteredStrings.forEach { println(it) }
    println()

    val distinctLetters = strings.flatMap { it.split("") }
            .filter { it.trim() != "" }
            .map { it.toUpperCase() }
            .distinct()

    println(distinctLetters)
}