package Excercize_6;

import java.util.Scanner;

// Circle Pattern with Solid Fill and Custom Character
public class Circle7 {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a character to draw the filled circle: ");
	        char ch = scanner.next().charAt(0);
	        int radius = 10; // Radius of the circle

	        for (int i = 0; i <= 2 * radius; i++) {
	            for (int j = 0; j <= 2 * radius; j++) {
	                double distance = Math.sqrt(Math.pow(i - radius, 2) + Math.pow(j - radius, 2));
	                if (distance <= radius) {
	                    System.out.print(ch);
	                } else {
	                    System.out.print(" ");
	                }
	            }
	            System.out.println();
	        }
	        scanner.close();
	    }
	}