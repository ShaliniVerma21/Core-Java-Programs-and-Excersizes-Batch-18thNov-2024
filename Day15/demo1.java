package Day15;

public class demo1 {

	public static void main(String[] args) {
		
		//Example 1: Declaring and Initializing an Array
		int[] scores1 = {90, 80, 70, 60, 50};
        System.out.println("Scores: "+ ",\n " 
        		                     + scores1[0] + ", \n" 
        		                     + scores1[1] + ", \n" 
		                             + scores1[2] + ", \n" 
        		                     + scores1[3] + ", \n" 
		                             + scores1[4]);
   
        
        //Example 2: Declaring an Array and Initializing it Later
        int[] scores2 = new int[5];
        scores2[0] = 90;
        scores2[1] = 80;
        scores2[2] = 70;
        scores2[3] = 60;
        scores2[4] = 50;
        System.out.println("Scores: " + scores2[0] + ", " + scores2[1] + ", " 
        + scores2[2] + ", " + scores2[3] + ", " + scores2[4]);
   
        
        // Example 3: Using a Loop to Initialize an Array
        int[] scores3 = new int[5];
        for (int i = 0; i < scores3.length; i++) {
            scores3[i] = i * 10;
        }
        System.out.println("Scores: " + scores3[0] + ", " + scores3[1] + ", " + scores3[2] + ", " 
        + scores3[3] + ", " + scores3[4]);
    
        
        //Example 4: Using a Loop to Print an Array
        int[] scores4 = {90, 80, 70, 60, 50};
        for (int i = 0; i < scores4.length; i++) {
            System.out.println("Score " + (i + 1) + ": " + scores4[i]);
        }
        
        
        //Example 5: Using a Foreach Loop to Print an Array
        int[] scores5 = {90, 80, 70, 60, 50};
        for (int score : scores5) {
            System.out.println("Score: " + score);
        }

	}

}
