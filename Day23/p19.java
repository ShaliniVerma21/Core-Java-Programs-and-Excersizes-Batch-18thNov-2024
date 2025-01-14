package Day23;
/*
 11. Local Inner Class: Temperature Converter
Problem: Create a TemperatureConverter class that uses a local inner class to convert Celsius to Fahrenheit. 
 */
class TemperatureConverter {
    void convert(double celsius) {
        class Converter {
            double toFahrenheit() {
                return (celsius * 9/5) + 32;
            }
        }
        Converter converter = new Converter();
        System.out.println("Fahrenheit: " + converter.toFahrenheit()); // Output: Fahrenheit: <converted value>
    }
}

public class p19{
    public static void main(String[] args) {
        TemperatureConverter converter = new TemperatureConverter();
        converter.convert(25);
    }
}