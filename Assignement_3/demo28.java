package Assignement_3;
//Courier Management System 🚚: Track delivery routes and package status

import java.util.Scanner;

// Interface for Courier operations
interface CourierOperations {
    void addPackage(Package pkg);
    void trackPackage(int trackingId);
}

// Abstract class for Courier
abstract class AbstractCourier {
    protected Package[] packages;
    protected int packageCount;

    public AbstractCourier(int capacity) {
        packages = new Package[capacity];
        packageCount = 0;
    }

    public abstract void displayPackages();
}

// Concrete class for Courier Management
class CourierManagement extends AbstractCourier implements CourierOperations {
    public CourierManagement(int capacity) {
        super(capacity);
    }

    @Override
    public void addPackage(Package pkg) {
        if (packageCount < packages.length) {
            packages[packageCount++] = pkg;
            System.out.println("Package added: " + pkg);
        } else {
            System.out.println("Cannot add package. Capacity reached.");
        }
    }

    @Override
    public void trackPackage(int trackingId) {
        for (int i = 0; i < packageCount; i++) {
            if (packages[i].getTrackingId() == trackingId) {
                System.out.println("Tracking Package: " + packages[i]);
                return;
            }
        }
        System.out.println("Package with tracking ID " + trackingId + " not found.");
    }

    @Override
    public void displayPackages() {
        System.out.println("Current Packages:");
        for (int i = 0; i < packageCount; i++) {
            System.out.println(packages[i]);
        }
    }
}

// Package class
class Package {
    private static int idCounter = 0; // Static variable for unique tracking ID
    private final int trackingId; // Final variable for tracking ID
    private String sender;
    private String receiver;
    private String status;

    public Package(String sender, String receiver) {
        this.trackingId = ++idCounter; // Increment and assign unique ID
        this.sender = sender;
        this.receiver = receiver;
        this.status = "In Transit"; // Default status
    }

    public int getTrackingId() {
        return trackingId;
    }

    public String getStatus() {
        return status;
    }

    public void updateStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Package [Tracking ID: " + trackingId + ", Sender: " + sender + ", Receiver: " + receiver + ", Status: " + status + "]";
    }
}

// Main class
public class demo28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int capacity = 10; // Maximum number of packages
        CourierManagement courierManagement = new CourierManagement(capacity);

        // Adding packages
        courierManagement.addPackage(new Package("Alice", "Bob"));
        courierManagement.addPackage(new Package("Charlie", "David"));

        // Displaying packages
        courierManagement.displayPackages();

        // Tracking a package
        System.out.print("Enter tracking ID to track: ");
        int trackingId = scanner.nextInt();
        courierManagement.trackPackage(trackingId);

        // Updating package status
        System.out.print("Enter tracking ID to update status: ");
        trackingId = scanner.nextInt();
        System.out.print("Enter new status: ");
        String newStatus = scanner.next();
        for (int i = 0; i < courierManagement.packageCount; i++) {
            if (courierManagement.packages[i].getTrackingId() == trackingId) {
                courierManagement.packages[i].updateStatus(newStatus);
                System.out.println("Status updated for package: " + courierManagement.packages[i]);
                break;
            }
        }

        scanner.close();
    }
}