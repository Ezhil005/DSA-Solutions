/**
 * Problem: Rotate Array to the Right by k Positions (Reversal Algorithm)
 *
 * Description:
 * Given an array of integers and a number `k`, rotate the array to the right by `k` positions.
 * This is done using three reversals:
 * 1. Reverse the entire array
 * 2. Reverse the first `k` elements
 * 3. Reverse the remaining `n - k` elements
 *
 * Example:
 * Input: arr = [1, 2, 3, 4, 5, 6, 7], k = 3
 * Output: [5, 6, 7, 1, 2, 3, 4]
 *
 * Time Complexity: O(n)  
 * Space Complexity: O(1)
 */
import java.util.Arrays;

public class Main {
   public static int[] reverse(int[] arr,int i,int j){
        while (i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;j--;
        }
       return arr;
   }
   public static void rotateK(int[] arr,int n, int k){
       reverse(arr,0,n-1);
       reverse(arr,0,k-1);
       reverse(arr,k,n-1);
   }
   public static void main(String[] args){
       int[] arr={1,2,3,4,5,6,7};
       int n=arr.length;
       int k=3;
       rotateK(arr,n,k);
       System.out.println(Arrays.toString(arr));
   }
}