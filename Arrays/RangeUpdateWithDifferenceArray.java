/**
 * Problem: Efficient Range Updates Using Difference Array
 *
 * Description:
 * Given an array of size n and a list of range update queries,
 * each query modifies all elements from index 'start' to 'end' by adding 'val'.
 * This solution uses a difference array to apply each update in O(1) time,
 * followed by a prefix sum to compute the final values.
 *
 * Approach:
 * - For each query [start, end, val]:
 *     - Add 'val' to ar[start]
 *     - Subtract 'val' from ar[end + 1] (if within bounds)
 * - After all updates, compute prefix sum to finalize the array.
 *
 * Time Complexity: O(n + q), where q = number of queries
 * Space Complexity: O(1) (in-place updates)
 *
 * Example:
 * Initial array: [0, 0, 0, 0, 0, 0, 0, 0]
 * Queries:
 *   [3, 6, 3]   → add 3 to indices 3 to 6
 *   [2, 4, -2]  → subtract 2 from indices 2 to 4
 *   [1, 3, 4]   → add 4 to indices 1 to 3
 * Final output: [0, 4, 2, 5, 1, 3, 3, 0]
 */
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        int[] ar={0,0,0,0,0,0,0,0};
        int n=ar.length;
        int[][] Q={{3,6,3},{2,4,-2},{1,3,4}};
        for (int q=0;q<Q.length;q++){
            int start=Q[q][0];
            int end=Q[q][1];
            int val=Q[q][2];
            ar[start]=ar[start]+val;
            if (end+1<n) {
                ar[end + 1] += (-1) * val;
            }
        }
        for (int i=1;i<n;i++){
            ar[i]=ar[i-1]+ar[i];
        }
        System.out.println(Arrays.toString(ar));
    }
}