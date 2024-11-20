import java.util.Collections;
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // Create a Stack
        Stack<Integer> stack = new Stack<>();

        // Insert/Add elements
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("After adding: " + stack);

        // Delete an element (pop)
        stack.pop(); // Remove the top element
        System.out.println("After popping: " + stack);

        // Update an element
        stack.set(0, 100); // Update index 0 to 100
        System.out.println("After updating index 0: " + stack);

        // Sort the Stack
        Collections.sort(stack);
        System.out.println("After sorting: " + stack);

        // Find the sum of elements
        int sum = 0;
        for (int num : stack) {
            sum += num;
        }
        System.out.println("Sum of elements: " + sum);
    }
}
