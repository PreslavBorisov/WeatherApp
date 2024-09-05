package eu.example.weatherapp.netWork

import eu.example.weatherapp.models.WeatherResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherService {

    @GET("data/2.5/weather")
    fun getWeather(
        @Query("lat") latitude : Double,
        @Query("lon") longitude: Double,
        @Query("units") units: String,
        @Query("appid") appid: String
    ): Call<WeatherResponse>
}