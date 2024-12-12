package Day15;

public class demo3 {
	 public static void main(String[] args) {
	        // Declare an array
	        int[] scores;

	        // Initialize an array
	        scores = new int[5];

	        // Assign values to an array
	        scores[0] = 90;
	        scores[1] = 80;
	        scores[2] = 70;
	        scores[3] = 60;
	        scores[4] = 50;

	        // Access array elements
	        System.out.println("Score at index 0: " + scores[0]);

	        // Print all array elements
	        for (int i = 0; i < scores.length; i++) {
	            System.out.println("Score at index " + i + ": " + scores[i]);
	        }
	    }
	}