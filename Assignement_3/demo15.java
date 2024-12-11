package Assignement_3;
//Online Storyboard Creator 📜: Design storyboards for videos.

//Base class for Storyboard
class Storyboard {
 protected String title;
 protected String creator;
 protected int numberOfScenes;

 // Constructor
 public Storyboard(String title, String creator, int numberOfScenes) {
     this.title = title;
     this.creator = creator;
     this.numberOfScenes = numberOfScenes;
 }

 // Method to display storyboard details
 public void displayDetails() {
     System.out.println("Storyboard Title: " + title);
     System.out.println("Creator: " + creator);
     System.out.println("Number of Scenes: " + numberOfScenes);
 }

 // Method to export storyboard (simulated)
 public void exportStoryboard() {
     System.out.println("Exporting storyboard: " + title);
 }
}

//Derived class for VideoStoryboard
class VideoStoryboard extends Storyboard {
 private String[] scenes;
 private static int totalStoryboards = 0; // Static variable to keep track of total storyboards

 // Constructor
 public VideoStoryboard(String title, String creator, int numberOfScenes, String[] scenes) {
     super(title, creator, numberOfScenes);
     this.scenes = scenes;
     totalStoryboards++; // Increment total storyboards
 }

 // Method to display video storyboard details
 public void displayVideoStoryboardDetails() {
     displayDetails(); // Call the superclass method
     System.out.println("Scenes: ");
     for (String scene : scenes) {
         System.out.println("- " + scene);
     }
     System.out.println("Total Video Storyboards Created: " + getTotalStoryboards());
 }

 // Static method to get total storyboards
 public static int getTotalStoryboards() {
     return totalStoryboards;
 }

 // Recursive method to count total words in scenes
 public int countTotalWords(int sceneIndex) {
     if (sceneIndex < 0) {
         return 0; // Base case
     }
     return scenes[sceneIndex].split(" ").length + countTotalWords(sceneIndex - 1); // Recursive case
 }
}

//Final class for StoryboardReport
final class StoryboardReport {
 private String reportTitle;

 // Constructor
 public StoryboardReport(String reportTitle) {
     this.reportTitle = reportTitle;
 }

 // Method to display report
 public void displayReport() {
     System.out.println("Storyboard Report: " + reportTitle);
 }
}

//Main class
public class demo15 {
 public static void main(String[] args) {
     // Create scenes for the storyboard
     String[] scenes = {
         "Scene 1: Introduction to the main character.",
         "Scene 2: The character faces a challenge.",
         "Scene 3: The character overcomes the challenge.",
         "Scene 4: Conclusion and reflection."
     };

     // Create a video storyboard
     VideoStoryboard videoStoryboard = new VideoStoryboard("My First Video", "Alice", scenes.length, scenes);
     videoStoryboard.displayVideoStoryboardDetails();
     videoStoryboard.exportStoryboard();

     // Count total words in the scenes
     int totalWords = videoStoryboard.countTotalWords(scenes.length - 1);
     System.out.println("Total Words in the Storyboard: " + totalWords);

     // Create and display a storyboard report
     StoryboardReport report = new StoryboardReport("Monthly Storyboard Creation Report");
     report.displayReport();
 }
}