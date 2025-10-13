/**
 * Problem: Sum of All Subarray Elements Efficiently
 *
 * Description:
 * Compute the sum of all elements across all subarrays of a given array.
 * Instead of generating subarrays, use contribution counting:
 * Each element arr[i] appears in (i + 1) * (n - i) subarrays.
 *
 * Example:
 * Input: arr = {2, 4, 1, 3}
 * Output: 50
 *
 * Time Complexity: O(n)  
 * Space Complexity: O(1)
 */
public class Main {
    public static void main(String[] args){
        int[] arr={2,4,1,3};
        int n= arr.length;
        int ans=0;
        for (int i=0;i<n;i++){
            ans+=(i+1)*(n-i)*arr[i];
        }
        System.out.println(ans);
    }
}