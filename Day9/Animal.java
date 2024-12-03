package Day9;

public class Animal {
	//no-return type method(void) and non parameterized
	
	//method-1
	void speak()
	{
		System.out.println("Animals can speak");
	}
	
	//method-2
	void eat()
	{
		System.out.println("Animals eats.");
	}
	
	//method-3
	//static methods- no need to call it using objects
	static void run()
	{
		System.out.println("Animals can run,...");
	}

	public static void main(String[] args) {
		//Create objects
		
		Animal Dog = new Animal();
		Animal Lion = new Animal();
		Animal Cat = new Animal();
		Animal Cow = new Animal();
		Animal Elephant = new Animal();
		
		System.out.println("\nbehaviours of Dog");
		Dog.speak();
		Dog.eat();
		run();
		
		System.out.println("\nbehaviours of Lion");
		Lion.eat();
		Lion.speak();
		run();
		
		System.out.println("\nbehaviours of Cat");
		Cat.eat();
		Cat.speak();
		run();
		
		System.out.println("\nbehaviours of Cow");
		Cow.eat();
		Cow.speak();
		run();
		
		System.out.println("\nbehaviours of Elephant");
		Elephant.eat();
		Elephant.speak();
		run();
		
		//classwork-create human class and complete implementations using class, objects & methods
		
	}
}