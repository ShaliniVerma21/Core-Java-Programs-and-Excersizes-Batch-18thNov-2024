package Excercize_6;
//Circle Pattern with Gradient Effect
public class Circle6 {
	  public static void main(String[] args) {
	        int radius = 10; // Radius of the circle
	        char[] chars = {' ', '.', '*', '#', '@'}; // Gradient characters

	        for (int i = 0; i <= 2 * radius; i++) {
	            for (int j = 0; j <= 2 * radius; j++) {
	                double distance = Math.sqrt(Math.pow(i - radius, 2) + Math.pow(j - radius, 2));
	                if (distance <= radius) {
	                    int index = (int) (distance / (radius / chars.length));
	                    System.out.print(chars[Math.min(index, chars.length - 1)]);
	                } else {
	                    System.out.print(" ");
	                }
	            }
	            System.out.println();
	        }
	    }
	}