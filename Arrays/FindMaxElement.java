/**
 * Problem: Find Maximum Element in Array
 *
 * Description:
 * Given an integer array, find and print the largest element.
 * This approach uses a linear scan and compares each element to the current maximum.
 *
 * Example:
 * Input: arr = {3, 4, 1, 5, 1}
 * Output: 5
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class Main {
    public static void main(String[] args){
       int[] arr={3,4,1,5,1};
       int max=0;
       for (int i=0;i< arr.length;i++) {
           if (arr[i] > max)
               max = arr[i];
       }
       System.out.println(max);
    }
}