/**
 * Problem: Two Sum (HashSet Approach)
 *
 * Description:
 * Given an array of integers and a target value k, determine if any two distinct elements in the array sum up to k.
 *
 * Example:
 * Input: [8, 9, 1, -2, 4, 5, 11, -6, 7, 5], k = 11
 * Output: true (because 4 + 7 = 11)
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

import java.util.HashSet;

public class Main {
    public static boolean add(int[] arr, int k){
        int n= arr.length;
        HashSet<Integer> hs=new HashSet<>();
        for (int i=0;i<n;i++){
            if (hs.contains(k-arr[i]))
                return true;
            else
                hs.add(arr[i]);
        }
        return false;
    }
    public static void main(String[] args){
        int[] ar={8,9,1,-2,4,5,11,-6,7,5};
        int k=11;
        System.out.println(add(ar,k));
    }
}