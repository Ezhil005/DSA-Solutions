/**
 * Problem: Sum of First and Last Elements in Each Subarray of Size k
 *
 * Description:
 * Given an array and a window size k, print the sum of the first and last elements
 * of each contiguous subarray of size k.
 *
 * Example:
 * Input: arr = {3, 4, 7, 2, 8}, k = 3
 * Output: 10, 6, 15
 *
 * Time Complexity: O(n)  
 * Space Complexity: O(1)
 */
public class Main {
    public static void main(String[] args){
        int[] arr={3,4,7,2,8}; int k=3;
        int n= arr.length;
        int s=0; int e=k-1;
        while (e<n){
            System.out.println(arr[s]+arr[e]);
            s++;e++;
        }
    }
}