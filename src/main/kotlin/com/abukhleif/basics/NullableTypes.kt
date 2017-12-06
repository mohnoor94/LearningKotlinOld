package com.abukhleif.basics

fun main(args: Array<String>) {
    val myValue = null // type is 'Nothing'!
//    val mySecondValue: String = null // Not allowed to be null!
    val mySecondValue: String? = null // Nullable type

//    val length = mySecondValue.length // error.. could throw null pointer exception

//    if (mySecondValue!= null) { // hmmmmmm?!
//        val length = mySecondValue.length
//        println(length)
//    }

//    same as if !!!

//    val length = mySecondValue?.length // WoW!
//    println(length)

//    val length = mySecondValue?.length ?: 0 // WoW! DEFAULT VALUE!
//    println(length)

//    val length = mySecondValue!!.length // Guarantee that the value (length) is not null or throw exception - Bruteforce?
//    println(length)

        val length = mySecondValue?.length ?: throw Exception("This should not be null!") // WoW again?!
    println(length)
}