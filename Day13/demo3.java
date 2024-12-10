package Day13;

//Compile-time polymorphism(achieved via method overloading)
//2. by changing types of arguments
class message {

		//method-1
		public void show(int a)
		{
			System.out.println("Message - 1 : "+a);
		}

		//method-2
		public void show(float a)
		{
			System.out.println("Message - 2 : "+a);
		}
		//method-3
		public void show(double a)
		{
			System.out.println("Message - 3 : "+a);
		}
		
		//method-4
		public void show(char a)
		{
			System.out.println("Message - 4 : "+a);
		}
		
		//method-5
		public void show(String a)
		{
			System.out.println("Message - 5 : "+a);
		}
}
public class demo3 {

	public static void main(String[] args) {
		message m = new message();
		
		m.show('A');
		m.show(45.67);
		m.show(3.4);
		m.show(5);
		m.show("Develearn");

	}

}
