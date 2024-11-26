package Day5;

import java.util.Scanner;

public class demo3 {
//Using Ladder if-else-if
	public static void main(String[] args) {
		float Score;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("***************** Grades Checking System *********************");
		System.out.println("Enter Your Score please : ");
		Score = sc.nextFloat();
		
		if(Score>=90)
		{
			System.out.println("Your Grades : A");
		}
		else if(Score>=80)
		{
			System.out.println("Your Grades : B");
		}
		else if(Score>=70)
		{
			System.out.println("Your Grades : C");
		}
		else if(Score>=55)
		{
			System.out.println("Your Grades : D");
		}
		else
		{
			System.out.println("Your Grades : F");
		}
	}

}
