package Assignement_3;
//Local Business Promotion Platform 📈: Support small businesses with marketing tools.

import java.util.Scanner;

// Interface for Marketing Tools
interface MarketingTools {
    void promoteBusiness(String businessName);
    void displayPromotions();
}

// Abstract class for Business
abstract class AbstractBusiness {
    protected String name;
    protected String description;

    public AbstractBusiness(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public abstract void displayInfo();
}

// Concrete class for Local Business
class LocalBusiness extends AbstractBusiness implements MarketingTools {
    private String[] promotions;
    private int promotionCount;

    public LocalBusiness(String name, String description, int maxPromotions) {
        super(name, description);
        promotions = new String[maxPromotions];
        promotionCount = 0;
    }

    @Override
    public void promoteBusiness(String businessName) {
        if (promotionCount < promotions.length) {
            promotions[promotionCount++] = "Promotion for " + businessName + ": Get 20% off!";
            System.out.println("Promotion added for " + businessName);
        } else {
            System.out.println("Promotion limit reached for " + businessName);
        }
    }

    @Override
    public void displayPromotions() {
        System.out.println("Current Promotions for " + name + ":");
        for (int i = 0; i < promotionCount; i++) {
            System.out.println(promotions[i]);
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Business Name: " + name);
        System.out.println("Description: " + description);
    }
}

// Main class
public class demo27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a Local Business
        System.out.print("Enter business name: ");
        String businessName = scanner.nextLine();
        System.out.print("Enter business description: ");
        String businessDescription = scanner.nextLine();

        LocalBusiness localBusiness = new LocalBusiness(businessName, businessDescription, 5);

        // Display business info
        localBusiness.displayInfo();

        // Add promotions
        localBusiness.promoteBusiness(businessName);
        localBusiness.promoteBusiness(businessName);

        // Display promotions
        localBusiness.displayPromotions();

        scanner.close();
    }
}