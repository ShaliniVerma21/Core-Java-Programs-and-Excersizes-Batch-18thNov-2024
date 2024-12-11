package Assignement_3;
//Home Loan EMI Calculator 🏡: Simulate loan EMI calculations.


//Base class for Loan
class Loan {
 protected double principal;
 protected double rate;
 protected int years;

 // Constructor
 public Loan(double principal, double rate, int years) {
     this.principal = principal;
     this.rate = rate;
     this.years = years;
 }

 // Method to calculate EMI
 public double calculateEMI() {
     double monthlyRate = rate / (12 * 100);
     int months = years * 12;
     return (principal * monthlyRate * Math.pow(1 + monthlyRate, months)) / (Math.pow(1 + monthlyRate, months) - 1);
 }
}

//Derived class for HomeLoan
class HomeLoan extends Loan {
 private static final double processingFeePercentage = 0.02; // Static variable for processing fee

 // Constructor
 public HomeLoan(double principal, double rate, int years) {
     super(principal, rate, years);
 }

 // Method to calculate total payment including processing fee
 public double calculateTotalPayment() {
     double emi = calculateEMI();
     double totalPayment = emi * years * 12;
     double processingFee = principal * processingFeePercentage;
     return totalPayment + processingFee;
 }

 // Method to display loan details
 public void displayLoanDetails() {
     System.out.println("Principal: " + principal);
     System.out.println("Rate: " + rate);
     System.out.println("Years: " + years);
     System.out.println("EMI: " + calculateEMI());
     System.out.println("Total Payment (including processing fee): " + calculateTotalPayment());
 }
}

//Final class for LoanReport
final class LoanReport {
 private String reportTitle;

 // Constructor
 public LoanReport(String reportTitle) {
     this.reportTitle = reportTitle;
 }

 // Method to display report
 public void displayReport() {
     System.out.println("Loan Report: " + reportTitle);
 }
}

//Main class
public class demo12 {
 public static void main(String[] args) {
     // Create a home loan
     HomeLoan homeLoan = new HomeLoan(500000, 7.5, 15);
     homeLoan.displayLoanDetails();

     // Create and display a loan report
     LoanReport report = new LoanReport("Monthly Home Loan EMI Report");
     report.displayReport();
 }
}