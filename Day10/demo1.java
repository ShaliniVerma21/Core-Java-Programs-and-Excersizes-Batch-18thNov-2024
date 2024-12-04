package Day10;

public class demo1 {

	//non return type method (no arguments/non parameterized)
	void greetings()
	{
		System.out.println("Good Morning");
	}
	
	// static non return type method (no arguments/non parameterized)
	static void greetings1()
	{
		System.out.println("Good Afternoon");
	}
	
	//non return type method (arguments/parameterized)
	void greet(String name, int age)
	{
		System.out.println("Hello "+name+"! You are "+age+" years old....");
	}
	
//static non return type method (arguments/parameterized)
	static void greet1(String name, int age)
		{
			System.out.println("Hello "+name+"! You are "+age+" years old....");
		}
	
	//return type method (arguments/parameterized)
	 public int add(int a,int b)
	 {
		 return a+b;
	 }
	 
	//static return type method (arguments/parameterized)
		 public static int sub(int a,int b)
		 {
			 return a-b;
		 }
		
		 //non parameterized constructor
		 public demo1()
		 {
			 System.out.println("Hello Students");
		 }
		 
		 //parameterized constructor
		 public demo1(String name)
		 {
			 System.out.println("Hello "+name);
		 }
	
	public static void main(String[] args) {
		//object creation
		demo1 obj1 = new demo1();
		demo1 obj = new demo1("Purva");
		
		obj1.greetings();
		greetings1();
		obj1.greet("Kavya", 10);
		greet1("Mansi",24);
		System.out.println(obj1.add(2, 3));
		System.out.println(sub(4,2));
	}

}
