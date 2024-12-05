package Day11;

class Grandfather{
	 String Firstname;
	 String Lastname;
	 String Property;
	 int GSelfEarnednoFlats;
	 int BankBalance;

	    // Constructor
	    public Grandfather( String Firstname,
		                    String Lastname,
		                    String Property,
		                    int BankBalance,
		                    int GSelfEarnednoFlats) {
	        this.Firstname = Firstname;
	        this.Lastname = Lastname;
	        this.Property = Property;
	        this.BankBalance = BankBalance;
	        this.GSelfEarnednoFlats = GSelfEarnednoFlats;
	    }

	    // Method to display PAN details
	    public void displayGFDetails() {
	        System.out.println("\nFirst Name: " + Firstname
	        		+"\nLast Name: " + Lastname
	        		+"\nProperty" + Property
	        		+"\nBankBalance" + BankBalance
	        		+"\nGSelfEarnednoFlats" + GSelfEarnednoFlats);
	    }
	}

class Father{
	 String Firstname;
	 String Lastname;
	 String Property;
	 int FSelfEarnednoFlats;
	 int BankBalance;
	 
	// Constructor
	    public Father( String Firstname,
		                    String Lastname,
		                    String Property,
		                    int BankBalance,
		                    int FSelfEarnednoFlats) {
	        this.Firstname = Firstname;
	        this.Lastname = Lastname;
	        this.Property = Property;
	        this.BankBalance = BankBalance;
	        this.FSelfEarnednoFlats = FSelfEarnednoFlats;
	    }

	    // Method to display PAN details
	    public void displayFDetails() {
	        System.out.println("\nFirst Name: " + Firstname
	        		+"\nLast Name: " + Lastname
	        		+"\nProperty" + Property
	        		+"\nBankBalance" + BankBalance
	        		+"\nFSelfEarnednoFlats" + FSelfEarnednoFlats);
	    }
}

class Grandson{
	 String Firstname;
	 String Lastname;
	 String Property;
	 int SSelfEarnednoFlats;
	 int BankBalance;
	 
	// Constructor
	    public Grandson( String Firstname,
		                    String Lastname,
		                    String Property,
		                    int BankBalance,
		                    int SSelfEarnednoFlats) {
	        this.Firstname = Firstname;
	        this.Lastname = Lastname;
	        this.Property = Property;
	        this.BankBalance = BankBalance;
	        this.SSelfEarnednoFlats = SSelfEarnednoFlats;
	    }

	    // Method to display PAN details
	    public void displayGSDetails() {
	        System.out.println("\nFirst Name: " + Firstname
	        		+"\nLast Name: " + Lastname
	        		+"\nProperty" + Property
	        		+"\nBankBalance" + BankBalance
	        		+"\nSSelfEarnednoFlats" + SSelfEarnednoFlats);
	    }
}

public class demo2 {

	public static void main(String[] args) {
		Grandfather g = new Grandfather("Tanaji","Raut","2House 3Lands",100000000,2);
		Father f = new Father("Santosh","Raut","4House 3Lands",5000000,3);
		Grandson s = new Grandson("Parth","Raut","4House 3Lands",5000000,3);
		
		g.displayGFDetails();
		f.displayFDetails();
		s.displayGSDetails();
	}

}
