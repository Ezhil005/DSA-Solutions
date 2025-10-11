/**
 * Problem: Maximum Sum of Subarray of Size K
 * Description: Find the maximum sum of any contiguous subarray of size k.
 * Input: nums = [2, 1, 5, 1, 3, 2], k = 3
 * Output: 9
 * Explanation: Subarray [5,1,3] has the maximum sum = 9.
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class MaxSumSubarrayK {
    public int maxSum(int[] nums, int k) {
        int sum = 0, max = 0;
        for (int i = 0; i < k; i++) sum += nums[i];
        max = sum;
        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];
            max = Math.max(max, sum);
        }
        return max;
    }
}
