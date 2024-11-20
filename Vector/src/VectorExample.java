import java.util.Collections;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        // Create a Vector
        Vector<Integer> vector = new Vector<>();

        // Insert/Add elements
        vector.add(10);
        vector.add(20);
        vector.add(30);
        System.out.println("After adding: " + vector);

        // Delete an element
        vector.remove((Integer) 20); // Remove element 20
        System.out.println("After removing 20: " + vector);

        // Update an element
        vector.set(0, 100); // Update index 0 to 100
        System.out.println("After updating index 0: " + vector);

        // Sort the Vector
        Collections.sort(vector);
        System.out.println("After sorting: " + vector);

        // Find the sum of elements
        int sum = 0;
        for (int num : vector) {
            sum += num;
        }
        System.out.println("Sum of elements: " + sum);
    }
}
