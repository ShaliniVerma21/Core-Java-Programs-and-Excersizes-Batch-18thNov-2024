package Day12;
//static methods
public class demo3 {

	public static int add(int a , int b)
	{
		return a+b;
	}
	public static void main(String[] args) {
		int sum=add(2,3);
		int sum1 = demo3.add(2, 9);
		
		System.out.println(sum);
		System.out.println(sum1);
	}

}
