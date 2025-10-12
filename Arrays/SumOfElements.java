/**
 * Problem: Sum of Array Elements
 *
 * Description:
 * Given an integer array, calculate and print the sum of all its elements.
 *
 * Example:
 * Input: arr = {3, 4, 1, 5, 1}
 * Output: 14
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class Main {
    public static void main(String[] args){
       int[] arr={3,4,1,5,1};
       int sum=0;
       for (int i=0;i< arr.length;i++)
           sum+=arr[i];
        System.out.println(sum);
    }
}