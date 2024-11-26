package Day6;

import java.util.Scanner;

public class demo2 {
	//for loop example-2
	public static void main(String[] args) {
		//sum of first n numbers
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of n :\n");
		int n = sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum+=i;
		}
		System.out.println("Sum of first "+n+" Numbers are : "+sum);
	}

}
