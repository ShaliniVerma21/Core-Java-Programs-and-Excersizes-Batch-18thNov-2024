package Day8;

import java.util.Scanner;

//Java Program to Check if a Number is Positive or Negative
public class p27 {
	public static void main(String[] args)   
	{  
	int num;  
	//object of the Scanner class  
	Scanner sc = new Scanner(System.in);  
	System.out.print("Enter a number: ");  
	//reading a number from the user  
	num = sc.nextInt();  
	//checks the number is greater than 0 or not  
	if(num>0)  
	{  
	System.out.println("The number is positive.");  
	}  
	//checks the number is less than 0 or not  
	else if(num<0)  
	{  
	System.out.println("The number is negative.");  
	}  
	//executes when the above two conditions return false  
	else  
	{  
	System.out.println("The number is zero.");  
	}  
  }  
}  