package Day10;
// Weather Report
class WeatherReport {
    private String city;
    private double temperature;
    private String condition;

    // Constructor
    public WeatherReport(String city, double temperature, String condition) {
        this.city = city;
        this.temperature = temperature;
        this.condition = condition;
    }

    // Method to display weather report
    public void displayWeather() {
        System.out.println("City: " + city + ", Temperature: " + temperature + "°C, Condition: " + condition);
    }
}

// Example usage
public class Main7 {
    public static void main(String[] args) {
        WeatherReport report = new WeatherReport("Mumbai", 30.5, "Sunny");
        report.displayWeather();
    }
}