package Day19;
//Example of Code Refactoring with Encapsulation
//Before Refactoring:
public class E7 {
	 public String accountNumber;
	    public double balance;

	    public void deposit(double amount) {
	        balance += amount;
	    }

	    public void withdraw(double amount) {
	        if (amount <= balance) {
	            balance -= amount;
	        } else {
	            System.out.println("Insufficient funds.");
	        }
	    }
	}
/*
Issues:

1. The attributes are public, allowing direct access and modification.
2. There is no validation for the accountNumber.
 */