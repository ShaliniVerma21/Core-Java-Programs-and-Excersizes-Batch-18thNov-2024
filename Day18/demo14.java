package Day18;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//7. Validating a Password
public class demo14 {

	public static void main(String[] args) {
		  String password = "Password123!";
	        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";

	        Pattern pattern = Pattern.compile(regex);
	        Matcher matcher = pattern.matcher(password);

	        if (matcher.matches()) {
	            System.out.println("Valid password.");
	        } else {
	            System.out.println("Invalid password.");
	        }
	    }
	}