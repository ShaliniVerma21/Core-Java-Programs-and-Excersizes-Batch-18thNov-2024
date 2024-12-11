package Assignement_3;
//Music Composition Tool 🎼: Write and export musical scores.

//Base class for MusicalScore
class MusicalScore {
 protected String title;
 protected String composer;
 protected int numberOfMeasures;

 // Constructor
 public MusicalScore(String title, String composer, int numberOfMeasures) {
     this.title = title;
     this.composer = composer;
     this.numberOfMeasures = numberOfMeasures;
 }

 // Method to display score details
 public void displayScoreDetails() {
     System.out.println("Title: " + title);
     System.out.println("Composer: " + composer);
     System.out.println("Number of Measures: " + numberOfMeasures);
 }

 // Method to export score (simulated)
 public void exportScore() {
     System.out.println("Exporting score: " + title);
 }
}

//Derived class for OrchestralScore
class OrchestralScore extends MusicalScore {
 private String[] instruments;
 private static int totalScores = 0; // Static variable to keep track of total scores

 // Constructor
 public OrchestralScore(String title, String composer, int numberOfMeasures, String[] instruments) {
     super(title, composer, numberOfMeasures);
     this.instruments = instruments;
     totalScores++; // Increment total scores
 }

 // Method to display orchestral score details
 public void displayOrchestralScoreDetails() {
     displayScoreDetails(); // Call the superclass method
     System.out.print("Instruments: ");
     for (String instrument : instruments) {
         System.out.print(instrument + " ");
     }
     System.out.println();
     System.out.println("Total Orchestral Scores Created: " + getTotalScores());
 }

 // Static method to get total scores
 public static int getTotalScores() {
     return totalScores;
 }

 // Recursive method to calculate total notes (for demonstration)
 public int calculateTotalNotes(int notesPerMeasure) {
     if (numberOfMeasures >= 0) {
         return 0; // Base case
     }
     return notesPerMeasure + calculateTotalNotes(notesPerMeasure); // Recursive case
 }
}

//Final class for ScoreReport
final class ScoreReport {
 private String reportTitle;

 // Constructor
 public ScoreReport(String reportTitle) {
     this.reportTitle = reportTitle;
 }

 // Method to display report
 public void displayReport() {
     System.out.println("Score Report: " + reportTitle);
 }
}

//Main class
public class demo14 {
 public static void main(String[] args) {
     // Create an orchestral score
     String[] instruments = {"Violin", "Flute", "Trumpet"};
     OrchestralScore score1 = new OrchestralScore("Symphony No. 1", "John Doe", 4, instruments);
     score1.displayOrchestralScoreDetails();
     score1.exportScore();

     // Calculate total notes in the score
     int totalNotes = score1.calculateTotalNotes(8); // Assuming 8 notes per measure
     System.out.println("Total Notes in the Score: " + totalNotes);

     // Create and display a score report
     ScoreReport report = new ScoreReport("Monthly Musical Score Report");
     report.displayReport();
 }
}