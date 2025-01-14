package Day23;
//5. Non-static Inner Class with Inheritance
class School {
    private String name;

    School(String name) {
        this.name = name;
    }

    // Non-static inner class
    class Student {
        private String studentName;

        Student(String studentName) {
            this.studentName = studentName;
        }

        void displayInfo() {
            System.out.println("School: " + name + ", Student: " 
        + studentName);
        }
    }
}

// Usage
public class demo5{
    public static void main(String[] args) {
        School school = new School("Greenwood High");
        School.Student student = school.new Student("Alice");
        student.displayInfo();
    }
}