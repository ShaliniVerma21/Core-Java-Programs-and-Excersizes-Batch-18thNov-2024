package Excersize_9;
//College Management
class Course {
    private String courseName;
    private int duration;

    // Constructor
    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    // Method to display course details
    public void displayCourseDetails() {
        System.out.println("Course: " + courseName + ", Duration: " + duration + " months");
    }
}

// Example usage
public class Main20 {
    public static void main(String[] args) {
        Course course = new Course("Computer Science", 36);
        course.displayCourseDetails();
    }
}