package Day5;

import java.util.Scanner;

public class demo5 {
//Using Switch Statement & Jump statement
	public static void main(String[] args) {
		int dayNum;
		String dayName;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter day Number to get Name : ");
		dayNum=sc.nextInt();
	
		switch(dayNum)
		{
		case 1 :
		{
			System.out.println("Day : Monday");
			break;
		}
		case 2 :
		{
			System.out.println("Day : Tuesday");
			break;
		}
		case 3 :
		{
			System.out.println("Day : Wednesday");
			break;
		}
		case 4 :
		{
			System.out.println("Day : Thursnday");
			break;
		}
		case 5 :
		{
			System.out.println("Day : Friday");
			break;
		}
		case 6 :
		{
			System.out.println("Day : Saturday");
			break;
		}
		case 7 :
		{
			System.out.println("Day : Sunday");
			break;
		}
		default:
		{
			System.out.println("Invalid Day Number");
		}
		}
	}

}
