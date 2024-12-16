package Day16;
//Checking if Two Arrays are Equal
import java.util.Arrays;

public class A24{
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};

        boolean areEqual = Arrays.equals(array1, array2);
        System.out.println("Are the two arrays equal? " + areEqual);
    }
}