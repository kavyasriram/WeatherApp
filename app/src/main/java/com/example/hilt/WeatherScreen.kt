package com.example.hilt

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel


@Composable
fun WeatherScreen(viewModel: WeatherViewModel = hiltViewModel()) {
    var city by remember { mutableStateOf("New Delhi") }
    val apiKey = "86ee769077465f7ebcbdc3354be689d8"
    var weatherResponse by remember { mutableStateOf<WeatherResponse?>(null) }

    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Button(onClick = {
            viewModel.fetchWeather(city,apiKey)
        }) {
            Text(text = "Get Weather")
        }

        weatherResponse?.let {
            Text(text = "Temperature: ${it.main.temp}C")
            Text(text = "Humidity: ${it.main.humidity}%")
            Text(text = "Description: ${it.weather[0].description}")
        } ?: run {
            Text(text = "No data available")
        }

        viewModel.weatherData.observeAsState().value?.let{
            weatherResponse = it
        }
    }
}