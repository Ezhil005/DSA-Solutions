/**
 * Problem: Subarray with Given Sum (Prefix Sum + HashSet)
 *
 * Description:
 * Given an array of integers and a target value k, determine whether there exists a subarray whose sum is exactly k.
 * Uses prefix sums and a HashSet to detect whether any subarray sums to k.
 *
 * Example:
 * Input: [1, 2, 3, 4, 5], k = 5
 * Output: true (because [2, 3] or [5] sums to 5)
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */


import java.util.HashSet;

public class Main {
    public static boolean zeroSub(int[] arr,int k){
        HashSet<Integer> hs=new HashSet<>();
        int n=arr.length;
        int[] pf=new int[n];
        pf[0]=arr[0];
        for (int i=1;i<n;i++) {
            pf[i] = pf[i - 1] + arr[i];
        }
        for (int i=0;i<n;i++){
            if (pf[i]==k || hs.contains(pf[i]-k))
                return true;
            hs.add(pf[i]);
        }
        return false;
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,5}; int k=5;
        System.out.println(zeroSub(arr,k));
    }
}