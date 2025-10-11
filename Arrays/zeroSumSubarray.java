/**
 * Problem: Maximum Subarray (Kadane's Algorithm)
 * Description: Find the contiguous subarray with the largest sum.
 * Input: [-2,1,-3,4,-1,2,1,-5,4]
 * Output: 6
 * Explanation: The subarray [4,-1,2,1] has the largest sum = 6.
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class MaxSubarray {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0], currSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currSum = Math.max(nums[i], currSum + nums[i]);
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }
}
