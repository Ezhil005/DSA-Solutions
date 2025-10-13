/**
 * Problem: Maximum Subarray Sum (Brute Force)
 *
 * Description:
 * Given an array, find the maximum sum of any contiguous subarray.
 * This approach checks all subarrays starting at each index.
 *
 * Example:
 * Input: arr = {1, 2, 3}
 * Output: 6
 *
 * Time Complexity: O(n²)  
 * Space Complexity: O(1)
 */
public class Main {
    public static void main(String[] args){
        int[] arr={1,2,3};
        int n= arr.length;
        int ans=0;
        for (int s=0;s<n;s++){
            int sum=0;
            for (int e=s;e<n;e++){
                sum+=arr[e];
                if (sum>ans)
                    ans=sum;
            }
        }
        System.out.println(ans);
    }
}