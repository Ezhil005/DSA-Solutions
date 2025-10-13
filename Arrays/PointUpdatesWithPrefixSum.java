/**
 * Problem: Apply Point Updates and Compute Prefix Sum
 *
 * Description:
 * Given an array and a list of point updates, apply each update and compute the final prefix sum.
 * Each update is of the form {index, value}, meaning ar[index] += value.
 *
 * Time Complexity: O(n + q), where n = array size, q = number of updates
 * Space Complexity: O(1)
 *
 * Example:
 * Input: ar = [0,0,0,0,0,0,0,0], Q = {{3,4},{1,3},{4,-2},{4,5}}
 * Output: [0, 3, 3, 7, 10, 10, 10, 10]
 */
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        int[] ar={0,0,0,0,0,0,0,0};
        int n=ar.length;
        int[][] Q={{3,4},{1,3},{4,-2},{4,5}};
        for (int q=0;q<Q.length;q++){
            int start=Q[q][0];
            int val=Q[q][1];
            ar[start]=ar[start]+val;
        }
        for (int i=1;i<n;i++){
            ar[i]=ar[i-1]+ar[i];
        }
        System.out.println(Arrays.toString(ar));
    }
}