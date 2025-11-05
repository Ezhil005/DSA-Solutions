/**
 * ✅ Painter's Partition Problem (Binary Search + Greedy)
 *
 * You are given A painters and an array C[] representing board lengths.
 * Each painter takes B units of time to paint 1 unit of board.
 * The goal is to minimize the total time to paint all boards under these constraints:
 * - Each painter paints only contiguous boards.
 * - No board is split between painters.
 *
 * Constraints:
 * - 1 <= A <= 1000
 * - 1 <= B <= 10^6
 * - 1 <= N <= 10^5
 * - 1 <= C[i] <= 10^6
 * - Time Complexity: O(N log(sum of board lengths))
 *
 * Approach:
 * - Use binary search to find the minimum time required.
 * - For each mid value, check how many painters are needed.
 * - Use greedy allocation: assign boards until time exceeds mid, then switch painter.
 * - Return answer modulo 10000003.
 *
 * Example:
 * Input: A = 2, B = 5, C = [1, 10] → Output: 50
 * Input: A = 10, B = 1, C = [1, 8, 11, 3] → Output: 11
 */
public class Solution {
    public int paint(int A, int B, int[] C) {
        long mod = 10000003;
        long sum = 0;
        long max = 0;
        for(int i = 0; i < C.length; i++) {
            max = Math.max(max, C[i]);
            sum += C[i];
        }
        long left = max * B;
        long right = sum * B;
        long ans = right; // Initialize with worst case
        
        while(left <= right) {
            long m = left + (right - left) / 2;
            int painters = checkPainters(C, m, B); // Fixed: store in int
            
            if(painters > A)
                left = m + 1;
            else {
                ans = m;
                right = m - 1;
            }
        }
        return (int)(ans % mod);
    }
    
    public int checkPainters(int[] arr, long m, int t) { // Fixed: m should be long
        int painters = 1;
        long time = m; // Fixed: use long to prevent overflow
        
        for(int i = 0; i < arr.length; i++) {
            long boardTime = (long)arr[i] * t; // Fixed: use long
            
            // Check if single board exceeds time limit
            if(boardTime > m) {
                return Integer.MAX_VALUE; // Not feasible
            }
            
            if(boardTime <= time) {
                time -= boardTime;
            } else {
                painters++;
                time = m - boardTime;
            }
        }
        return painters;
    }
}