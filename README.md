# CSC 301: Data Structures - Group 20

## Assignment: LeetCode 66 - Plus One

### Problem Description
You are given a large integer represented as an integer array `digits`, where each `digits[i]` is the $i^{th}$ digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.

---

### Group Members & Contributions

| S/N | Name | Matriculation Number | Role |
| :---: | :--- | :---: | :---: |
| 1 | **Chris-Derique Ehizo** | VUG/SEN/24/12878 | **Group Leader** |
| 2 | Auta Israel Funom | VUG/SEN/24/12712 | Member |
| 3 | Samuel Uduokhai | VUG/SEN/24/11425 | Member |
| 4 | Joseph Terver Jirbo | VUG/SEN/24/11889 | Member |
| 5 | Marquis Daniel | VUG/SEN/24/11283 | Member |
| 6 | Tony Bisong Tangban | VUG/SEN/24/11368 | Member |
| 7 | Ochigbo Samuel Oche | VUG/SEN/24/11582 | Member |
| 8 | Ogunmola Hansel Oluwamurewa | VUG/SEN/24/11649 | Member |
| 9 | Ofor Oti | VUG/SEN/24/11717 | Member |
| 10 | Uche Mac-Anthony C. | VUG/SEN/24/11533 | Member |

---

### Solution Overview (Java - Iterative Approach)

```java
class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(java.util.Arrays.toString(new Solution().plusOne(new int[]{1, 2, 3})));
    }
}
```
### Complexity Analysis
* **Time Complexity:** $O(n)$ — We iterate through the array of length $n$ at most once from right to left.
* **Space Complexity:** $O(1)$ auxiliary in-place ($O(n)$ space when array expansion occurs for all-9s edge cases).
