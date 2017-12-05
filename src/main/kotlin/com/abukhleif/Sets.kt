package com.abukhleif

fun main(args: Array<String>) {
    //Distinct values
    val strings = mutableSetOf("Alpha", "Alpha", "Bravo", "Delta")
    strings += "Alpha"
    strings += "Beta"
    
    for (s in strings)
        println(s)
}