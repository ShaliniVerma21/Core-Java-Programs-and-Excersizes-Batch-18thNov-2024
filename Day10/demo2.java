package Day10;

public class demo2 {
	 //instance variables
	 String name;
	 int rollNumber;
	 int age;
	 String className;

	 // Public constructor
	 public demo2(String name, int rollNumber, int age, String className) {
	     this.name = name;
	     this.rollNumber = rollNumber;
	     this.age = age;
	     this.className = className;
	 }

	 // Method to display student information
	 public void displayStudentInfo() {
	     System.out.println("\nStudent Information:");
	     System.out.println("Name: " + name);
	     System.out.println("Roll Number: " + rollNumber);
	     System.out.println("Age: " + age);
	     System.out.println("Class: " + className);
	 }

	public static void main(String[] args) {
		demo2 s1 = new demo2("Mansi", 12345, 20,"10th");
		demo2 s2 = new demo2("Purva", 12344, 20,"10th");
		demo2 s3 = new demo2("Palak", 12343, 20,"10th");
		demo2 s4 = new demo2("Tejas", 12342, 20,"10th");
		demo2 s5 = new demo2("Yash", 12341, 20,"10th");
		
		s1.displayStudentInfo();
		s2.displayStudentInfo();
		s3.displayStudentInfo();
		s4.displayStudentInfo();
		s5.displayStudentInfo();
	}

}
