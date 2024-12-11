package Assignement_3;
//Online Examination System 🖥️: Manage tests, questions, and scores.

//Abstract class representing a Question
abstract class Question {
 protected String questionText;
 protected String[] options;
 protected int correctOption;

 // Constructor
 public Question(String questionText, String[] options, int correctOption) {
     this.questionText = questionText;
     this.options = options;
     this.correctOption = correctOption;
 }

 // Abstract method to display the question
 public abstract void displayQuestion();

 // Method to check if the answer is correct
 public boolean isCorrect(int selectedOption) {
     return selectedOption == correctOption;
 }
}

//Concrete class representing a Multiple Choice Question
class MultipleChoiceQuestion extends Question {
 // Constructor
 public MultipleChoiceQuestion(String questionText, String[] options, int correctOption) {
     super(questionText, options, correctOption);
 }

 // Method to display the question
 @Override
 public void displayQuestion() {
     System.out.println(questionText);
     for (int i = 0; i < options.length; i++) {
         System.out.println((i + 1) + ". " + options[i]);
     }
 }
}

//Class representing a Test
class Test {
 private String testName;
 private Question[] questions;
 private int questionCount;

 // Constructor
 public Test(String testName, int capacity) {
     this.testName = testName;
     this.questions = new Question[capacity];
     this.questionCount = 0;
 }

 // Method to add a question to the test
 public void addQuestion(Question question) {
     if (questionCount < questions.length) {
         questions[questionCount] = question;
         questionCount++;
         System.out.println("Question added to the test: " + question.questionText);
     } else {
         System.out.println("Test is full. Cannot add more questions.");
     }
 }

 // Method to conduct the test
 public void conductTest() {
     System.out.println("Starting Test: " + testName);
     int score = 0;

     for (Question question : questions) {
         if (question != null) {
             question.displayQuestion();
             // Simulate user input (for demonstration purposes, we use a random answer)
             int userAnswer = (int) (Math.random() * question.options.length);
             System.out.println("Your answer: " + (userAnswer + 1));
             if (question.isCorrect(userAnswer)) {
                 score++;
                 System.out.println("Correct!\n");
             } else {
                 System.out.println("Wrong! Correct answer: " + (question.correctOption + 1) + "\n");
             }
         }
     }

     System.out.println("Test completed. Your score: " + score + "/" + questionCount);
 }
}

//Main class to manage the online examination system
public class demo4 {
 public static void main(String[] args) {
     // Create a test
     Test mathTest = new Test("Math Test", 5);

     // Create questions
     String[] options1 = {"2", "3", "4", "5"};
     Question q1 = new MultipleChoiceQuestion("What is 2 + 2?", options1, 2);

     String[] options2 = {"5", "6", "7", "8"};
     Question q2 = new MultipleChoiceQuestion("What is 3 + 4?", options2, 0);

     // Add questions to the test
     mathTest.addQuestion(q1);
     mathTest.addQuestion(q2);

     // Conduct the test
     mathTest.conductTest();
 }
}