package Day18;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//11. Validating Indian Vehicle Registration Number
public class demo4 {

	public static void main(String[] args) {
		 String vehicleRegNumber = "MH 12 AB 1234"; // Example vehicle registration number
	        String regex = "^[A-Z]{2} \\d{2} [A-Z]{2} \\d{4}$"; // Format: XX 00 XX 0000

	        Pattern pattern = Pattern.compile(regex);
	        Matcher matcher = pattern.matcher(vehicleRegNumber);

	        if (matcher.matches()) {
	            System.out.println("Valid Indian vehicle registration number.");
	        } else {
	            System.out.println("Invalid Indian vehicle registration number.");
	        }
	    }
	}