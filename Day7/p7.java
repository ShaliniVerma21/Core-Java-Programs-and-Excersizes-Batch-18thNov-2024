package Day7;
//Stars/Symbole Patterns
public class p7 {
	//print a triangle
			public static void main(String[] args) {
				for(int i=0;i<=6;i++)//outer loop represents rows
				{
					for(int j=0;j<=i;j++)//inner loop represents columns
					{
						System.out.print("~^~ ");
					}
					System.out.println();//gives new line after 1 row
				}
			}
		}