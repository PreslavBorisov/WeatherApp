package eu.example.weatherapp.models

import java.io.Serializable

data class Main(
    val temp : Double,
    val feels_like: Double,
    val temp_min: Double,
    val temp_max : Double,
    val pressure: Int,
    val humidly: Int,
    val sea_level: Int,
    val grnd_level: Int
): Serializable
