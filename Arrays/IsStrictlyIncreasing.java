/**
 * Problem: Check if Array is Strictly Increasing
 *
 * Description:
 * Given an integer array, determine whether it is strictly increasing.
 * A strictly increasing array satisfies: arr[i] > arr[i - 1] for all i > 0.
 *
 * Example:
 * Input: arr = {1, 2, 3, 4, 5}
 * Output: true
 *
 * Input: arr = {1, 2, 2, 3}
 * Output: false
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
import java.util.Arrays;

public class Main {
    public static boolean isIncreasing(int[] arr){
        int n=arr.length;
        for (int i=1;i<n;i++){
            if (arr[i-1]<arr[i])
               continue;
            else
                return false;
        }
        return true;
    }
    public static void main(String[] args){
       int[] arr={1,2,3,4,5};
        System.out.println(isIncreasing(arr));
    }
}