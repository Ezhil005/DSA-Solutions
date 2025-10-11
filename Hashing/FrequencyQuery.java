
/**
 * Problem: Frequency Query
 * Description: Given an array and a list of queries, return the frequency of each queried element.
 * Input: arr = [2,6,3,8,2,8,2,3,8,10,6], q = [2,8,3,5]
 * Output: 3, 3, 2, 0
 * Time Complexity: O(n + Q)
 * Space Complexity: O(n)
 */

import java.util.HashMap;

public class Main {
    public static void main(String[] args){
        int[] arr={2,6,3,8,2,8,2,3,8,10,6};
        int Q=4;
        int[] q={2,8,3,5};
        int n=arr.length;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for (int i=0;i<n;i++){
            if (hm.containsKey(arr[i]))
                hm.put(arr[i],hm.get(arr[i])+1);
            else
                hm.put(arr[i],1);
        }
        for (int i=0;i<Q;i++){
            if (hm.containsKey(q[i]))
                System.out.println(hm.get(q[i]));
            else
                System.out.println(0);
        }
    }
}