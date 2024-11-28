package Day8;

import java.util.Scanner;

//Java Program to Swap Two Numbers Using Bitwise Operator
public class p3 {
	public static void main(String args[])  
	{  
	int a, b;  
	Scanner scanner = new Scanner(System.in);  
	System.out.print("Enter the first number: ");  
	a = scanner.nextInt();  
	System.out.print("Enter the second number: ");  
	b = scanner.nextInt();  
	System.out.println("Before swapping:");  
	System.out.println("a = " +a +", b = " +b);  
	a = a ^ b;  
	b = a ^ b;  
	a = a ^ b;  
	System.out.println("After swapping:");  
	System.out.print("a = " +a +", b = " +b);  
	}  
}  