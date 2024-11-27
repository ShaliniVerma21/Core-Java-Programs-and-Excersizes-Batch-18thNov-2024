package Day7;
//Mixed Patterns
public class p9 {
	//print a triangle
			public static void main(String[] args) {
				for(int i=0;i<=6;i++)//outer loop represents rows
				{
					for(int j=0;j<=i;j++)//inner loop represents columns
					{
						if(j%2==0)
						{
							System.out.print("<^> ");
						}
						else
						{
							System.out.print(j+" ");
						}
					}
					System.out.println();//gives new line after 1 row
				}
			}
		}