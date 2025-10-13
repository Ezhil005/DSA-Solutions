/**
 * Problem: Trapping Rain Water (Two-Pointer Approach)
 *
 * Description:
 * Given an array representing elevation heights, calculate the total amount of water that can be trapped between the bars after raining.
 * This solution uses two pointers to traverse the array from both ends, maintaining the maximum height seen so far from the left and right.
 * At each step, water trapped at the current position is determined by the smaller of the two maximums minus the current height.
 *
 * Approach:
 * - Initialize two pointers: left (l) at 0 and right (r) at n-1.
 * - Track left max (lmax) and right max (rmax) as you move inward.
 * - At each step:
 *     - If lmax < rmax → water trapped at l = lmax - arr[l]; move l++
 *     - Else → water trapped at r = rmax - arr[r]; move r--
 * - Accumulate trapped water in 'ans'.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Example:
 * Input: [2,1,3,2,1,2,4,3,2,1,3,1]
 * Output: 8
 */
public class Main {
    public static void main(String[] args){
        int[] arr={2,1,3,2,1,2,4,3,2,1,3,1};
        int n=arr.length;
        int lmax=0; int rmax=0;
        int l=0; int r=n-1; int ans=0;
        while (l<r){
            if (arr[l]>lmax)
                lmax=arr[l];
            if (arr[r]>rmax)
                rmax=arr[r];
            if (lmax>rmax){
                ans+=rmax-arr[r];
                r--;
            }
            else {
                ans+=lmax-arr[l];
                l++;
            }
        }
        System.out.println(ans);
    }
}