package com.example.hilt

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

@HiltViewModel
class WeatherViewModel @Inject constructor() : ViewModel() {
    private val _weatherData = MutableLiveData<WeatherResponse>()
    val weatherData: LiveData<WeatherResponse> get() = _weatherData



    fun fetchWeather(city:String,apiKey:String) {

        RetrofitInstance.api.getCurrentWeather(city,apiKey).enqueue(object :
            Callback<WeatherResponse> {
            override fun onResponse(call: Call<WeatherResponse>, response: Response<WeatherResponse>) {
                if(response.isSuccessful) {
                    _weatherData.value =response.body()
                } else {
                    Log.i("MyTag","Error is ")
                }
            }

            override fun onFailure(call : Call<WeatherResponse>, t : Throwable){
                Log.i("MyTag","Failure is :"+t.message)

            }



        })
    }
}