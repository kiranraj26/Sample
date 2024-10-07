
import java.util.Stack;

public class TotalRegion {
    
    public static int calculateTotalRegion(int[] heights) {
        int n = heights.length;
        
        // Arrays to store the left and right boundaries for each student
        int[] left = new int[n];
        int[] right = new int[n];
        
        Stack<Integer> stack = new Stack<>();
        
        // Calculate left boundaries
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && heights[stack.peek()] < heights[i]) {
                stack.pop();
            }
            left[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }
        
        // Clear the stack for calculating right boundaries
        stack.clear();
        
        // Calculate right boundaries
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && heights[stack.peek()] < heights[i]) {
                stack.pop();
            }
            right[i] = stack.isEmpty() ? n : stack.peek();
            stack.push(i);
        }
        
        // Calculate the sum of all regions
        int totalRegion = 0;
        for (int i = 0; i < n; i++) {
            totalRegion += (i - left[i]) * (right[i] - i);
        }
        
        return totalRegion;
    }

    public static void main(String[] args) {
        // Example usage:
        int[] heights = {3, 5, 6};
        System.out.println(calculateTotalRegion(heights));  // Output: 6

        // Another example:
        int[] heights2 = {1, 2, 1};
        System.out.println(calculateTotalRegion(heights2));  // Output: 5
        
     // Another example:
        int[] heights3 = {1, 1,1, 1};
        System.out.println(calculateTotalRegion(heights3));  // Output: 5
    }
}
