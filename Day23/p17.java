package Day23;
/*
 9. Non-static Inner Class: School1 and Student
Problem: Create a School1 class with an inner class Student to manage student details. 
 */
class School1 {
    private String name;

    class Student {
        private String studentName;

        Student(String studentName) {
            this.studentName = studentName;
        }

        void display() {
            System.out.println("School1: " + name + ", Student: " + studentName);
        }
    }

    School1(String name) {
        this.name = name;
    }
}

public class p17{
    public static void main(String[] args) {
        School1 School1 = new School1("Greenwood High");
        School1.Student student = School1.new Student("John Doe");
        student.display(); // Output: School1: Greenwood High, Student: John Doe
    }
}