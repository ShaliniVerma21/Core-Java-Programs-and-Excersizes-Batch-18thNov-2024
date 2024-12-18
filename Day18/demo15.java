package Day18;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//8. Validating Indian Mobile Numbers
public class demo15 {

	public static void main(String[] args) {
		 String mobileNumber = "9876543210"; // Example mobile number
	        String regex = "^[789]\\d{9}$"; // Starts with 7, 8, or 9 followed by 9 digits

	        Pattern pattern = Pattern.compile(regex);
	        Matcher matcher = pattern.matcher(mobileNumber);

	        if (matcher.matches()) {
	            System.out.println("Valid Indian mobile number.");
	        } else {
	            System.out.println("Invalid Indian mobile number.");
	        }
	    }
	}