package Day23;
/*
 12. Anonymous Inner Class: Comparator
Problem: Use an anonymous inner class to sort a list of strings. 
 */
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class p2{
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Alice", "Bob");
        names.sort(new Comparator<String>() {
            public int compare(String a, String b) {
                return a.compareTo(b);
            }
        });
        System.out.println(names); // Output: [Alice, Bob, John]
    }
}