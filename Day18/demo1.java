package Day18;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//1. Validating an Email Address
public class demo1 {

	public static void main(String[] args) {
		    String email = "example@example.com";
	        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

	        Pattern pattern = Pattern.compile(regex);
	        Matcher matcher = pattern.matcher(email);

	        if (matcher.matches()) {
	            System.out.println("Valid email address.");
	        } else {
	            System.out.println("Invalid email address.");
	        }
	    }
	}