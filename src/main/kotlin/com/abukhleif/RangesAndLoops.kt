package com.abukhleif

import java.time.LocalDate

fun main(args: Array<String>) {
    val range = 1..10

    for (i in range)
        print("$i, ")


    val dateRange = LocalDate.of(2017,3,1)..LocalDate.of(2017,6,1)
    val testDate1 = LocalDate.of(2017,4,6)
    val testDate2 = LocalDate.of(2017,9,6)

    println()
    println(testDate1 in dateRange)
    println(testDate2 in dateRange)

//    for (dt in dateRange){ // not supported
//        println(dt)
//    }
}