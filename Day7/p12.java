package Day7;
//Wave Patterns
public class p12 {
	//print a triangle
		public static void main(String[] args) {
			for(int i=0;i<=6;i++)//outer loop represents rows
			{
				for(int j=0;j<=i;j++)//inner loop represents columns
				{
					if(i%2==0)
					{
						System.out.print("~ ");
					}
					else
					{
						System.out.print(" ");
					}
				}
				System.out.println();//gives new line after 1 row
			}
			
			for(int i=6;i>=0;i--)//outer loop represents rows
			{
				for(int j=0;j<=i;j++)//inner loop represents columns
				{
					if(i%2==0)
					{
						System.out.print("~ ");
					}
					else
					{
						System.out.print(" ");
					}
				}
				System.out.println();//gives new line after 1 row
			}
		}
	}