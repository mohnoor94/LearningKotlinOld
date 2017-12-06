package com.abukhleif.basics

fun main(args: Array<String>) {
//    val reterivedPatient = Patient4.PatientDirectory.forId(1)
    val reterivedPatient = Patient4.forId(1)
    println(reterivedPatient)

}


data class Patient4(val id: Int, val firstName: String, val lastName: String) {
    // 1 companion object per class
//    object PatientDirectory {
//    companion object PatientDirectory {
    companion object {
        val allPatients = listOf( // DB?
                Patient4(1, "John", "Mooney"),
                Patient4(2, "Sam", "Bella"),
                Patient4(3, "Bla", "Bla Bla")
        )

        fun  forId (id:Int) = allPatients.find { it.id == id } // 1st patient
    }
}