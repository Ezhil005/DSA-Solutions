/**
 * Problem: Frequency of Each Element in Array
 *
 * Description:
 * Given an integer array, return a new array where each element at index i
 * represents the frequency of arr[i] in the original array.
 *
 * Example:
 * Input: arr = {3, 4, 1, 5, 1}
 * Output: [1, 1, 2, 1, 2]
 * Explanation:
 * - 3 appears once
 * - 4 appears once
 * - 1 appears twice
 * - 5 appears once
 * - 1 appears twice (again)
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(n)
 */
import java.util.Arrays;

public class Main {
    public static int findk(int[] arr, int k,int n){
        int freq=0;
        for (int i=0;i<n;i++) {
            if (arr[i] == k)
                freq++;
        }
        return freq;
    }
    public static int[] freq(int[] arr){
        int n=arr.length;
        int[] ans=new int[n];
        for (int i=0;i<n;i++){
            ans[i]=findk(arr,arr[i],n);
        }
        return ans;
    }
    public static void main(String[] args){
       int[] arr={3,4,1,5,1};
        System.out.println(Arrays.toString(freq(arr)));
    }
}