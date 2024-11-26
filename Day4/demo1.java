package Day4;

import java.util.Scanner;
//Arithmetic Operators
public class demo1 {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter first number: ");
	        double num1 = scanner.nextDouble();
	        System.out.print("Enter second number: ");
	        double num2 = scanner.nextDouble();

	        System.out.println("Addition: " + (num1 + num2));
	        System.out.println("Subtraction: " + (num1 - num2));
	        System.out.println("Multiplication: " + (num1 * num2));
	        System.out.println("Division: " + (num1 / num2));
	        System.out.println("Modulus: " + (num1 % num2));

	        scanner.close();
	    }
}
