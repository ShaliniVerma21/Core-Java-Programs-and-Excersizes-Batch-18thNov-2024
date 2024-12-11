package Assignement_3;
//Weather Information Dashboard 🌤️: Display current and forecasted weather data.

//Abstract class representing a WeatherData
abstract class WeatherData {
 protected String location;
 protected double temperature;
 protected double humidity;

 // Constructor
 public WeatherData(String location, double temperature, double humidity) {
     this.location = location;
     this.temperature = temperature;
     this.humidity = humidity;
 }

 // Abstract method to display weather data
 public abstract void displayWeather();

 // Method to check if the weather is hot
 public boolean isHot() {
     return temperature > 30.0; // Example threshold for hot weather
 }
}

//Concrete class representing CurrentWeather
class CurrentWeather extends WeatherData {
 // Constructor
 public CurrentWeather(String location, double temperature, double humidity) {
     super(location, temperature, humidity);
 }

 // Method to display current weather data
 @Override
 public void displayWeather() {
     System.out.println("Current Weather in " + location + ":");
     System.out.println("Temperature: " + temperature + "°C");
     System.out.println("Humidity: " + humidity + "%");
     System.out.println("Status: " + (isHot() ? "It's hot!" : "It's pleasant."));
 }
}

//Concrete class representing ForecastedWeather
class ForecastedWeather extends WeatherData {
 private String forecast;

 // Constructor
 public ForecastedWeather(String location, double temperature, double humidity, String forecast) {
     super(location, temperature, humidity);
     this.forecast = forecast;
 }

 // Method to display forecasted weather data
 @Override
 public void displayWeather() {
     System.out.println("Forecasted Weather in " + location + ":");
     System.out.println("Temperature: " + temperature + "°C");
     System.out.println("Humidity: " + humidity + "%");
     System.out.println("Forecast: " + forecast);
 }
}

//Class representing the Weather Dashboard
class WeatherDashboard {
 private WeatherData[] weatherData;
 private int dataCount;

 // Constructor
 public WeatherDashboard(int capacity) {
     weatherData = new WeatherData[capacity];
     dataCount = 0;
 }

 // Method to add weather data
 public void addWeatherData(WeatherData data) {
     if (dataCount < weatherData.length) {
         weatherData[dataCount] = data;
         dataCount++;
         System.out.println("Weather data added for: " + data.location);
     } else {
         System.out.println("Weather Dashboard is full. Cannot add more data.");
     }
 }

 // Method to display all weather data
 public void displayAllWeather() {
     System.out.println("Weather Information Dashboard:");
     for (int i = 0; i < dataCount; i++) {
         weatherData[i].displayWeather();
         System.out.println();
     }
 }
}

//Main class to manage the Weather Information Dashboard
public class demo36 {
 public static void main(String[] args) {
     // Create a Weather Dashboard with a capacity of 5 weather data entries
     WeatherDashboard weatherDashboard = new WeatherDashboard(5);

     // Create current and forecasted weather data
     WeatherData currentWeather = new CurrentWeather("New York", 32.0, 70.0);
     WeatherData forecastedWeather1 = new ForecastedWeather("Los Angeles", 28.0, 60.0, "Sunny");
     WeatherData forecastedWeather2 = new ForecastedWeather("Chicago", 25.0, 80.0, "Rainy");

     // Add weather data to the Weather Dashboard
     weatherDashboard.addWeatherData(currentWeather);
     weatherDashboard.addWeatherData(forecastedWeather1);
     weatherDashboard.addWeatherData(forecastedWeather2);

     // Display all weather data
     weatherDashboard.displayAllWeather();
 }
}