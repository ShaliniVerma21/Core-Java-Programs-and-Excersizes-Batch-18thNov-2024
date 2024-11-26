package Day5;

import java.util.Scanner;

public class demo7 {

	public static void main(String[] args) {
		boolean condition;
		
		System.out.println("Enter condition value : true/false");
		Scanner sc = new Scanner(System.in);
		condition = sc.nextBoolean();
		
		switch(condition)
		{
		case true : 
			System.out.println("Condition is true.");
			break;
		case false : 
			System.out.println("Condition is false.");
			break;
		default : 
			System.out.println("Unexpected error.");
			break;
		}

	}

}
