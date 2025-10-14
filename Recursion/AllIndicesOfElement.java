/**
 * Problem: Find All Indices of a Target Element (Recursive)
 *
 * Description:
 * Given an array and a target value b, return an array of all indices where b occurs.
 * This solution uses recursion with post-processing to build the result array from the end.
 *
 * Approach:
 * - Base case: if idx == a.length, return new int[count]
 * - If a[idx] == b, increment count
 * - Recurse to next index
 * - On the way back, if a[idx] == b, store idx at arr[count - 1]
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n) for recursion + O(k) for result array (k = number of matches)
 *
 * Example:
 * Input: arr = {4, 5, 3, 5, 2, 1, 5}, b = 5
 * Output: [1, 3, 6]
 */
import java.util.Arrays;

public class Main {
    public static int[] allindices(int[] a, int idx, int count, int b){
        if (a.length==idx)
            return new int[count];
        if (a[idx]==b)
            count++;
        int[] arr=allindices(a,idx+1,count,b);
        if (a[idx]==b)
            arr[count-1]=idx;
        return arr;
    }
    public static void main(String[] args){
        int[] arr={4,5,3,5,2,1,5};
        int b=5;
        System.out.println(Arrays.toString(allindices(arr,0,0,b)));
    }
}