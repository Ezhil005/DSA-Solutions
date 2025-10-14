/**
 * Problem: Find First Index of a Target Element (Recursive)
 *
 * Description:
 * Given an array and a target value b, return the first index where b occurs.
 * This solution uses recursion with pre-order traversal to return as soon as a match is found.
 *
 * Approach:
 * - Base case: if idx == a.length, return -1 (not found)
 * - If a[idx] == b, return idx
 * - Else, recurse to next index
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n) due to recursion stack
 *
 * Example:
 * Input: arr = {4, 3, 5, 2, 1, 5}, b = 5
 * Output: 2
 */
import java.util.Arrays;

public class Main {
    public static int firstidx(int[] a, int idx, int b){
        if (a.length==idx)
           return -1;
        if (a[idx]==b)
           return idx;
        return firstidx(a,idx+1,b);
    }
    public static void main(String[] args){
        int[] arr={4,3,5,2,1,5};
        int b=5;
        System.out.println(firstidx(arr,0,b));
    }
}