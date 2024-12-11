package Assignement_3;
//Air Quality Tracker 🌬️: Monitor pollution levels in real-time.

//Air Quality Tracker 
 class AirQualityTracker {
 private double pm25Level; // particulate matter 2.5 micrometers
 private double pm10Level; // particulate matter 10 micrometers
 private double no2Level; // nitrogen dioxide
 private double o3Level; // ozone
 private String location;

 // Constructor
 public AirQualityTracker(String location) {
     this.location = location;
     this.pm25Level = 0.0;
     this.pm10Level = 0.0;
     this.no2Level = 0.0;
     this.o3Level = 0.0;
 }

 // Method to update pollution levels
 public void updatePollutionLevels(double pm25, double pm10, double no2, double o3) {
     this.pm25Level = pm25;
     this.pm10Level = pm10;
     this.no2Level = no2;
     this.o3Level = o3;
 }

 // Method to retrieve pollution levels
 public void getPollutionLevels() {
     System.out.println("Location: " + location);
     System.out.println("PM2.5 Level: " + pm25Level);
     System.out.println("PM10 Level: " + pm10Level);
     System.out.println("NO2 Level: " + no2Level);
     System.out.println("O3 Level: " + o3Level);
 }

 // Method to calculate air quality index
 public int calculateAirQualityIndex() {
     // Simple calculation for demonstration purposes
     int airQualityIndex = (int) ((pm25Level + pm10Level + no2Level + o3Level) / 4);
     return airQualityIndex;
 }

 // Method to display air quality status
 public void displayAirQualityStatus() {
     int airQualityIndex = calculateAirQualityIndex();
     if (airQualityIndex < 50) {
         System.out.println("Air Quality: Good");
     } else if (airQualityIndex < 100) {
         System.out.println("Air Quality: Moderate");
     } else {
         System.out.println("Air Quality: Poor");
     }
 }

 // Static method to display general information about air quality
 public static void displayGeneralInformation() {
     System.out.println("Air quality is an important aspect of our environment.");
     System.out.println("Poor air quality can have serious health effects.");
 }

 // Final method to display warning message
 public final void displayWarningMessage() {
     System.out.println("Warning: Poor air quality detected!");
 }

 // Method to demonstrate recursion
 public void demonstrateRecursion(int n) {
     if (n > 0) {
         System.out.println("Recursion level: " + n);
         demonstrateRecursion(n - 1);
     }
 }

 // Method to demonstrate this keyword
 public void demonstrateThisKeyword() {
     System.out.println("This keyword example:");
     System.out.println("Location: " + this.location);
 }

 // Method to demonstrate super keyword
 public void demonstrateSuperKeyword() {
     System.out.println("Super keyword example:");
     // This method will be overridden in the subclass
 }
}

//Subclass to demonstrate inheritance
class SpecificAirQualityTracker extends AirQualityTracker {
 private String specificPollutant;

 // Constructor
 public SpecificAirQualityTracker(String location, String specificPollutant) {
     super(location);
     this.specificPollutant = specificPollutant;
 }

 // Method to override demonstrateSuperKeyword method
 @Override
 public void demonstrateSuperKeyword() {
     System.out.println("Super keyword example in subclass:");
     System.out.println("Specific pollutant: " + this.specificPollutant);
 }
}

public class demo18 {
 public static void main(String[] args) {
     AirQualityTracker airQualityTracker = new AirQualityTracker("City Center");
     airQualityTracker.updatePollutionLevels(10.0, 20.0, 30.0, 40.0);
     airQualityTracker.getPollutionLevels();
     airQualityTracker.displayAirQualityStatus();
     AirQualityTracker.displayGeneralInformation();
     airQualityTracker.displayWarningMessage();
     airQualityTracker.demonstrateRecursion(5);
     airQualityTracker.demonstrateThisKeyword();

     SpecificAirQualityTracker specificAirQualityTracker = new SpecificAirQualityTracker("City Center", "PM2.5");
     specificAirQualityTracker.demonstrateSuperKeyword();
 }
}