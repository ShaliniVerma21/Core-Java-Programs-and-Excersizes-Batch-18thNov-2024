package Excercize_6;
// Star Pattern circle
public class p24 {
	public static void main(String[] args) {
        int n = 7; // Size of the circle pattern
        int radius = n;

        for (int i = 0; i <= 2 * radius; i++) {
            for (int j = 0; j <= 2 * radius; j++) {
                // Calculate the distance from the center
                double distance = Math.sqrt((i - radius) * (i - radius) + (j - radius) * (j - radius));
                
                // Print stars on the circumference of the circle
                if (distance >= radius - 0.5 && distance <= radius + 0.5) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}