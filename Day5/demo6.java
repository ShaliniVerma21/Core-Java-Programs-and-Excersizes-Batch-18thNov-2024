package Day5;

import java.util.Scanner;

public class demo6 {

	public static void main(String[] args) {
		String fruit;
		System.out.println("Enter fruit you selected : ");
		Scanner sc = new Scanner(System.in);
		fruit = sc.next();
		
		switch(fruit)
		{
		case "apple": 
			System.out.println("You selected Apple.");
			break;
		case "kiwi": 
			System.out.println("You selected Kiwi.");
			break;
		case "banana": 
			System.out.println("You selected Banana.");
			break;
		case "grapes": 
			System.out.println("You selected Grapes.");
			break;
		case "jackfruit": 
			System.out.println("You selected Jackfruit.");
			break;
		default: 
			System.out.println("Enter a valid name");
			break;
		}
	}

}
