package com.abukhleif

import java.time.LocalDate
import java.time.temporal.ChronoUnit

fun main(args: Array<String>) {
    val firstPatient = Patient2("Elena", "Patterson", LocalDate.of(1985, 1, 4))
    val secondPatient = Patient2("Elena", "Patterson", LocalDate.of(1985, 1, 4))
    val thirdPatient = Patient2(firstName = "John", birthday = LocalDate.of(1985, 1, 4), lastName = "Payne")

    println(firstPatient)
    println(secondPatient)
    println(thirdPatient)

    println()
    println()

    println(firstPatient == secondPatient) // Depending in all data field used in the constructor
    println(firstPatient == thirdPatient)

    println()
    println()

    val modifiedPatient = firstPatient.copy(lastName = "Noor")
    println(firstPatient)
    println(modifiedPatient)
}

//class Patient(val firstName: String, val lastName: String, val birthday:LocalDate)


data class Patient2(val firstName: String, val lastName: String, val birthday: LocalDate) {
    val age get() = ChronoUnit.YEARS.between(birthday, LocalDate.now())

    override fun equals(other: Any?): Boolean {
        other as Patient2
        return age == other.age
    }
}