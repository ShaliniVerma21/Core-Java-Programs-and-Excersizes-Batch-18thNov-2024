package Day13;

class MyClass{
	
	//Access modifiers can be used within class, interfaces, methods, variables and constructors
	
	//public Access Modifier
	public int value1=10;
	
	//private Access Modifier
	 private int value2=20;
	 
	//protected Access Modifier
	 protected int value3=30;
	 
	//default Access Modifier
     int value4=40;
     
     
     //Constructor public Access Modifier
     public MyClass()
     {
    	 System.out.println("I am using public constructor");
     }
     
     //Method public Access Modifier
     public void publicmethod()
     {
    	 System.out.println("I am using public access modifier");
     }
     
   //Method protected Access Modifier
     protected void protectedmethod()
     {
    	 System.out.println("I am using protected access modifier");
     }
     
   //Method private Access Modifier
     private void privatemethod()
     {
    	 System.out.println("I am using private access modifier");
     }
     
   //Method default Access Modifier
     void defaultmethod()
     {
    	 System.out.println("I am using default access modifier");
     }
}

public class demo1 {
	public static void main(String[] args) {
		MyClass my=new MyClass();
		
		System.out.println("Value-1 : "+my.value1);
		//System.out.println("Value-2 : "+my.value2);
		System.out.println("Value-3 : "+my.value3);
		System.out.println("Value-4 : "+my.value4);
		
		my.publicmethod();
		my.protectedmethod();
		my.defaultmethod();
	}

}
