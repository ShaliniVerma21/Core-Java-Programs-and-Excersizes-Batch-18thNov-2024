package Day7;

public class p1 {
//print a basic pattern
	public static void main(String[] args) {
		for(int i=0;i<=4;i++)//outer loop represents rows
		{
			for(int j=0;j<=10;j++)//inner loop represents columns
			{
				System.out.print("*");
			}
			System.out.println();//gives new line after 1 row
		}
	}
}