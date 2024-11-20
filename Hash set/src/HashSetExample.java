import java.util.Arrays;
import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<Integer> set = new HashSet<>();

        // Insert/Add elements
        set.add(10);
        set.add(20);
        set.add(30);
        System.out.println("After adding: " + set);

        // Delete an element
        set.remove(20); // Remove element 20
        System.out.println("After removing 20: " + set);

        // Update an element
        set.remove(10);
        set.add(100); // Replace 10 with 100
        System.out.println("After updating 10 to 100: " + set);

        // Sorting is not applicable for HashSet
        // Converting to an array to sort and print
        Integer[] sortedArray = set.toArray(new Integer[0]);
        Arrays.sort(sortedArray);
        System.out.println("After sorting: " + Arrays.toString(sortedArray));

        // Find the sum of elements
        int sum = 0;
        for (int num : set) {
            sum += num;
        }
        System.out.println("Sum of elements: " + sum);
    }
}
