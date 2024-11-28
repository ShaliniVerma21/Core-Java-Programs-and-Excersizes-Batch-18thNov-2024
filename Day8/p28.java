package Day8;

import java.util.Scanner;

//Java Program to Find Smallest of Three Numbers Using Ternary Operator
public class p28 {
	public static void main(String[] args)   
	{  
	int a, b, c, smallest, temp;  
	//object of the Scanner class  
	Scanner sc = new Scanner(System.in);  
	//reading input from the user  
	System.out.println("Enter the first number:");  
	a = sc.nextInt();  
	System.out.println("Enter the second number:");  
	b = sc.nextInt();  
	System.out.println("Enter the third number:");  
	c = sc.nextInt();  
	//comparing a and b and storing the smallest number in a temp variable  
	temp=a<b?a:b;  
	//comparing the temp variable with c and storing the result in the variable names smallest  
	smallest=c<temp?c:temp;  
	//prints the smallest number  
	System.out.println("The smallest number is: "+smallest);  
	}  
}  