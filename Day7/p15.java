package Day7;
//Number Pattern-3
public class p15 {
	//print a triangle
		public static void main(String[] args) {
			int count=1;
			for(int i=1;i<6;i++)//outer loop represents rows
			{
				for(int j=1;j<=i;j++)//inner loop represents columns
				{
					System.out.print(count+" ");
					count++;
				}
				System.out.println();//gives new line after 1 row
			}
		}
	}