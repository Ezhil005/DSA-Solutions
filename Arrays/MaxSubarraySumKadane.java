/**
 * Problem: Maximum Sum of Contiguous Subarray (Kadane's Algorithm)
 *
 * Description:
 * Given an array of integers (positive and negative), find the maximum sum of any contiguous subarray.
 * Uses Kadane’s Algorithm to track local and global maxima.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Example:
 * Input: {-2, 3, 4, -1, 5, -10, 7}
 * Output: 11
 */
public class Main {
    public static void main(String[] args){
        int[] arr={-2,3,4,-1,5,-10,7};
        int n= arr.length;
        int temp_sum=0;int ans=0;
        for (int i=0;i<n;i++){
            temp_sum+=arr[i];
            if (temp_sum>ans)
                ans=temp_sum;
            if (temp_sum<0)
                temp_sum=0;
        }
        System.out.println(ans);
    }
}