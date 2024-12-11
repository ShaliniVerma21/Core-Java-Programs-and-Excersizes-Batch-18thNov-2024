package Assignement_3;
//Budget1 Planning App 💰: Plan monthly and annual Budget1s.

import java.util.Scanner;

// Interface for Budget1 Operations
interface Budget1Operations {
    void addExpense(String category, double amount);
    void addIncome(String source, double amount);
    void displayBudget1();
}

// Abstract class for FinancialEntity
abstract class FinancialEntity {
    protected String name;

    public FinancialEntity(String name) {
        this.name = name;
    }

    public abstract void displayInfo();
}

// Concrete class for Budget1
class Budget1 extends FinancialEntity implements Budget1Operations {
    private double totalIncome;
    private double totalExpenses;
    private String[] expenseCategories;
    private double[] expenseAmounts;
    private int expenseCount;

    public Budget1(String name, int maxExpenses) {
        super(name);
        this.totalIncome = 0;
        this.totalExpenses = 0;
        this.expenseCategories = new String[maxExpenses];
        this.expenseAmounts = new double[maxExpenses];
        this.expenseCount = 0;
    }

    @Override
    public void addExpense(String category, double amount) {
        if (expenseCount < expenseCategories.length) {
            expenseCategories[expenseCount] = category;
            expenseAmounts[expenseCount] = amount;
            totalExpenses += amount;
            expenseCount++;
            System.out.println("Expense added: " + category + " - $" + amount);
        } else {
            System.out.println("Expense limit reached.");
        }
    }

    @Override
    public void addIncome(String source, double amount) {
        totalIncome += amount;
        System.out.println("Income added: " + source + " - $" + amount);
    }

    @Override
    public void displayBudget1() {
        System.out.println("Budget1 for: " + name);
        System.out.println("Total Income: $" + totalIncome);
        System.out.println("Total Expenses: $" + totalExpenses);
        System.out.println("Remaining Balance: $" + (totalIncome - totalExpenses));
        System.out.println("Expenses:");
        for (int i = 0; i < expenseCount; i++) {
            System.out.println("- " + expenseCategories[i] + ": $" + expenseAmounts[i]);
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Budget1 Name: " + name);
    }
}

// Main class
public class demo25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a Budget1
        System.out.print("Enter Budget1 name: ");
        String Budget1Name = scanner.nextLine();

        Budget1 Budget1 = new Budget1(Budget1Name, 10); // Max 10 expenses

        // Add income
        Budget1.addIncome("Salary", 5000);
        Budget1.addIncome("Freelance", 1500);

        // Add expenses
        Budget1.addExpense("Rent", 1200);
        Budget1.addExpense("Groceries", 300);
        Budget1.addExpense("Utilities", 150);

        // Display Budget1
        Budget1.displayBudget1();

        scanner.close();
    }
}