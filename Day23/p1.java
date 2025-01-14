package Day23;
/*
 1. Non-static Inner Class: Employee Management
Problem: Create an Employee class with an inner class 
Address to manage employee addresses.
*/
class Employee {
    private String name;

    class Address {
        private String city;

        Address(String city) {
            this.city = city;
        }

        void display() {
            System.out.println(name + " lives in " + city);
        }
    }

    Employee(String name) {
        this.name = name;
    }
}

public class p1{
    public static void main(String[] args) {
        Employee emp = new Employee("John");
        Employee.Address addr = emp.new Address("New York");
        addr.display(); // Output: John lives in New York
    }
}