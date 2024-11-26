package Day4;

import java.util.Scanner;

//MultiOperatorCalculator
public class demo9 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input two numbers
	        System.out.print("Enter first number: ");
	        int a = scanner.nextInt();
	        System.out.print("Enter second number: ");
	        int b = scanner.nextInt();

	        // Arithmetic Operations
	        int sum = a + b; // Addition
	        int difference = a - b; // Subtraction
	        int product = a * b; // Multiplication
	        double quotient = (double) a / b; // Division
	        int remainder = a % b; // Modulus

	        // Display Arithmetic Results
	        System.out.println("Arithmetic Operations:");
	        System.out.println("Sum: " + sum);
	        System.out.println("Difference: " + difference);
	        System.out.println("Product: " + product);
	        System.out.println("Quotient: " + quotient);
	        System.out.println("Remainder: " + remainder);

	        // Assignment Operations
	        int x = 10;
	        x += a; // x = x + a
	        System.out.println("\nAfter assignment operation (x += a): x = " + x);
	        
	        x -= b; // x = x - b
	        System.out.println("After assignment operation (x -= b): x = " + x);

	        // Increment and Decrement Operations
	        System.out.println("\nIncrement and Decrement Operations:");
	        System.out.println("Initial value of x: " + x);
	        System.out.println("Post-increment (x++): " + (x++)); // Post-increment
	        System.out.println("Value of x after post-increment: " + x);
	        System.out.println("Pre-increment (++x): " + (++x)); // Pre-increment
	        System.out.println("Post-decrement (x--): " + (x--)); // Post-decrement
	        System.out.println("Value of x after post-decrement: " + x);
	        System.out.println("Pre-decrement (--x): " + (--x)); // Pre-decrement

	        // Relational Operations
	        System.out.println("\nRelational Operations:");
	        System.out.println("Is a > b? " + (a > b));
	        System.out.println("Is a < b? " + (a < b));
	        System.out.println("Is a == b? " + (a == b));
	        System.out.println("Is a != b? " + (a != b));

	        // Conditional Operator
	        String result = (a > b) ? "a is greater than b" : "b is greater than or equal to a";
	        System.out.println("\nConditional Operator Result: " + result);

	        // Logical Operations
	        boolean isPositiveA = a > 0;
	        boolean isPositiveB = b > 0;
	        System.out.println("\nLogical Operations:");
	        System.out.println("Is a positive AND b positive? " + (isPositiveA && isPositiveB));
	        System.out.println("Is a positive OR b positive? " + (isPositiveA || isPositiveB));

	        // Bitwise Operations
	        System.out.println("\nBitwise Operations:");
	        System.out.println("a & b: " + (a & b)); // Bitwise AND
	        System.out.println("a | b: " + (a | b)); // Bitwise OR
	        System.out.println("a ^ b: " + (a ^ b)); // Bitwise XOR
	        System.out.println("~a: " + (~a)); // Bitwise NOT

	        // Ternary Operator
	        int max = (a > b) ? a : b;
	        System.out.println("\nTernary Operator Result: Maximum of a and b is " + max);

	        // Precedence and Associativity
	        int precedenceResult = a + b * 2 - (a / 2); // Demonstrating precedence
	        System.out.println("\nPrecedence and Associativity Result: " + precedenceResult);
	        
	        // Close the scanner
	        scanner.close();
	    }
}
