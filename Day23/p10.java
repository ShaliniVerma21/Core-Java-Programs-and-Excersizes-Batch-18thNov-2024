package Day23;
/*
 2. Static Nested Class: Configuration Settings
Problem: Create a Configuration class with a static nested class Settings 
to manage application settings.
 */
class Configuration {
    private static String appName = "MyApp";

    static class Settings {
        void display() {
            System.out.println("Application Name: " + appName);
        }
    }
}

public class p10{
    public static void main(String[] args) {
        Configuration.Settings settings = new Configuration.Settings();
        settings.display(); // Output: Application Name: MyApp
    }
}