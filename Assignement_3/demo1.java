package Assignement_3;
//Online Survey Platform 📋: Collect and analyze user responses.

//Base class for a Survey
class Survey {
 private String title;
 private String description;

 // Constructor
 public Survey(String title, String description) {
     this.title = title;
     this.description = description;
 }

 // Method to display survey details
 public void displaySurvey() {
     System.out.println("Survey Title: " + title);
     System.out.println("Description: " + description);
 }
}

//Derived class for a UserSurvey
class UserSurvey extends Survey {
 private String userName;
 String[] responses;
 private static int responseCount = 0; // Static variable to keep track of responses

 // Constructor
 public UserSurvey(String title, String description, String userName, int numberOfQuestions) {
     super(title, description);
     this.userName = userName;
     this.responses = new String[numberOfQuestions];
 }

 // Method to collect user response
 public void collectResponse(int questionIndex, String response) {
     if (questionIndex >= 0 && questionIndex < responses.length) {
         responses[questionIndex] = response;
         responseCount++;
     } else {
         System.out.println("Invalid question index.");
     }
 }

 // Method to display user responses
 public void displayResponses() {
     System.out.println("Responses for " + userName + ":");
     for (int i = 0; i < responses.length; i++) {
         System.out.println("Question " + (i + 1) + ": " + responses[i]);
     }
 }

 // Recursive method to count total responses
 public int countTotalResponses(int index) {
     if (index < 0) {
         return 0;
     }
     return 1 + countTotalResponses(index - 1);
 }

 // Static method to get total response count
 public static int getTotalResponseCount() {
     return responseCount;
 }
}

//Final class for a SurveyReport
final class SurveyReport {
 private String reportTitle;

 // Constructor
 public SurveyReport(String reportTitle) {
     this.reportTitle = reportTitle;
 }

 // Method to display report
 public void displayReport() {
     System.out.println("Survey Report: " + reportTitle);
 }
}

//Main class
public class demo1 {
 public static void main(String[] args) {
     // Create a survey
     Survey survey = new Survey("Customer Satisfaction", "A survey to gauge customer satisfaction levels.");
     survey.displaySurvey();

     // Create a user survey
     UserSurvey userSurvey = new UserSurvey("Customer Satisfaction", "A survey to gauge customer satisfaction levels.", "Alice", 3);
     userSurvey.collectResponse(0, "Very Satisfied");
     userSurvey.collectResponse(1, "Satisfied");
     userSurvey.collectResponse(2, "Neutral");

     // Display user responses
     userSurvey.displayResponses();
  
     // Count total responses using recursion
     int totalResponses = userSurvey.countTotalResponses(userSurvey.responses.length - 1);
     System.out.println("Total Responses: " + totalResponses);

     // Display total response count using static method
     System.out.println("Total Responses Count (Static): " + UserSurvey.getTotalResponseCount());

     // Create and display a survey report
     SurveyReport report = new SurveyReport("Monthly Survey Report");
     report.displayReport();
 }
}