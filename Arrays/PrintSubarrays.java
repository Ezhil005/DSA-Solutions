/**
 * Problem: Print All Subarrays of an Array
 *
 * Description:
 * Given an array, print all possible contiguous subarrays using nested loops.
 *
 * Example:
 * Input: arr = {2, 8, -1, 4}
 * Output: Each subarray printed line by line
 *
 * Time Complexity: O(n^3) (due to printing each element in each subarray)  
 * Space Complexity: O(1)
 */

public class Main {
    public static void main(String[] args){
        int[] arr={2,8,-1,4};
        int n= arr.length;
        for (int s=0;s<n;s++){
            for (int e=s;e<n;e++){
                for (int i=s;i<=e;i++)
                    System.out.print(arr[i]+" ");
                System.out.println();
            }
        }
    }
}