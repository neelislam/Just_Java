import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        // Create an array
        int[] array = {10, 20, 30};

        // Insert/Add elements
        // Arrays are fixed-size, so we can't directly add new elements
        // Instead, we'll create a new array with extra space
        int[] newArray = new int[4];
        System.arraycopy(array, 0, newArray, 0, array.length);
        newArray[3] = 40; // Add element 40
        array = newArray;
        System.out.println("After adding 40: " + Arrays.toString(array));

        // Delete an element
        // Again, Arrays are fixed-size, so we'll create a new array without the element
        newArray = new int[3];
        int indexToRemove = 1;
        for (int i = 0, j = 0; i < array.length; i++) {
            if (i != indexToRemove) {
                newArray[j++] = array[i];
            }
        }
        array = newArray;
        System.out.println("After removing index 1: " + Arrays.toString(array));

        // Update an element
        array[0] = 100; // Update index 0 to 100
        System.out.println("After updating index 0: " + Arrays.toString(array));

        // Sort the array
        Arrays.sort(array);
        System.out.println("After sorting: " + Arrays.toString(array));

        // Find the sum of elements
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        System.out.println("Sum of elements: " + sum);
    }
}
