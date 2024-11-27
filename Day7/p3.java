package Day7;

public class p3 {
	//print a opposite triangle
			public static void main(String[] args) {
				for(int i=6;i>=0;i--)//outer loop represents rows
				{
					for(int j=0;j<=i;j++)//inner loop represents columns
					{
						System.out.print("*");
					}
					System.out.println();//gives new line after 1 row
				}
			}
		}