/**
 * Problem: Sum of XORs of All Pairs
 *
 * Description:
 * Given an array of integers, compute the sum of XORs of all unique pairs (i < j).
 * This solution uses bitwise contribution analysis to avoid brute-force pairwise XOR.
 *
 * Approach:
 * - For each bit position (0 to 31):
 *     - Count how many numbers have the bit set (ones) and unset (zeros)
 *     - Each (1,0) pair contributes (1 << i) to the total sum
 *     - Total contribution: ones * zeros * (1 << i)
 *
 * Time Complexity: O(32 * n) = O(n)
 * Space Complexity: O(1)
 *
 * Example:
 * Input: [1, 2, 3]
 * Output: 6
 */
import java.util.Arrays;

public class Main {
    public static int sum(int[] arr) {
       int n=arr.length;int ans=0;
       for (int i=0;i<32;i++){
           int ones=0;
           int zeros=0;
           for (int j=0;j<n;j++){
               if ((arr[j]&(1<<i))==0)
                   zeros++;
               else
                   ones++;
           }
           int pairs=ones*zeros;
           int contri=pairs*(1<<i);
           ans+=contri;
       }
       return ans;
    }
    public static void main(String[] args){
        int[] arr={1,2,3};
        System.out.println(sum(arr));
    }
}