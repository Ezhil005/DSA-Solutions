/**
 * Problem: Check for Subarray with Zero Sum
 *
 * Description:
 * Given an array of integers, determine whether there exists a subarray whose sum is zero.
 * Uses prefix sums and a HashSet to detect repeated cumulative sums.
 *
 * Example:
 * Input: [1, 2, -3, 4, 5]
 * Output: true (because [1, 2, -3] sums to 0)
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

import java.util.HashSet;

public class Main {
    public static boolean zeroSub(int[] arr){
        HashSet<Integer> hs=new HashSet<>();
        int n=arr.length;
        int[] pf=new int[n];
        pf[0]=arr[0];
        for (int i=1;i<n;i++){
            pf[i]=pf[i-1]+arr[i];
            if (pf[i]==0 || hs.contains(pf[i]))
                return true;
            hs.add(pf[i]);
        }
        return false;
    }
    public static void main(String[] args){
        int[] arr={1,2,-3,4,5};
        System.out.println(zeroSub(arr));
    }
}