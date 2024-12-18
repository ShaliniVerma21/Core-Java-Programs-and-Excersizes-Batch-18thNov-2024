package Day18;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//9. Validating Indian Postal Codes (PIN Codes)
public class demo2 {

	public static void main(String[] args) {
		 String pinCode = "110001"; // Example PIN code
	        String regex = "^[1-9][0-9]{5}$"; // 6 digits, first digit cannot be 0

	        Pattern pattern = Pattern.compile(regex);
	        Matcher matcher = pattern.matcher(pinCode);

	        if (matcher.matches()) {
	            System.out.println("Valid Indian PIN code.");
	        } else {
	            System.out.println("Invalid Indian PIN code.");
	        }
	    }
	}