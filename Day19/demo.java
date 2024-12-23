package Day19;

//Animal
class Animal{
	private String name;
	private int age;
	private String color;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Animal(String name, int age, String color) {
		this.name=name;
		this.age=age;
		this.color=color;
	}
	
	public void displayInfo()
	{
		System.out.println("Name : "+name
				+"\nAge : "+age
				+"\ncolor : "+color);
	}
}

public class demo {

	public static void main(String[] args) {
		Animal animal = new Animal("Leo",2,"brown");
		System.out.println("Information of Animal -1 : \n");
		animal.displayInfo();
		
		//set values
		animal.setName("Tom");
		animal.setAge(1);
		animal.setColor("black-white");
		
		System.out.println("\nInformation of Animal -2 : \n");
		// get value
		System.out.println("Name : "+animal.getName()
				+"\nAge : "+animal.getAge()
				+"\ncolor : "+animal.getColor());
		
		//set values
		animal.setName("jerry");
		animal.setAge(1);
		animal.setColor("black-white");
		
		System.out.println("\nInformation of Animal -3 : \n");
		// get value
		System.out.println("Name : "+animal.getName()
				+"\nAge : "+animal.getAge()
				+"\ncolor : "+animal.getColor());
	}

}
