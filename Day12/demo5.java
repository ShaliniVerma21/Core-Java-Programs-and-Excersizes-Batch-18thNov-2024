package Day12;

class parent{
	public final void display()
	{
		System.out.println("Display from parent class");
	}
}

class child extends parent{
	//will create problem while compilation 
	//beacuse method overriding is not allowed in case of final
	public void display()
	{
		System.out.println("Display from child class");
	}
}



public class demo5 {
	public static void main(String[] args) {
		final float PI=3.141f;//final variable
		System.out.println(PI);
		
		child obj = new child();
		obj.display();
	}

}

