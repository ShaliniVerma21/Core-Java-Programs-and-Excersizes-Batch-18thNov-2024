package Excercize_6;

import java.util.Scanner;

//Circle Pattern with Different Radius
public class Circle8 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the radius of the circle: ");
	        int radius = scanner.nextInt();

	        for (int i = 0; i <= 2 * radius; i++) {
	            for (int j = 0; j <= 2 * radius; j++) {
	                double distance = Math.sqrt(Math.pow(i - radius, 2) + Math.pow(j - radius, 2));
	                if (distance >= radius - 0.5 && distance <= radius + 0.5) {
	                    System.out.print("*");
	                } else {
	                    System.out.print(" ");
	                }
	            }
	            System.out.println();
	        }
	        scanner.close();
	    }
	}