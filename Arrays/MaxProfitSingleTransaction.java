/**
 * Problem: Best Time to Buy and Sell Stock (Single Transaction)
 *
 * Description:
 * Given an array A where A[i] is the stock price on day i,
 * find the maximum profit from a single buy-sell transaction.
 *
 * Constraints:
 * - 0 <= A.length <= 700000
 * - 1 <= A[i] <= 10^7
 *
 * Approach:
 * - Track the minimum price seen so far.
 * - For each price, compute profit if sold today.
 * - Update the maximum profit accordingly.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Example:
 * Input: A = [1, 4, 5, 2, 4]
 * Output: 4
 */
public class Solution {
    public int maxProfit(final int[] A) {
      int n=A.length;
      int min=Integer.MAX_VALUE; int max=0;
      if(n==0)
        return 0;
      for(int i=0;i<n;i++){
        if(A[i]<min)
          min=A[i];
        else{
          int profit=A[i]-min;
          if(profit>max)
            max=profit;
        }
      }
      return max;
    }
}
