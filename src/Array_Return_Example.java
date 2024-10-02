

public class Array_Return_Example  {

    // Method to create and return an array
    public static int[] createArray(int size) {
        int[] array = new int[size];

        // Fill the array with values
        for (int i = 0; i < size; i++) {
            array[i] = i * 2; // Example: filling with even numbers
        }

        return array; // Return the array
    }

    public static void main(String[] args) {
        int size = 5; // Specify the size of the array
        int[] myArray = createArray(size); // Call the method to get the array

        // Print the array
        System.out.println("Generated Array:");
        for (int num : myArray) {
            System.out.println(num);
        }
    }
}
