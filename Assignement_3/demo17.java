package Assignement_3;
//Traffic Analysis System 🚦: Analyze and display traffic patterns.

//Base class for TrafficData
class TrafficData {
 protected String location;
 protected int trafficVolume;
 protected int speedLimit;

 // Constructor
 public TrafficData(String location, int trafficVolume, int speedLimit) {
     this.location = location;
     this.trafficVolume = trafficVolume;
     this.speedLimit = speedLimit;
 }

 // Method to display traffic data
 public void displayTrafficData() {
     System.out.println("Location: " + location);
     System.out.println("Traffic Volume: " + trafficVolume);
     System.out.println("Speed Limit: " + speedLimit);
 }

 // Method to calculate traffic congestion
 public int calculateCongestion() {
     if (trafficVolume > 500) {
         return 1; // High congestion
     } else if (trafficVolume > 200) {
         return 2; // Medium congestion
     } else {
         return 3; // Low congestion
     }
 }
}

//Derived class for RoadTrafficData
class RoadTrafficData extends TrafficData {
 private int roadType; // 1 for highway, 2 for urban, 3 for rural
 private static int totalRoads = 0; // Static variable to keep track of total roads

 // Constructor
 public RoadTrafficData(String location, int trafficVolume, int speedLimit, int roadType) {
     super(location, trafficVolume, speedLimit);
     this.roadType = roadType;
     totalRoads++; // Increment total roads
 }

 // Method to display road traffic data
 public void displayRoadTrafficData() {
     displayTrafficData(); // Call the superclass method
     System.out.println("Road Type: " + getRoadType(roadType));
     System.out.println("Total Roads Created: " + getTotalRoads());
 }

 // Static method to get total roads
 public static int getTotalRoads() {
     return totalRoads;
 }

 // Method to get road type
 public String getRoadType(int roadType) {
     switch (roadType) {
         case 1:
             return "Highway";
         case 2:
             return "Urban";
         case 3:
             return "Rural";
         default:
             return "Unknown";
     }
 }

 // Recursive method to calculate traffic congestion based on road type
 public int calculateCongestionBasedOnRoadType(int roadType, int congestionLevel) {
     if (roadType == 1) {
         return congestionLevel + 1; // Highway congestion is higher
     } else if (roadType == 2) {
         return congestionLevel; // Urban congestion is medium
     } else {
         return congestionLevel - 1; // Rural congestion is lower
     }
 }
}

//Final class for TrafficReport
final class TrafficReport {
 private String reportTitle;

 // Constructor
 public TrafficReport(String reportTitle) {
     this.reportTitle = reportTitle;
 }

 // Method to display report
 public void displayReport() {
     System.out.println("Traffic Report: " + reportTitle);
 }
}

//Main class
public class demo17 {
 public static void main(String[] args) {
     // Create road traffic data
     RoadTrafficData roadTrafficData1 = new RoadTrafficData("Highway 101", 600, 65, 1);
     RoadTrafficData roadTrafficData2 = new RoadTrafficData("Urban Road", 300, 45, 2);

     // Display road traffic data
     roadTrafficData1.displayRoadTrafficData();
     roadTrafficData2.displayRoadTrafficData();

     // Calculate traffic congestion
     int congestionLevel1 = roadTrafficData1.calculateCongestion();
     int congestionLevel2 = roadTrafficData2.calculateCongestion();

     System.out.println("Traffic Congestion Level for Highway 101: " + congestionLevel1);
     System.out.println("Traffic Congestion Level for Urban Road: " + congestionLevel2);

     // Calculate traffic congestion based on road type
     int congestionLevelBasedOnRoadType1 = roadTrafficData1.calculateCongestionBasedOnRoadType(1, congestionLevel1);
     int congestionLevelBasedOnRoadType2 = roadTrafficData2.calculateCongestionBasedOnRoadType(2, congestionLevel2);

     System.out.println("Traffic Congestion Level Based on Road Type for Highway 101: " + congestionLevelBasedOnRoadType1);
     System.out.println("Traffic Congestion Level Based on Road Type for Urban Road: " + congestionLevelBasedOnRoadType2);

     // Create and display a traffic report
     TrafficReport report = new TrafficReport("Daily Traffic Analysis Report");
     report.displayReport();
 }
}