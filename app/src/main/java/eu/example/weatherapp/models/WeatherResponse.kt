package eu.example.weatherapp.models

import java.io.Serializable

data class WeatherResponse(
    val coord: Coord,
    val weather :List<Weather>,
    val base: String,
    val main: Main,
    val visibility: Int,
    val wind: Wind,
    val rain: Rain,
    val clouds: Clouds,
    val dt: Long,
    val sys: Sys,
    val timezone :Long,
    val id: Int,
    val name: String,
    val cod: Int
) : Serializable

//https://api.openweathermap.org/data/2.5/weather?q=London&appid=4cf84ec2425a0512a802cba9c5b84324









