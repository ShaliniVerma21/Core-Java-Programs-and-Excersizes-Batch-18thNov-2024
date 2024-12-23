package Day20;
//9. Logging Exceptions
import java.util.logging.*;
public class E8 {

	    private static final Logger logger = Logger.getLogger(E8.class.getName());

	    public static void main(String[] args) {
	        try {
	            int result = 10 / 0; // This will throw ArithmeticException
	        } catch (ArithmeticException e) {
	            logger.log(Level.SEVERE, "Exception occurred: ", e);
	        }
	    }
	}