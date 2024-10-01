# Weather App

## Overview
This *Weather App* is a mobile application built for Android that fetches and displays current weather data using the *OpenWeatherMap API. The app is designed using **MVVM architecture, utilizes **Hilt* for dependency injection, and implements *Jetpack Compose* for the user interface.

## Features
- *MVVM Architecture*: The app follows the Model-View-ViewModel architecture pattern, which helps in separating the business logic from the UI.
- *Dependency Injection*: Hilt is used to provide dependencies across the app, making it easier to manage and test.
- *Asynchronous Operations*: Utilizes Kotlin Coroutines for making network calls, ensuring a smooth user experience without blocking the UI.
- *Dynamic UI*: The user interface is built using Jetpack Compose, allowing for a declarative approach to UI design.
- *Error Handling*: Displays appropriate messages when there are issues fetching weather data.

## Technologies Used
- *Kotlin*: The programming language used to develop the app.
- *Hilt*: A dependency injection library for Android that reduces boilerplate code.
- *Jetpack Compose*: A modern toolkit for building native UI.
- *Retrofit*: A type-safe HTTP client for Android and Java, used for API calls.
- *OpenWeatherMap API*: Provides weather data for various locations worldwide.

## Installation and Setup
To run this project locally:

1. *Clone the Repository*:
   ```bash
   git clone https://github.com/kavyasriram/WeatherApp.git
   

2. *Open the Project*:
      Open the cloned project in Android Studio.

3. *Sync the Project*:
      Make sure to sync the project with Gradle to download all dependencies.

4. *Obtain an API Key*:
     Sign up at OpenWeatherMap to get your API key.
     Replace "YOUR_API_KEY" in the WeatherScreen.kt file with your actual API key.
5. *Run the Project*:
     Build and run the app on an Android device or emulator.

## API Information
  The app uses the OpenWeatherMap API to fetch weather data.
  API Endpoint used:
    https://api.openweathermap.org/data/2.5/weather
  You need to provide the city name and API key to fetch the weather data.

## Project Structure
  MainActivity: The main entry point of the app.
  WeatherScreen: Composable function that displays weather information.
  WeatherViewModel: Contains the logic to fetch and manage weather data.
  WeatherApiService: Retrofit interface for making API calls.
  RetrofitInstance: Singleton Retrofit instance for handling API requests.

## How It Works
  The user clicks the Get Weather button to fetch weather data for a specified city (default set to New Delhi).
  The app displays the temperature, humidity, and weather description based on the response from the OpenWeatherMap API.
  If an error occurs (e.g., no internet), an error message is displayed.

## License
  This project is licensed under the MIT License - see the LICENSE file for details.
