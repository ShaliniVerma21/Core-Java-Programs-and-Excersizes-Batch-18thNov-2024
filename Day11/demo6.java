package Day11;

class Animals{
	void speak() {
		System.out.println("Animals can Speak...");
	}
}
class Cat extends Animals{
	void Catspeak() {
		System.out.println("Cats can Speak...");
	}
}

class Lion extends Animals{
	void Lionspeak() {
		System.out.println("Lion can Speak...");
	}
}

class Cow extends Animals{
	void Cowspeak() {
		System.out.println("Cow can Speak...");
	}
}

class Tiger extends Animals{
	void Tigerspeak() {
		System.out.println("Tiger can Speak...");
	}
}

public class demo6 {

	public static void main(String[] args) {
		Tiger t = new Tiger();
		t.speak();
		t.Tigerspeak();
		
		Cow c = new Cow();
		c.Cowspeak();
		c.speak();

	}

}
