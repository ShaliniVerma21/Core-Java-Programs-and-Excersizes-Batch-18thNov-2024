package Day7;
//Number Pattern-5
public class p17 {
	//print a triangle
	public static void main(String[] args) {
		int count=9;
		for(int i=1;i<5;i++)//outer loop represents rows
		{
			for(int j=1;j<=i;j++)//inner loop represents columns
			{
				if(count%2==0)
				{
				System.out.print(count+" ");
				count--;
				}
				else
				{
					System.out.print(count*2+" ");
					count--;
				}
			}
			System.out.println();//gives new line after 1 row
		}
	}
}