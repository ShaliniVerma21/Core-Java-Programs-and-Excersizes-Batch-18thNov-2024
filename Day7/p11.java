package Day7;
//Wave Patterns
public class p11 {
	//print a Square
	public static void main(String[] args) {
		for(int i=0;i<=6;i++)//outer loop represents rows
		{
			for(int j=0;j<=6;j++)//inner loop represents columns
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