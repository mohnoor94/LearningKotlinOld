package com.abukhleif

fun main(args: Array<String>) {
    println("Enter a wind speed:")
    val windSpeed = readLine()?.toInt() ?: throw Exception("Please provide a wind speed")

//    when {
//        windSpeed >= 40 -> println("HIGH")
//        windSpeed >= 30 -> println("MODERATE")
//        else -> println("LOW")
//    }

//    val windSeverity = when {
//        windSpeed >= 40 -> "HIGH"
//        windSpeed >= 30 -> "MODERATE"
//        else -> "LOW"
//    }


    val windSeverity = when {
        windSpeed >= 40 -> "HIGH"
        windSpeed >= 30 -> "MODERATE"
        windSpeed >= 0 -> "LOW"
        else -> throw Exception("Wind Speed must be positive!")
    }

    println("$windSpeed MPH has a severity of $windSeverity")
}