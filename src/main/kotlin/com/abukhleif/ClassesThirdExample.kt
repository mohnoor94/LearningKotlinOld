package com.abukhleif

fun main(args: Array<String>) {
    val zerothVehicle = Vehicle("Car", "Model", 2050)
    val firstVehicle = Vehicle("Tesla", "Model S", 2017, kilowattHours = 75)
    val secondVehicle = Vehicle("Ford", "Fusion", 2016, highwayMpg = 26, kilowattHours = 38)
    val thirdVehicle = Vehicle("Mazda", "6", 2017, highwayMpg = 100)


}


// with Initializer {VALIDATION} / {Initialization}
data class Vehicle(val make: String,
                   val model: String,
                   val year: Int,
                   val highwayMpg: Int? = null,
                   val kilowattHours: Int? = null) {
    val isElectric = kilowattHours != null
    val isGas = highwayMpg != null
//    val isHybrid = kilowattHours != null && highwayMpg != null

//    init {
//        if (highwayMpg == null && kilowattHours == null)
//            throw Exception("A highwayMpg or kilowattHours must be assigned!")
//
//        if (highwayMpg != null && kilowattHours != null)
//            throw Exception("highwayMpg and kilowattHours cannot both be assigned!")
//    }
}