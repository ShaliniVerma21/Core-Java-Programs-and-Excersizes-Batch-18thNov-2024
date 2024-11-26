package Day5;

import java.util.Scanner;

public class demo2 {
//Using if-else Statement
	public static void main(String[] args) {
		int age;
		boolean isCitizen;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("************ Voting System ********************");
		
		System.out.println("Enter Your Age : ");
		age=sc.nextInt();
		
		System.out.println("Are you Citizen of India :  true/false ?");
		isCitizen=sc.nextBoolean();
		
		//Check eligibility
		if(age>=18 && isCitizen)
		{
			System.out.println("You are eligible for voting");
		}
		else {
			System.out.println("You are not eligible for voting");
		}
		
	}

}
