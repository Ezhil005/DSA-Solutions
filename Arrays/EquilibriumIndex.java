/**
 * Problem: Find Equilibrium Index in Array
 *
 * Description:
 * An equilibrium index is an index such that the sum of elements to its left
 * is equal to the sum of elements to its right.
 * This solution uses prefix sums to compute left and right sums efficiently.
 *
 * Approach:
 * - Build a prefix sum array.
 * - For each index i:
 *     - Left sum = prefix[i - 1] (or 0 if i == 0)
 *     - Right sum = prefix[n - 1] - prefix[i]
 *     - If left sum == right sum → return i
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * Example:
 * Input: [-7, 1, 5, 2, -4, 3, 0]
 * Output: 3 (index 3 is the equilibrium point)
 */
public class Main {
    public static int eqIdx(int[] arr){
        int n=arr.length;
        int[] pf=new int[n];
        pf[0]=arr[0];
        for (int i=1;i<n;i++){
            pf[i]=pf[i-1]+arr[i];
        }
        for (int i=0;i<n;i++){
            int leftsum=0;
            if (i==0)
                leftsum=0;
            else
                leftsum=pf[i-1];
            if (leftsum==pf[n-1]-pf[i])
                return i;
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr={-7,1,5,2,-4,3,0};
        System.out.println(eqIdx(arr));
    }
}