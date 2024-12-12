package Day15;
//Common Array Operations
public class demo6 {
	    public static void main(String[] args) {
	        // Declare an array
	        int[] scores = {90, 80, 70, 60, 50};

	        // Print the length of the array
	        System.out.println("Length of the array: " + scores.length);

	        // Find the maximum value in the array
	        int max = scores[0];
	        for (int i = 1; 
	        i < scores.length; i++) {
	            if (scores[i] > max) {
	                max = scores[i];
	            }
	        }
	        System.out.println("Maximum value in the array: " + max);

	        // Find the minimum value in the array
	        int min = scores[0];
	        for (int i = 1; i < scores.length; i++) {
	            if (scores[i] < min) {
	                min = scores[i];
	            }
	        }
	        System.out.println("Minimum value in the array: " + min);

	        // Find the sum of all values in the array
	        int sum = 0;
	        for (int i = 0; i < scores.length; i++) {
	            sum += scores[i];
	        }
	        System.out.println("Sum of all values in the array: " + sum);

	        // Find the average of all values in the array
	        double average = (double) sum / scores.length;
	        System.out.println("Average of all values in the array: " + average);

	        // Sort the array in ascending order
	        for (int i = 0; i < scores.length; i++) {
	            for (int j = i + 1; j < scores.length; j++) {
	                if (scores[i] > scores[j]) {
	                    int temp = scores[i];
	                    scores[i] = scores[j];
	                    scores[j] = temp;
	                }
	            }
	        }
	        System.out.println("Array in ascending order: ");
	        for (int i = 0; i < scores.length; i++) {
	            System.out.print(scores[i] + " ");
	        }
	    }
	}