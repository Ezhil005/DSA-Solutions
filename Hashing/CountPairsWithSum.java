/**
 * Problem: Count Pairs with Given Sum
 *
 * Description:
 * Given an array of integers and a target value k, count the number of pairs (i, j) such that arr[i] + arr[j] = k.
 * Each pair is counted based on frequency, not uniqueness.
 *
 * Example:
 * Input: [2, 5, 4, 2, 2, 4, 5], k = 6
 * Output: 5
 * Explanation: Valid pairs are (2,4), (2,4), (2,4), (5,1), (5,1)
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

import java.util.HashMap;

public class Main {
    public static int countPairs(int[] arr, int k){
        int n=arr.length;int ans=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for (int i=0;i<n;i++){
            int temp=k-arr[i];
            if (hm.containsKey(temp))
                ans+=hm.get(temp);
            hm.put(arr[i], hm.getOrDefault(arr[i],0)+1);
        }
        return ans;
    }
    public static void main(String[] args){
        int[] arr={2,5,4,2,2,4,5};
        int k=6;
        System.out.println(countPairs(arr,k));
    }
}