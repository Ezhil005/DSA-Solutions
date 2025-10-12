/**
 * Problem: Reverse a 1D Array In-Place
 *
 * Description:
 * Given an array of integers, reverse its elements using two-pointer swapping.
 * The reversal is done in-place without using extra space.
 *
 * Example:
 * Input: [1, 2, 3, 4, 5]
 * Output: [5, 4, 3, 2, 1]
 *
 * Time Complexity: O(n)  
 * Space Complexity: O(1)
 */

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        int n=arr.length;
        int i=0; int j=n-1;
        while (i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;j--;
        }
        System.out.println(Arrays.toString(arr));
    }
}