/**
 * ✅ Ath Magical Number (Binary Search + Inclusion-Exclusion)
 *
 * A magical number is any positive integer divisible by either B or C.
 * This program finds the Ath smallest magical number using binary search and LCM logic.
 * Since the result may be large, it returns the answer modulo 10^9 + 7.
 *
 * Constraints:
 * - 1 <= A <= 10^9
 * - 2 <= B, C <= 40000
 * - Time Complexity: O(log(A * min(B, C)))
 *
 * Approach:
 * - Use binary search to find the smallest number such that count of magical numbers ≤ mid is at least A
 * - Use inclusion-exclusion: count = mid/B + mid/C - mid/lcm(B, C)
 * - Use long to avoid overflow
 *
 * Example:
 * Input: A = 4, B = 2, C = 3 → Output: 6
 * Magical numbers: 2, 3, 4, 6
 */
public class Solution {
    public int solve(int A, int B, int C) {
        long mod=1000000007L;
        long ans=0;
        long lcm=(long)B*C/gcd(B,C);
        long l=1; long r=(long)A*Math.min(B,C); 
        while(l<=r){
            long mid=l+(r-l)/2;
            long count=mid/B+mid/C-mid/lcm;
            if(count==A){
                ans=mid;
                r=mid-1;
            }
            else if(count<A)
               l=mid+1;
            else if(count>A)
              r=mid-1;
        }
        return (int)(ans%mod);
    }
    public static int gcd(int a,int b){
        if(b==0)
          return a;
        int ans=gcd(b,a%b);
        return ans;
    }
}
