/**
 * Problem: Sort an Array Using Insertion Sort
 *
 * Description:
 * Given an array of integers, sort it in ascending order using the Insertion Sort algorithm.
 * Insertion Sort builds the sorted array one element at a time by comparing and shifting elements.
 *
 * Time Complexity: O(n²) in worst case, O(n) in best case (already sorted)
 * Space Complexity: O(1)
 *
 * Example:
 * Input: {5, 6, 4, 2}
 * Output: [2, 4, 5, 6]
 */
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
       int[] arr={5,6,4,2};
       int n=arr.length;
       for (int i=1;i<n;i++){
           int cur=arr[i];
           int j=i-1;
           while (j>=0 && arr[j]>cur){
               arr[j+1]=arr[j];
               j--;
           }
           arr[j+1]=cur;
       }
        System.out.println(Arrays.toString(arr));
    }
}