package Day3;

import java.util.Scanner;

public class demo4 {

	public static void main(String[] args) {
		//student information
		
		String Name;
		int Age;
		float Coursefee;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter your Name : ");
		Name=sc.next();
		
		System.out.println("Enter your Age : ");
		Age=sc.nextInt();
		
		System.out.println("Enter your Coursefee : ");
		Coursefee=sc.nextFloat();
		
		System.out.println("Your Information is : \n");
		System.out.println("Name : "+Name
				+"\n"
				+"Age : "+Age
				+"\n"
				+"Coursefee : "+Coursefee);

	}

}						
