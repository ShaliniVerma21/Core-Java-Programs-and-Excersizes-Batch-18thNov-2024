package Day18;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//10.Validating Indian Aadhar Number
public class demo3 {

	public static void main(String[] args) {
		 String aadharNumber = "1234 5678 9012"; // Example Aadhar number
	        String regex = "^[2-9]{1}[0-9]{3} [0-9]{4} [0-9]{4}$"; // 12 digits with spaces

	        Pattern pattern = Pattern.compile(regex);
	        Matcher matcher = pattern.matcher(aadharNumber);

	        if (matcher.matches()) {
	            System.out.println("Valid Indian Aadhar number.");
	        } else {
	            System.out.println("Invalid Indian Aadhar number.");
	        }
	    }
	}