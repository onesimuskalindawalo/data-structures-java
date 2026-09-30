
public class LinearSearch {

    // Algorithm: Linear Search
    public static int linearSearch(int[] arr, int target) {

        // Go through every element
        for (int i = 0; i < arr.length; i++) {

            // If found, return its index
            if (arr[i] == target) {
                return i;
            }
        }

        // If not found
        return -1;
    }

    public static void main(String[] args) {

        // Data Structure: Array
        int[] numbers = {10, 20, 30, 40, 50};

        int target = 30;

        int result = linearSearch(numbers, target);

        if (result != -1) {
            System.out.println("Number found at index: " + result);
        } else {
            System.out.println("Number not found.");
        }
    }
}