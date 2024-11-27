package Excercize_6;
//Circle Pattern with Animation (Console)
public class Circle4 {
	 public static void main(String[] args) throws InterruptedException {
	        int radius = 10; // Radius of the circle
	        for (int k = 0; k < 5; k++) { // Repeat animation
	            for (int i = 0; i <= 2 * radius; i++) {
	                for (int j = 0; j <= 2 * radius; j++) {
	                    double distance = Math.sqrt(Math.pow(i - radius, 2) + Math.pow(j - radius, 2));
	                    if (distance >= radius - 0.5 && distance <= radius + 0.5) {
	                        System.out.print("*");
	                    } else {
	                        System.out.print(" ");
	                    }
	                }
	                System.out.println();
	            }
	            Thread.sleep(500); // Pause for half a second
	            System.out.print("\033[H\033[2J"); // Clear console
	            System.out.flush();
	        }
	    }
	}