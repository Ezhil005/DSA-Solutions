/**
 * Problem: Maximum Sum of B Removed Elements (Front or Back)
 *
 * Description:
 * Given an array A and an integer B, remove B elements from either end (front or back)
 * to maximize the sum of removed elements.
 *
 * Constraints:
 * - 1 <= A.length <= 10^5
 * - 1 <= B <= A.length
 * - -10^3 <= A[i] <= 10^3
 *
 * Approach:
 * - Start with sum of first B elements.
 * - Slide one element from front to back in each step.
 * - Track the maximum sum across all such combinations.
 *
 * Time Complexity: O(B)
 * Space Complexity: O(1)
 *
 * Example:
 * Input: A = [5, -2, 3, 1, 2], B = 3
 * Output: 8
 */
public class Main {
    public static void main(String[] args){
        int[] arr={5,-2,3,1,2}; int b=3;
        int n= arr.length;
        int ans=0;int sum=0;
        int t1=b-1; int t2=n-1;
        for (int i=0;i<b;i++){
            sum+=arr[i];
        }
        ans=sum;
        while (t1>=0){
            sum=sum-arr[t1]+arr[t2];
            if (sum>ans)
                ans=sum;
            t1--;t2--;
        }
        System.out.println(ans);
    }
}