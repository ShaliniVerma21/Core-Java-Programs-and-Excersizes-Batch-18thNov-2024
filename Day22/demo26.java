package Day22;
//Multiplayer game (Ludo)

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

// Class representing a player in the Ludo game
class Player implements Runnable {
    private String name; // Player's name
    private int position; // Player's current position on the board
    private final Object lock; // Lock for synchronization

    public Player(String name, Object lock) {
        this.name = name; // Initialize player's name
        this.position = 0; // Initialize player's position
        this.lock = lock; // Initialize lock for synchronization
    }

    @Override
    public void run() {
        while (position < 100) { // Game continues until a player reaches position 100
            int diceRoll = rollDice(); // Roll the dice
            System.out.println(name + " rolled a " + diceRoll);
            move(diceRoll); // Move the player based on the dice roll

            // Synchronization to ensure only one player updates their position at a time
            synchronized (lock) {
                System.out.println(name + " is at position " + position);
                if (position >= 100) {
                    System.out.println(name + " has won the game!");
                }
            }

            try {
                Thread.sleep(1000); // Simulate time taken for the player's turn
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // Restore interrupted status
            }
        }
    }

    // Method to roll the dice
    private int rollDice() {
        Random random = new Random();
        return random.nextInt(6) + 1; // Return a random number between 1 and 6
    }

    // Method to move the player
    private void move(int steps) {
        position += steps; // Update the player's position
        if (position > 100) {
            position = 100; // Ensure position does not exceed 100
        }
    }
}

// Main class to execute the Ludo game
public class demo26 {
    public static void main(String[] args) {
        Object lock = new Object(); // Lock object for synchronization
        ExecutorService executor = Executors.newFixedThreadPool(4); // Thread pool for players

        // Create and start player threads
        for (int i = 1; i <= 4; i++) {
            Player player = new Player("Player " + i, lock);
            executor.submit(player); // Submit player to the executor
        }

        // Shutdown the executor service
        executor.shutdown();
        try {
            if (!executor.awaitTermination(30, TimeUnit.SECONDS)) {
                executor.shutdownNow(); // Force shutdown if not terminated
            }
        } catch (InterruptedException e) {
            executor.shutdownNow(); // Force shutdown on interruption
        }

        System.out.println("Ludo game has completed.");
    }
}