package Day11;

class d {
	int a,b;
	
	public d(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	public void display()
	{
		System.out.println("\nValue of A : "+a
				+"\nValue of B : "+b);
	}
}

public class demo1 {
	public static void main(String[] args) {
	d obj = new d(4,5);
	
	obj.display();

	}

}
