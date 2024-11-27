package Excercize_6;
//Filled Circle Pattern
public class Circle2 {
	 public static void main(String[] args) {
	        int radius = 10; // Radius of the circle
	        for (int i = 0; i <= 2 * radius; i++) {
	            for (int j = 0; j <= 2 * radius; j++) {
	                double distance = Math.sqrt(Math.pow(i - radius, 2) + Math.pow(j - radius, 2));
	                if (distance <= radius) {
	                    System.out.print("*");
	                } else {
	                    System.out.print(" ");
	                }
	            }
	            System.out.println();
	        }
	    }
	}