/**
 * Problem: Maximum Sum of Subarray of Size k
 *
 * Description:
 * Given an array and a window size k, find the maximum sum of any contiguous subarray of size k.
 *
 * Approach:
 * - Use a sliding window to maintain the sum of the current subarray.
 * - Update the maximum sum as the window slides.
 *
 * Example:
 * Input: arr = {-3, 4, -2, 5, 3, -2, 8, 2, -1, 4}, k = 5
 * Output: 16
 *
 * Time Complexity: O(n)  
 * Space Complexity: O(1)
 */
public class Main {
    public static void main(String[] args){
        int[] arr={-3,4,-2,5,3,-2,8,2,-1,4}; int k=5;
        int n= arr.length;
        int sum=0; int ans=0;
        for (int i=0;i<k;i++){
            sum+=arr[i];
        }
        ans=sum;
        int s=1; int e=k;
        while (e<n){
            sum=sum-arr[s-1]+arr[e];
            if (sum>ans)
                ans=sum;
            s++;e++;
        }
        System.out.println(ans);
    }
}