/**
 * Problem: Subarray with Least Average
 *
 * Description:
 * Given an array A of size N, find the starting index of the subarray of size B
 * that has the least average.
 *
 * Constraints:
 * - 1 <= B <= N <= 10^5
 * - -10^5 <= A[i] <= 10^5
 *
 * Approach:
 * - Use a sliding window of size B to track the sum.
 * - Update the minimum sum and its starting index as the window slides.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Example:
 * Input: A = [3, 7, 90, 20, 10, 50, 40], B = 3
 * Output: 3
 */
public class Main {
    public static void main(String[] args){
        int[] arr={3, 7, 90, 20, 10, 50, 40}; int b=3;
        int n= arr.length; int minsum=0; int sum=0; int minidx=0;
        for (int i=0;i<b;i++) {
            sum += arr[i];
        }
        minsum=sum;
        for (int i=b;i<n;i++){
            sum=sum-arr[i-b]+arr[i];
            if(sum<minsum){
                minsum=sum;
                minidx=i-b+1;
            }
        }
        System.out.println(minidx);
    }
}