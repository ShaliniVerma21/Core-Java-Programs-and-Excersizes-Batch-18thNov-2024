package Day4;

import java.util.Scanner;

//Conditional (Ternary) Operator
public class demo4 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        String result = (number % 2 == 0) ? "Even" : "Odd";
	        System.out.println("The number is: " + result);

	        scanner.close();
	    }
}
