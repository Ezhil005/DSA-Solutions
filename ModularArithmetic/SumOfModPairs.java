/**
 * Problem: Sum of A[i] % A[j] Over All Pairs
 *
 * Description:
 * Given an array A, compute the sum of A[i] % A[j] for all possible pairs (i, j).
 * Return the result modulo 10^9 + 7.
 *
 * Constraints:
 * - 1 <= A.length <= 10^5
 * - 1 <= A[i] <= 10^3
 *
 * Approach:
 * - Use a frequency array to count occurrences of each value (since A[i] <= 1000)
 * - Iterate over all possible values i and j from 1 to 1000
 * - For each pair (i, j), compute (i % j) * freq[i] * freq[j]
 * - Accumulate the result modulo 10^9 + 7
 *
 * Time Complexity: O(1000^2) = O(10^6)
 * Space Complexity: O(1000) for frequency array
 *
 * Example:
 * Input: A = [1, 2, 3]
 * Output: 5
 * Explanation: Sum of all A[i] % A[j] = (1%1 + 1%2 + 1%3 + 2%1 + 2%2 + 2%3 + 3%1 + 3%2 + 3%3) = 5
 */
public class Solution {
    public int solve(int[] A) {
        int mod = 1_000_000_007;
        int[] freq=new int[1001];
        for(int val:A){
            freq[val]++;
        }
        long ans=0;
        for(int i=1;i<=1000;i++){
            for(int j=1;j<=1000;j++){
                int val=i%j;
                int temp=freq[i]*freq[j]*val;
                ans=((ans+temp)%mod)%mod;
            }
        }
        return (int) ans;
    }
}
