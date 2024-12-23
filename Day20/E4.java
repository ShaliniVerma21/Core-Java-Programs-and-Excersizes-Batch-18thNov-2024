package Day20;
//5. Exception Chaining
import java.io.*;

public class E4 {

	    public static void main(String[] args) {
	        try {
	            throw new IOException("IO Exception occurred");
	        } catch (IOException e) {
	            throw new RuntimeException("Runtime Exception occurred", e); // Chaining
	        }
	    }
	}