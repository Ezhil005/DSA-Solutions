/**
 * Problem: Sort an Array Using Selection Sort
 *
 * Description:
 * Given an array of integers, sort it in ascending order using the Selection Sort algorithm.
 * Selection Sort repeatedly finds the minimum element from the unsorted part and places it at the beginning.
 *
 * Time Complexity: O(n²)
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
       for (int i=0;i<n-1;i++){
           int min_i=i;
           for (int j=i+1;j<n;j++){
               if (arr[j]<arr[min_i])
                   min_i=j;
           }
           int temp=arr[i];
           arr[i]=arr[min_i];
           arr[min_i]=temp;
       }
        System.out.println(Arrays.toString(arr));
    }
}