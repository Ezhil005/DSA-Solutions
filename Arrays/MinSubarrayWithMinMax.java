/**
 * Problem: Minimum Length Subarray Containing Both Min and Max
 *
 * Description:
 * Given an array, find the length of the shortest subarray that contains both
 * the minimum and maximum elements of the array.
 *
 * Approach:
 * - First pass: find the global min and max values.
 * - Second pass: track latest indices of min and max.
 * - Update the shortest distance whenever both are seen.
 *
 * Example:
 * Input: arr = {1, 2, 3, 1, 1, 3, 4, 6, 4, 6, 3}
 * Output: 4
 *
 * Time Complexity: O(n)  
 * Space Complexity: O(1)
 */
public class Main {
    public static void main(String[] args){
        int[] arr={1,2,3,1,1,3,4,6,4,6,3};
        int n= arr.length;
        int min_i=-1;
        int max_i=-1;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int ans=Integer.MAX_VALUE;
        for (int i=0;i<n;i++){
            if (arr[i]<min)
                min=arr[i];
            if (arr[i]>max)
                max=arr[i];
        }
        for (int i=0;i<n;i++){
            if (arr[i]==max){
                max_i=i;
                if (min_i!=-1)
                    ans=Math.min(ans,Math.abs(max_i-min_i)+1);
            }
            if (arr[i]==min){
                min_i=i;
                if (max_i!=-1){
                    ans=Math.min(ans,Math.abs(max_i-min_i)+1);
                }
            }
        }
        System.out.println(ans);
    }
}