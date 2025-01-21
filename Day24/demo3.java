package Day24;
// 19. TreeMap Example: Storing Employee Salaries
import java.util.TreeMap;
import java.util.Iterator;
import java.util.Map;

public class demo3 {
    public static void main(String[] args) {
        // Create a TreeMap to store employee names and their salaries
        TreeMap<String, Double> salaries = new TreeMap<>();
        
        // Add employee salaries (real-world related)
        salaries.put("Alice", 70000.0);
        salaries.put("Bob", 50000.0);
        salaries.put("Charlie", 60000.0);
        salaries.put("Diana", 75000.0);
        salaries.put("Ethan", 55000.0);
        salaries.put("Fiona", 80000.0);
        salaries.put("George", 45000.0);
        salaries.put("Hannah", 65000.0);
        salaries.put("Ian", 72000.0);
        salaries.put("Jack", 48000.0);
        
        // Display salaries in sorted order by employee name
        System.out.println("Employee Salaries: " + salaries);
        
        // Conditional logic to simulate user actions
        String action = "check"; // Simulate user action (can be "add", "check", "clear")
        String employeeToCheck = "Diana"; // Employee to check
        
        if (action.equals("add")) {
            String newEmployee = "Kevin";
            double newSalary = 60000.0;
            salaries.put(newEmployee, newSalary);
            System.out.println("Added/Updated employee: " + newEmployee + " with salary: " + newSalary);
        } else if (action.equals("check")) {
            if (salaries.containsKey(employeeToCheck)) {
                System.out.println("The salary of '" + employeeToCheck + "' is: " + salaries.get(employeeToCheck));
            } else {
                System.out.println("The employee '" + employeeToCheck + "' does not exist in the salary list.");
            }
        } else if (action.equals("clear")) {
            salaries.clear();
            System.out.println("Employee salaries have been cleared.");
        } else {
            System.out.println("No valid action specified.");
        }
        
        // Get the size of the TreeMap
        System.out.println("Number of employees: " + salaries.size());
        
        // Iterate using a for-each loop
        System.out.println("Iterating using enhanced for loop:");
        for (Map.Entry<String, Double> entry : salaries.entrySet()) {
            System.out.println("Employee: " + entry.getKey() + ", Salary: " + entry.getValue());
        }
        
        // Iterate using an Iterator
        System.out.println("Iterating using Iterator:");
        Iterator<Map.Entry<String, Double>> iterator = salaries.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Double> entry = iterator.next();
            System.out.println("Employee: " + entry.getKey() + ", Salary: " + entry.getValue());
        }
        
        // Clear the TreeMap
        salaries.clear();
        System.out.println("Employee salaries after clearing: " + salaries);
    }
}