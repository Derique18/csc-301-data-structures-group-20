import java.util.Arrays;

class Solution {
    public int[] plusOne(int[] digits) {
        // Traverse from least significant digit to most significant digit
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits; // Return immediately if no carry propagation is needed
            }
            digits[i] = 0; // Carry over
        }
        
        // If all digits were 9 (e.g., [9, 9] -> [1, 0, 0])
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }

    // Main method for local execution and testing
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] test1 = {1, 2, 3};
        System.out.println("Input: [1, 2, 3] -> Output: " + Arrays.toString(sol.plusOne(test1)));

        int[] test2 = {4, 3, 2, 1};
        System.out.println("Input: [4, 3, 2, 1] -> Output: " + Arrays.toString(sol.plusOne(test2)));

        int[] test3 = {9, 9};
        System.out.println("Input: [9, 9] -> Output: " + Arrays.toString(sol.plusOne(test3)));
    }
}