package Day15;

public class demo4 {
	 public static void main(String[] args) {
	        // Static initialization
	        int[] scoresStatic = {90, 80, 70, 60, 50};

	        // Dynamic initialization
	        int[] scoresDynamic = new int[5];
	        scoresDynamic[0] = 90;
	        scoresDynamic[1] = 80;
	        scoresDynamic[2] = 70;
	        scoresDynamic[3] = 60;
	        scoresDynamic[4] = 50;

	        // Print all array elements
	        System.out.println("\nStatic Initialization:");
	        for (int i = 0; i < scoresStatic.length; i++) {
	            System.out.println("Score at index " + i + ": " + scoresStatic[i]);
	        }

	        System.out.println("\n Dynamic Initialization:");
	        for (int i = 0; i < scoresDynamic.length; i++) {
	            System.out.println("Score at index " + i + ": " + scoresDynamic[i]);
	        }
	    }
	}