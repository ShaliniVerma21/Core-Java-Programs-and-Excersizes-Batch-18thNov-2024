package Day14;
//Abstraction via Interfaces(100%)

//in case of interfaces we can use only abstract methods.
interface Vehicle{
	//using abstract keyword is optional in any abstract method
	void start();
	abstract void stop();
}

class Car implements Vehicle{

	@Override
	public void start() {
		System.out.println("Car is starting");
	}

	@Override
	public void stop() {
		System.out.println("Car is stopping");
	}
}

class Bike implements Vehicle{

	@Override
	public void start() {
		System.out.println("Bike is starting");
	}

	@Override
	public void stop() {
		System.out.println("Bike is stopping");
	}
}

public class demo5 {
	public static void main(String[] args) {
		Vehicle myCar = new Car();
		myCar.start();
		myCar.stop();
		
		Vehicle myBike = new Bike();
		myBike.start();
		myBike.stop();
	}
}
