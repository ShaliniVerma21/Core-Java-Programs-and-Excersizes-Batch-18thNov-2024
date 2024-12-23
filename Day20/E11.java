package Day20;
//Exception Handling
public class E11 {
	public static void main(String[] args) {
		//using try catch to handle exception
		int num1=10;
		int num2=0;
		try {
			System.out.println(num1+num2);
			System.out.println(num1-num2);
			System.out.println(num1*num2);
			System.out.println(num1/num2);//exception cured	
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println(num1&num2);
		System.out.println(num1|num2);
		System.out.println(num1==num2);
		System.out.println(num1!=num2);
		System.out.println(num1*=num2);
	}
}
