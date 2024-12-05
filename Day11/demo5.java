package Day11;

class Animal1 {

	void run() {
		System.out.println("Animal can run");
	}
}

class Dog1 extends Animal1{
	void speak()
	{
		System.out.println("Dogs bark");
	}
}

class Puppy extends Dog1{
	void eat()
	{
		System.out.println("Puppy drinks milk");
	}
}

public class demo5 {

	public static void main(String[] args) {
		Animal1 a =new Animal1();
		Dog1 d = new Dog1();
		Puppy p = new Puppy();

		p.eat();
		p.run();
		p.speak();
	}

}
