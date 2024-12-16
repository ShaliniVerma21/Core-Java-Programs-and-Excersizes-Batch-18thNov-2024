package Day16;
//Object Arrays
//An array that can hold objects of a class.
class Student {
    String name;

    Student(String name) {
        this.name = name;
    }
}

public class A12 {
    public static void main(String[] args) {
        // Declare and initialize an array of Student objects
        Student[] students = new Student[3];
        students[0] = new Student("Alice");
        students[1] = new Student("Bob");
        students[2] = new Student("Charlie");

        // Accessing object array elements
        for (Student student : students) {
            System.out.println("Student Name: " + student.name);
        }
    }
}
