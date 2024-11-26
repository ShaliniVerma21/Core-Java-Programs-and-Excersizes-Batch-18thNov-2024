package Day3;

public class demo2 {

	public static void main(String[] args) {
		//display information of a person
		
		/*
		 * Name,Age, Height, weight,course, grades,isActive,Gender
		 */
		
		String Name ="Yash Gurav";
		int Age = 22;
		float height = 5.3f;
		float weight = 58;
		String Course = "Full stack developement";
		char Grades = 'A';
		boolean isActive = true;
		String Gender = "Male";
		
		//print information
		System.out.println("\tName :\t"+Name
				+"\n"
				+"\tAge : \t"+Age
				+"\n"
				+"\tHeight : "+height
				+"\n"
				+"\tWeight : "+weight
				+"\n"
				+"\tCourse : "+Course
				+"\n"
				+"\tGrades : "+Grades
				+"\n"
				+"\tisActive: "+isActive
				+"\n"
				+"\tGender : "+Gender);
	}

}
