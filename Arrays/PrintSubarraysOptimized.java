/**
 * Problem: Print All Subarrays in O(n²) Using StringBuffer
 *
 * Description:
 * Print all contiguous subarrays of a given array using nested loops and incremental StringBuffer.
 * This avoids a third loop and achieves O(n²) time complexity.
 *
 * Example:
 * Input: arr = {2, 8, -1, 4}
 * Output: Each subarray printed line by line
 *
 * Time Complexity: O(n²)  
 * Space Complexity: O(1)
 */
public class Main {
    public static void main(String[] args){
        int[] arr={2,8,-1,4};
        int n= arr.length;
        for (int s=0;s<n;s++){
            StringBuffer subarray=new StringBuffer();
            for (int e=s;e<n;e++){
                subarray.append(arr[e]).append(" ");
                System.out.println(subarray);
            }
        }
    }
}