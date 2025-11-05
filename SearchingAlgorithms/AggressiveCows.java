/**
 * ✅ Aggressive Cows (Binary Search on Answer)
 *
 * Given N stall positions and B cows, assign cows to stalls such that
 * the minimum distance between any two cows is maximized.
 *
 * Constraints:
 * - 2 <= N <= 10^5
 * - 0 <= A[i] <= 10^9
 * - 2 <= B <= N
 * - Time Complexity: O(N log(max - min))
 *
 * Approach:
 * - Sort the stall positions
 * - Use binary search to find the largest minimum distance
 * - Greedily place cows at stalls with at least `mid` distance apart
 *
 * Example:
 * Input: A = [1, 2, 3, 4, 5], B = 3 → Output: 2
 * Cows placed at stalls 1, 3, and 5
 */
public class Solution {
    public int solve(int[] A, int B) {
        Arrays.sort(A);
        int min=Integer.MAX_VALUE; int max=0; int ans=-1;
        for(int i=0;i<A.length;i++){
            min=Math.min(min,A[i]);
            max=Math.max(max,A[i]);
        }
        int l=1; int r=max-min;
        while(l<=r){
            int mid=l+(r-l)/2;
            boolean is_valid=checkCows(A,B,mid);
            if(is_valid==true){
                ans=mid;
                l=mid+1;
            }
            else
              r=mid-1;
        }
        return ans;
    }
    public boolean checkCows(int[] arr,int m,int dist){
        int cows=1; int last_pos=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]-last_pos>=dist){
                cows++;
                last_pos=arr[i];
                if(cows==m)
                   return true;
            }
        }
        return false;
    }
}
