package Day10;

public class demo3 {
	// Private instance variables
	 String name;
	 String subject;
	 int experience;

	 // Public constructor
	 public demo3(String name, String subject, int experience) {
	     this.name = name;
	     this.subject = subject;
	     this.experience = experience;
	 }

	 // Method to display teacher information
	 public void displayTeacherInfo() {
	     System.out.println("Teacher Information:");
	     System.out.println("Name: " + name);
	     System.out.println("Subject: " + subject);
	     System.out.println("Experience: " + experience + " years");
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
