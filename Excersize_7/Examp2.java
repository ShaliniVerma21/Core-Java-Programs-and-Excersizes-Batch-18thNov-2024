package Excersize_7;

import java.util.Scanner;

public class Examp2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Candidate names and details
        String[] candidates = {"Candidate A", "Candidate B", "Candidate C"};
        String[] candidateDetails = {
            "Candidate A - Party X - Focus on education and healthcare.",
            "Candidate B - Party Y - Emphasis on economic growth.",
            "Candidate C - Party Z - Advocate for environmental policies."
        };
        int[] votes = new int[candidates.length]; // Array to keep track of votes for each candidate
        
        // Voter registration (using a simple array)
        String[] registeredVoters = {"Abhi", "Riya", "Trisha"};
        boolean[] hasVoted = new boolean[registeredVoters.length]; // Track if voters have voted
        
        // Prompt user for their name
        System.out.print("Enter your name: ");
        String voterName = scanner.nextLine();
        
        // Check if the voter is registered
        int voterIndex = -1;
        for (int i = 0; i < registeredVoters.length; i++) {
            if (registeredVoters[i].equalsIgnoreCase(voterName)) {
                voterIndex = i;
                break;
            }
        }

        if (voterIndex == -1) {
            System.out.println("You are not registered to vote. Please register first.");
            scanner.close();
            return;
        }

        // Check if the voter has already voted
        if (hasVoted[voterIndex]) {
            System.out.println("You have already voted. Thank you!");
            scanner.close();
            return;
        }

        // Prompt user for their age with input validation
        int age = -1; // Initialize age to an invalid value
        while (age < 0) {
            System.out.print("Enter your age: ");
            if (scanner.hasNextInt()) {
                age = scanner.nextInt();
                if (age < 0) {
                    System.out.println("Age cannot be negative. Please enter a valid age.");
                }
            } else {
                System.out.println("Invalid input. Please enter a numeric value for age.");
                scanner.next(); // Clear the invalid input
            }
        }

        // Check voting eligibility
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
            
            // Display candidates and their details
            System.out.println("\nCandidates:");
            for (int i = 0; i < candidates.length; i++) {
                System.out.printf("%d. %s%n", (i + 1), candidateDetails[i]);
            }
            
            // Get user vote
            int vote = -1; // Initialize vote to an invalid value
            while (vote < 1 || vote > candidates.length) {
                System.out.print("Enter your vote (1-" + candidates.length + "): ");
                if (scanner.hasNextInt()) {
                    vote = scanner.nextInt();
                    if (vote < 1 || vote > candidates.length) {
                        System.out.println("Invalid vote. Please enter a number between 1 and " + candidates.length + ".");
                    }
                } else {
                    System.out.println("Invalid input. Please enter a numeric value.");
                    scanner.next(); // Clear the invalid input
                }
            }

            // Process the vote
            votes[vote - 1]++; // Increment the vote for the selected candidate
            hasVoted[voterIndex] = true; // Mark the voter as having voted
            System.out.printf("Thank you, %s! You voted for %s.%n", voterName, candidates[vote - 1]);
        } else {
            System.out.println("You are not eligible to vote.");
        }

        // Display the results
        System.out.println("\nVoting Results:");
        for (int i = 0; i < candidates.length; i++) {
            System.out.printf("%s: %d votes%n", candidates[i], votes[i]);
        }

        // Close the scanner
        scanner.close();
    }
}