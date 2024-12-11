package Assignement_3;
//Social Media Sentiment Tracker 🗨️: Analyze public sentiment online.

//Base class for SocialMediaPost
class SocialMediaPost {
 protected String username;
 protected String content;
 protected int likes;

 // Constructor
 public SocialMediaPost(String username, String content) {
     this.username = username;
     this.content = content;
     this.likes = 0; // Default likes
 }

 // Method to display post details
 public void displayPost() {
     System.out.println(":User  " + username);
     System.out.println("Content: " + content);
     System.out.println("Likes: " + likes);
 }

 // Method to like the post
 public void likePost() {
     likes++;
     System.out.println(username + "'s post liked! Total likes: " + likes);
 }
}

//Derived class for SentimentPost
class SentimentPost extends SocialMediaPost {
 private String sentiment; // Positive, Negative, Neutral
 private static int totalPosts = 0; // Static variable to keep track of total posts

 // Constructor
 public SentimentPost(String username, String content, String sentiment) {
     super(username, content);
     this.sentiment = sentiment;
     totalPosts++; // Increment total posts
 }

 // Method to display sentiment post details
 public void displaySentimentPost() {
     displayPost(); // Call the superclass method
     System.out.println("Sentiment: " + sentiment);
     System.out.println("Total Sentiment Posts Created: " + getTotalPosts());
 }

 // Static method to get total posts
 public static int getTotalPosts() {
     return totalPosts;
 }

 // Recursive method to analyze sentiment based on keywords
 public int analyzeSentiment(String[] positiveWords, String[] negativeWords, int index) {
     if (index < 0) {
         return 0; // Base case
     }
     int count = 0;
     String[] words = content.split(" ");
     for (String word : words) {
         if (word.equalsIgnoreCase(positiveWords[index])) {
             count++;
         } else if (word.equalsIgnoreCase(negativeWords[index])) {
             count--;
         }
     }
     return count + analyzeSentiment(positiveWords, negativeWords, index - 1); // Recursive case
 }
}

//Final class for SentimentReport
final class SentimentReport {
 private String reportTitle;

 // Constructor
 public SentimentReport(String reportTitle) {
     this.reportTitle = reportTitle;
 }

 // Method to display report
 public void displayReport() {
     System.out.println("Sentiment Report: " + reportTitle);
 }
}

//Main class
public class demo16 {
 public static void main(String[] args) {
     // Create sentiment posts
     SentimentPost post1 = new SentimentPost("Alice", "I love sunny days!", "Positive");
     SentimentPost post2 = new SentimentPost("Bob", "I hate traffic jams.", "Negative");

     // Display sentiment post details
     post1.displaySentimentPost();
     post1.likePost();
     post2.displaySentimentPost();
     post2.likePost();

     // Analyze sentiment
     String[] positiveWords = {"love", "happy", "great"};
     String[] negativeWords = {"hate", "sad", "bad"};

     int sentimentScore1 = post1.analyzeSentiment(positiveWords, negativeWords, positiveWords.length - 1);
     int sentimentScore2 = post2.analyzeSentiment(positiveWords, negativeWords, positiveWords.length - 1);

     System.out.println("Sentiment Score for Post 1: " + sentimentScore1);
     System.out.println("Sentiment Score for Post 2: " + sentimentScore2);

     // Create and display a sentiment report
     SentimentReport report = new SentimentReport("Weekly Social Media Sentiment Analysis");
     report.displayReport();
 }
}