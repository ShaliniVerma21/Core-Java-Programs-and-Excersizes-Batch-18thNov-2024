package Day3;

import java.util.Scanner;

public class demo3 {

	public static void main(String[] args) {
		// addition of 2 numbers via user input
		
		int num1,num2,result;
		
		//scanner class used for user input
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter value of num1 : ");
		num1=sc.nextInt();
		
		System.out.println("Enter value of num2 : ");
		num2=sc.nextInt();
		
		//calculate
		result=num1+num2;
		
		System.out.println("Result is: "+result);
	}

}
