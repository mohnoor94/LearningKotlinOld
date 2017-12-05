package com.abukhleif

import java.time.LocalDate
import java.time.temporal.ChronoUnit

fun main(args: Array<String>) {
    val firstPatient = Patient("Elena", "Patterson", LocalDate.of(1985, 1, 4))
    println("First patient is ${firstPatient.firstName} ${firstPatient.lastName}")

    val secondPatient = Patient(firstName = "John", birthday = LocalDate.of(1981, 6, 11), lastName = "Payne")
    println("Second patient is ${secondPatient.firstName} ${secondPatient.lastName}")

    println()
//    println("${firstPatient.firstName}'s age is ${firstPatient.getAge()}")
//    println("${secondPatient.firstName}'s age is ${secondPatient.getAge()}")

    println("${firstPatient.firstName}'s age is ${firstPatient.age}")

    println(firstPatient)

}

//class Patient(val firstName: String, val lastName: String, val birthday:LocalDate)


class Patient(val firstName: String, val lastName: String, val birthday: LocalDate) {
    //    fun getAge() = ChronoUnit.YEARS.between(birthday, LocalDate.now())
    val age get() = ChronoUnit.YEARS.between(birthday, LocalDate.now())  // Dynamic
//    val age  = ChronoUnit.YEARS.between(birthday, LocalDate.now()) // calculated once when class instantiated
}