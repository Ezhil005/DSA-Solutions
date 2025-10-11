/**
 * Problem: Single Number
 * Description: In an array where every element appears twice except one, find the unique element.
 * Input: [4,1,2,1,2]
 * Output: 4
 * Explanation: 4 appears only once, others appear twice.
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class SingleNumber {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) result ^= num;
        return result;
    }
}
