package Day25;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
//Hashset
class Contact {
    String name;
    String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return name.hashCode(); // Use name as the unique identifier
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Contact)) return false;
        Contact other = (Contact) obj;
        return this.name.equalsIgnoreCase(other.name); // Compare names for equality
    }
}

public class C15 {

    public static void main(String[] args) {
        // Create a HashSet to manage contacts
        HashSet<Contact> contactSet = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // Display menu options
            System.out.println("\nContact Management System");
            System.out.println("1. Add Contact");
            System.out.println("2. View All Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Remove Contact");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    // Add a new contact
                    addContact(contactSet, scanner);
                    break;

                case 2:
                    // View all contacts
                    viewContacts(contactSet);
                    break;

                case 3:
                    // Search for a specific contact
                    searchContact(contactSet, scanner);
                    break;

                case 4:
                    // Remove a contact
                    removeContact(contactSet, scanner);
                    break;

                case 0:
                    System.out.println("Exiting the Contact Management System.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);

        scanner.close();
    }

    // Method to add a contact
    private static void addContact(HashSet<Contact> contactSet, Scanner scanner) {
        System.out.print("Enter contact name: ");
        String name = scanner.nextLine();
        System.out.print("Enter contact phone number: ");
        String phoneNumber = scanner.nextLine();
        Contact newContact = new Contact(name, phoneNumber);
        if (contactSet.add(newContact)) {
            System.out.println("Contact added: " + newContact);
        } else {
            System.out.println("Contact with this name already exists.");
        }
    }

    // Method to view all contacts
    private static void viewContacts(HashSet<Contact> contactSet) {
        if (contactSet.isEmpty()) {
            System.out.println("No contacts available.");
        } else {
            System.out.println("Current Contacts:");
            for (Contact contact : contactSet) {
                System.out.println(contact);
            }
        }
    }

    // Method to search for a specific contact
    private static void searchContact(HashSet<Contact> contactSet, Scanner scanner) {
        System.out.print("Enter contact name to search for: ");
        String searchName = scanner.nextLine();
        for (Contact contact : contactSet) {
            if (contact.name.equalsIgnoreCase(searchName)) {
                System.out.println("Contact found: " + contact);
                return;
            }
        }
        System.out.println("Contact not found: " + searchName);
    }

    // Method to remove a contact
    private static void removeContact(HashSet<Contact> contactSet, Scanner scanner) {
        System.out.print("Enter contact name to remove: ");
        String removeName = scanner.nextLine();
        Contact contactToRemove = new Contact(removeName, null); // Create a temporary contact for comparison
        if (contactSet.remove(contactToRemove)) {
            System.out.println("Contact removed: " + removeName);
        } else {
            System.out.println("Contact not found: " + removeName);
        }
    }
}