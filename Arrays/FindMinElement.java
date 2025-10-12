/**
 * Problem: Find Minimum Element in Array
 *
 * Description:
 * Given an integer array, find and print the smallest element.
 * This approach initializes `min` to Integer.MAX_VALUE and updates it while scanning.
 *
 * Example:
 * Input: arr = {3, 4, 1, 5, 1}
 * Output: 1
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class Main {
    public static void main(String[] args){
       int[] arr={3,4,1,5,1};
       int min=Integer.MAX_VALUE;
       for (int i=0;i< arr.length;i++) {
           if (arr[i] < min)
               min = arr[i];
       }
       System.out.println(min);
    }
}