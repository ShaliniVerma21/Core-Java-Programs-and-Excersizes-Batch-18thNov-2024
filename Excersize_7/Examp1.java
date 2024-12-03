package Excersize_7;

import java.util.Scanner;

// Simple Quiz Application
public class Examp1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        int totalQuestions = 5; // Updated total questions

        // Arrays to hold questions, options, and correct answers
        String[] questions = {
            "What is the capital of France?",
            "What is 5 + 7?",
            "What is the largest planet in our solar system?",
            "What is the currency of Japan?",
            "Which element has the chemical symbol 'O'?"
        };

        String[][] options = {
            {"1. Berlin", "2. Madrid", "3. Paris"},
            {"1. 10", "2. 12", "3. 15"},
            {"1. Earth", "2. Jupiter", "3. Mars"},
            {"1. Yen", "2. Dollar", "3. Euro"},
            {"1. Oxygen", "2. Gold", "3. Silver"}
        };

        int[] correctAnswers = {3, 2, 2, 1, 1}; // Correct answers for each question

        System.out.println("Welcome to the Quiz!");

        // Loop through each question
        for (int i = 0; i < totalQuestions; i++) {
            System.out.printf("\nQuestion %d: %s%n", (i + 1), questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }
            System.out.print("Your answer: ");
            int userAnswer = scanner.nextInt();

            // Check if the answer is correct
            if (userAnswer == correctAnswers[i]) {
                score++; // Increment score for the correct answer
                System.out.println("Correct!");
            } else {
                System.out.println("Incorrect! The correct answer was: " + correctAnswers[i]);
            }
        }

        // Display total score
        System.out.printf("%nYour total score is: %d out of %d%n", score, totalQuestions);
        displayScoreCard(score, totalQuestions);

        scanner.close(); // Close the scanner
    }

    // Method to display scorecard
    private static void displayScoreCard(int score, int totalQuestions) {
        System.out.println("\nScore Card:");
        System.out.println("-------------------------------------------------");
        System.out.printf("Total Questions: %d%n", totalQuestions);
        System.out.printf("Correct Answers: %d%n", score);
        System.out.printf("Incorrect Answers: %d%n", totalQuestions - score);
        System.out.println("-------------------------------------------------");
        
        // Provide feedback based on score
        if (score == totalQuestions) {
            System.out.println("Excellent! You got all answers right!");
        } else if (score >= totalQuestions / 2) {
            System.out.println("Good job! You passed the quiz.");
        } else {
            System.out.println("Better luck next time!");
        }
    }
}