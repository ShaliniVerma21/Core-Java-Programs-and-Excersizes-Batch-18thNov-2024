package Day24;
// 14. PriorityQueue Example: Emergency Room Triage
import java.util.PriorityQueue;
import java.util.Iterator;

public class demo21 {
    static class Patient implements Comparable<Patient> {
        String name;
        int severity;

        Patient(String name, int severity) {
            this.name = name;
            this.severity = severity;
        }

        @Override
        public int compareTo(Patient other) {
            return Integer.compare(other.severity, this.severity); // Higher severity first
        }
    }

    public static void main(String[] args) {
        // Create a PriorityQueue for patients
        PriorityQueue<Patient> queue = new PriorityQueue<>();
        
        // Add patients with severity levels (real-world related)
        queue.offer(new Patient("Alice", 2));
        queue.offer(new Patient("Bob", 5));
        queue.offer(new Patient("Charlie", 3));
        queue.offer(new Patient("Diana", 4));
        queue.offer(new Patient("Ethan", 1));
        queue.offer(new Patient("Fiona", 5));
        queue.offer(new Patient("George", 2));
        queue.offer(new Patient("Hannah", 4));
        queue.offer(new Patient("Ian", 3));
        queue.offer(new Patient("Jack", 1));
        
        // Display current queue
        System.out.println("Current Patient Queue: ");
        for (Patient patient : queue) {
            System.out.println(patient.name + " with severity " + patient.severity);
        }
        
        // Conditional logic to simulate triage actions
        String action = "treat"; // Simulate user action (can be "treat", "peek", "check", "clear")
        
        if (action.equals("treat") && !queue.isEmpty()) {
            Patient patient = queue.poll();
            System.out.println("Treating: " + patient.name + " with severity " + patient.severity);
        } else if (action.equals("peek") && !queue.isEmpty()) {
            Patient patient = queue.peek();
            System.out.println("Next patient to treat: " + patient.name + " with severity " + patient.severity);
        } else if (action.equals("check")) {
            String patientToCheck = "Charlie";
            boolean found = false;
            for (Patient p : queue) {
                if (p.name.equals(patientToCheck)) {
                    found = true;
                    break;
                }
            }
            if (found) {
                System.out.println("The patient '" + patientToCheck + "' is in the queue.");
            } else {
                System.out.println("The patient '" + patientToCheck + "' is not in the queue.");
            }
        } else if (action.equals("clear")) {
            queue.clear();
            System.out.println("Patient queue has been cleared.");
        } else {
            System.out.println("No action taken or queue is empty.");
        }
        
        // Get the size of the PriorityQueue
        System.out.println("Number of patients in queue: " + queue.size());
        
        // Iterate using a for-each loop
        System.out.println("Iterating using enhanced for loop:");
        for (Patient patient : queue) {
            System.out.println(patient.name + " with severity " + patient.severity);
        }
        
        // Iterate using an Iterator
        System.out.println("Iterating using Iterator:");
        Iterator<Patient> iterator = queue.iterator();
        while (iterator.hasNext()) {
            Patient patient = iterator.next();
            System.out.println(patient.name + " with severity " + patient.severity);
        }
        
        // Clear the PriorityQueue
        queue.clear();
        System.out.println("Patient queue after clearing: " + queue);
    }
}