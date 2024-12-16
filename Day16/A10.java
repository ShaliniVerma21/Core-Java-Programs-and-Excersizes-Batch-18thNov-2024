package Day16;
//Dynamic Initialization Example:
public class A10 {
	public static void main(String[] args) {
        // Dynamic initialization
        int[] dynamicArray = new int[5];

        for (int i = 0; i < dynamicArray.length; i++) {
            dynamicArray[i] = (i + 1) * 10; // Assigning values dynamically
        }

        for (int num : dynamicArray) {
            System.out.println(num);
        }
    }
}
