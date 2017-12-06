package com.abukhleif.basics

fun main(args: Array<String>) {
    val patient = Patient3("John", "Mooney", Gender.MALE)

    println(patient)
    println(patient.gender)
    println(patient.gender.chromosomes)
}

data class Patient3(val firstName: String,
                    val lastName: String,
                    val gender: Gender)

//enum class Gender{
//    MALE,
//    FEMALE
//}

enum class Gender(val chromosomes: String){
    MALE("XY"),
    FEMALE("XX")
}