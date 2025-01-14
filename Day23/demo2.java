package Day23;
//2. Static Nested Class

class University {
    private String name;

    // Static nested class
    static class Department {
        private String departmentName;

        Department(String departmentName) {
            this.departmentName = departmentName;
        }

        void displayDepartment() {
            System.out.println("Department: " + departmentName);
        }
    }

    University(String name) {
        this.name = name;
    }
}

// Usage
public class demo2{
    public static void main(String[] args) {
        University.Department csDepartment = new University.Department("Computer Science");
        csDepartment.displayDepartment();
    }
}