package Day15;

public class demo5 {
	 public static void main(String[] args) {
	        // Declare a 2D array
	        int[][] scores;

	        // Initialize a 2D array
	        scores = new int[3][4];

	        // Assign values to a 2D array
	        scores[0][0] = 90;
	        scores[0][1] = 80;
	        scores[0][2] = 70;
	        scores[0][3] = 60;
	        scores[1][0] = 50;
	        scores[1][1] = 40;
	        scores[1][2] = 30;
	        scores[1][3] = 20;
	        scores[2][0] = 10;
	        scores[2][1] = 0;
	        scores[2][2] = -10;
	        scores[2][3] = -20;

	        // Print all 2D array elements
	        for (int i = 0; i < scores.length; i++) {
	            for (int j = 0; j < scores[i].length; j++) {
	                System.out.println("Score at index [" + i + "][" + j + "]: " + scores[i][j]);
	            }
	        }
	    }
	}