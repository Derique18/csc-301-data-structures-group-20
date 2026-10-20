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
}