/**
 * Problem: Count Good Subarrays
 *
 * Description:
 * A subarray is considered "good" if:
 * 1. Its length is even and its sum is less than B.
 * 2. Its length is odd and its sum is greater than B.
 *
 * Constraints:
 * - 1 <= A.length <= 5000
 * - 1 <= A[i] <= 1000
 * - 1 <= B <= 10^7
 *
 * Approach:
 * - Use nested loops to generate all subarrays.
 * - Track the sum and length of each subarray.
 * - Apply the two conditions and count valid ones.
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(1)
 *
 * Example:
 * Input: A = [1, 2, 3, 4, 5], B = 4
 * Output: 6
 */
public class Main {
    public static void main(String[] args){
        int[] arr={1, 2, 3, 4, 5}; int b=4;
        int n= arr.length;
        int count=0;
        for (int i=0;i<n;i++){
            int sum=0;
            for (int j=i;j<n;j++){
                sum+=arr[j];
                int length=j-i+1;
                if ((length&1)==0 && sum<b)
                    count++;
                if ((length&1)==1 && sum>b)
                    count++;
            }
        }
        System.out.println(count);
    }
}