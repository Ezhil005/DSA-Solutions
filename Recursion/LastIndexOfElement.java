/**
 * Problem: Find Last Index of a Target Element (Recursive)
 *
 * Description:
 * Given an array and a target value b, return the last index where b occurs.
 * This solution uses reverse recursion from the end of the array.
 *
 * Approach:
 * - Base case: if idx < 0, return -1 (not found)
 * - If a[idx] == b, return idx
 * - Else, recurse to idx - 1
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n) due to recursion stack
 *
 * Example:
 * Input: arr = {4, 3, 5, 2, 1, 5}, b = 5
 * Output: 5
 */
import java.util.Arrays;

public class Main {
    public static int lastidx(int[] a, int idx, int b){
        if (a.length==idx)
           return -1;
        if (a[idx]==b)
           return idx;
        return lastidx(a,idx-1,b);
    }
    public static void main(String[] args){
        int[] arr={4,3,5,2,1,5};
        int b=5;
        System.out.println(lastidx(arr,arr.length-1,b));
    }
}