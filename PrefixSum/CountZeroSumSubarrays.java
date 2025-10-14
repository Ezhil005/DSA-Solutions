/**
 * Problem: Count Subarrays with Sum Zero
 *
 * Description:
 * Given an integer array A, count the number of subarrays whose sum is zero.
 * This uses prefix sums and a HashMap to track how often each prefix sum has occurred.
 *
 * Approach:
 * - Initialize sum = 0 and HashMap with {0: 1} to handle zero-sum from start
 * - For each element:
 *     - Add to running sum
 *     - If sum has been seen before, add its frequency to count
 *     - Update frequency of current sum in HashMap
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * Example:
 * Input: A = [1, -1, 2, -2, 3]
 * Output: 3
 * Explanation: Subarrays with sum zero are [1, -1], [2, -2], [1, -1, 2, -2]
 */
public class Solution {
    public int solve(int[] A) {
        int n=A.length;
        HashMap<Integer,Integer> hm =new HashMap<>();
        int count=0; int sum=0;
        hm.put(0,1);
        for (int i=0;i<n;i++){
            sum+=A[i];
            if(hm.containsKey(sum)){
                count+=hm.get(sum);
                hm.put(sum,hm.get(sum)+1);
            }
            else{
                hm.put(sum,1);
            }
        }
        return count;
    }
}