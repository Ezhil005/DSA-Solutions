/**
 * Problem: First Non-Repeating Element in an Array
 *
 * Description:
 * Given an array of integers, return the first element that appears only once.
 * If no such element exists, return -1.
 *
 * Example:
 * Input: [1, 2, 3, 1, 5, 2]
 * Output: 3
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static int nonre(int[] arr){
        HashMap<Integer,Integer> hm=new HashMap<>();
        int n= arr.length;
        for (int i=0;i<n;i++){
            if (hm.containsKey(arr[i]))
                hm.put(arr[i], hm.get(arr[i])+1);
            else
                hm.put(arr[i],1);
        }
        for (int i=0;i<n;i++){
            if (hm.get(arr[i])==1)
                return arr[i];
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr={1,2,3,1,5,2};
        int n=arr.length;
        System.out.println(nonre(arr));
    }
}