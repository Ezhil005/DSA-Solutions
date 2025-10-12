/**
 * Problem: Find Second Largest Element in Array
 *
 * Description:
 * Given an integer array, find and print the second largest element.
 * This approach uses a single pass with two variables: `firstl` and `secondl`.
 *
 * Example:
 * Input: arr = {1, 2, 3, 4, 5}
 * Output: 4
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
       int[] arr={1,2,3,4,5};
       int firstl=Integer.MIN_VALUE;
       int secondl=Integer.MIN_VALUE;
       int n=arr.length;
       for (int i=0;i<n;i++){
           if (arr[i]>firstl){
               secondl=firstl;
               firstl=arr[i];
           } else if (arr[i]>secondl && firstl!=secondl) {
               secondl=arr[i];
           }
       }
        System.out.println(secondl);
    }
}