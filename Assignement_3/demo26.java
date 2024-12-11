package Assignement_3;
//Digital Resume Builder 📄: Create and export professional resumes.
import java.util.Scanner;

// Interface for Resume Operations
interface ResumeOperations {
    void addExperience(String company, String role, int years);
    void addEducation(String institution, String degree, int year);
    void displayResume();
}

// Abstract class for Person5
abstract class Person5 {
    protected String name;
    protected String email;

    public Person5(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public abstract void displayInfo();
}

// Concrete class for Resume
class Resume extends Person5 implements ResumeOperations {
    private String[] experiences;
    private String[] educations;
    private int experienceCount;
    private int educationCount;

    public Resume(String name, String email, int maxExperiences, int maxEducations) {
        super(name, email);
        experiences = new String[maxExperiences];
        educations = new String[maxEducations];
        experienceCount = 0;
        educationCount = 0;
    }

    @Override
    public void addExperience(String company, String role, int years) {
        if (experienceCount < experiences.length) {
            experiences[experienceCount++] = years + " years at " + company + " as " + role;
            System.out.println("Experience added: " + experiences[experienceCount - 1]);
        } else {
            System.out.println("Experience limit reached.");
        }
    }

    @Override
    public void addEducation(String institution, String degree, int year) {
        if (educationCount < educations.length) {
            educations[educationCount++] = degree + " from " + institution + " in " + year;
            System.out.println("Education added: " + educations[educationCount - 1]);
        } else {
            System.out.println("Education limit reached.");
        }
    }

    @Override
    public void displayResume() {
        System.out.println("Resume for: " + name);
        System.out.println("Email: " + email);
        System.out.println("Experiences:");
        for (int i = 0; i < experienceCount; i++) {
            System.out.println("- " + experiences[i]);
        }
        System.out.println("Education:");
        for (int i = 0; i < educationCount; i++) {
            System.out.println("- " + educations[i]);
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
    }
}

// Main class
public class demo26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a Resume
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your email: ");
        String email = scanner.nextLine();

        Resume resume = new Resume(name, email, 5, 5);

        // Add experiences
        resume.addExperience("Company A", "Software Engineer", 2);
        resume.addExperience("Company B", "Senior Developer", 3);

        // Add education
        resume.addEducation("University X", "Bachelor of Science in Computer Science", 2020);
        resume.addEducation("University Y", "Master of Science in Software Engineering", 2022);

        // Display resume
        resume.displayResume();

        scanner.close();
    }
}