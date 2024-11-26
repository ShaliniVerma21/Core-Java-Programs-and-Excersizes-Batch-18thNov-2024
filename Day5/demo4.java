package Day5;

import java.util.Scanner;

public class demo4 {
//Using Nested if-else
	public static void main(String[] args) {
		int num;
		System.out.println("Enter a number : ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		if(num>=0)
		{
			System.out.println("Number is positive.");
			if(num%2==0)
			{
				System.out.println("Number is even");
			}
			else {
				System.out.println("Number is Odd");
			}
		}
		else
		{
			System.out.println("Number is negative.");
		}
	}

}
