package Day11;
//Single Inheritance
class Animal{
	void speak()
	{
		System.out.println("Animals can speak");
	}
}

class Dog extends Animal{
	void eat() {
		System.out.println("Dog eats");
	}
}
public class demo3 {

	public static void main(String[] args) {
		Animal a = new Animal();
		Dog d = new Dog();
		
		a.speak();
		d.eat();
		d.speak();

	}

}
