package Day13;

//Compile-time polymorphism(achieved via method overloading)
//1. by changing number of arguments

class Product{
	
	   //method-1
		public int order(int p1,int p2)
		{
			return p1+p2;
		}
		
		//method-2
		public int order(int p1,int p2,int p3)
		{
			return p1+p2+p3;
		}
		
		//method-3
		public int order(int p1,int p2,int p3,int p4)
		{
			return p1+p2+p3+p4;
		}
		
		//method-4
		public int order(int p1,int p2,int p3,int p4, int p5)
		{
			return p1+p2+p3+p4+p5;
		}
	
}


public class demo2 {
	public static void main(String[] args) {
	Product p = new Product();

	System.out.println("Order-1 Total prize is : "+p.order(200, 200));
	System.out.println("Order-2 Total prize is : "+p.order(200, 200,200));
	System.out.println("Order-3 Total prize is : "+p.order(200, 200,200,200));
	System.out.println("Order-4 Total prize is : "+p.order(200, 200,200,200,200));
	}

}
