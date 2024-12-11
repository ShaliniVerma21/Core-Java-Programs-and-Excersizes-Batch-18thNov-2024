package Assignement_3;
//Trivia Game 🎲: Test knowledge on various topics.

import java.util.Scanner;

// Interface for Trivia Operations
interface TriviaOperations {
    void addQuestion(String question, String answer);
    void displayQuestions();
    boolean checkAnswer(int questionIndex, String userAnswer);
}

// Abstract class for Game
abstract class Game {
    protected String gameName;

    public Game(String gameName) {
        this.gameName = gameName;
    }

    public abstract void startGame();
}

// Concrete class for TriviaGame
class TriviaGame extends Game implements TriviaOperations {
    private String[] questions;
    private String[] answers;
    private int questionCount;

    public TriviaGame(String gameName) {
        super(gameName);
        this.questions = new String[10]; // Maximum 10 questions
        this.answers = new String[10];
        this.questionCount = 0;
    }

    @Override
    public void addQuestion(String question, String answer) {
        if (questionCount < questions.length) {
            questions[questionCount] = question;
            answers[questionCount] = answer;
            questionCount++;
            System.out.println("Question added: " + question);
        } else {
            System.out.println("Question limit reached.");
        }
    }

    @Override
    public void displayQuestions() {
        System.out.println("Trivia Questions:");
        for (int i = 0; i < questionCount; i++) {
            System.out.println((i + 1) + ". " + questions[i]);
        }
    }

    @Override
    public boolean checkAnswer(int questionIndex, String userAnswer) {
        return answers[questionIndex].equalsIgnoreCase(userAnswer);
    }

    @Override
    public void startGame() {
        System.out.println("Starting the trivia game: " + gameName);
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < questionCount; i++) {
            System.out.println(questions[i]);
            String userAnswer = scanner.nextLine();
            if (checkAnswer(i, userAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("Wrong! The correct answer is: " + answers[i]);
            }
        }
        scanner.close();
    }
}

// Main class
public class demo21 {
    public static void main(String[] args) {
        TriviaGame triviaGame = new TriviaGame("General Knowledge Trivia");

        // Adding questions
        triviaGame.addQuestion("What is the capital of France?", "Paris");
        triviaGame.addQuestion("What is 2 + 2?", "4");
        triviaGame.addQuestion("What is the largest planet in our solar system?", "Jupiter");

        // Display questions
        triviaGame.displayQuestions();

        // Start the game
        triviaGame.startGame();
    }
}