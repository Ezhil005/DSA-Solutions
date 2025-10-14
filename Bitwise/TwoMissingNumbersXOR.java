/**
 * Problem: Find Two Missing Numbers from 1 to n+2
 *
 * Description:
 * Given an array A of size n containing distinct integers from 1 to n+2 with two numbers missing,
 * find the missing numbers and return them in sorted order.
 *
 * Approach:
 * - XOR all elements of A and all numbers from 1 to n+2 to get xor = missing1 ^ missing2
 * - Find the rightmost set bit in xor to partition numbers into two groups
 * - XOR each group separately to isolate the two missing numbers
 * - Return the result in sorted order
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Example:
 * Input: A = [1, 2, 4, 6]
 * Output: [3, 5]
 */
public class Solution {
    public int[] solve(int[] A) {
        int n=A.length;
        int[] ans=new int[2];
        int xor=0;
        for(int i=0;i<n;i++)
            xor=xor^A[i];
        for(int i=1;i<=n+2;i++)
            xor=xor^i;
        int bit=1;
        while((bit&xor)==0){
            bit=bit<<1;
        }
        int x=0; int y=0;
        for(int i=0;i<n;i++){
            if((A[i]&bit)>0)
                x=x^A[i];
            else
                y=y^A[i];
        }
        for(int i=1;i<=n+2;i++){
            if((i&bit)>0)
               x=x^i;
            else 
               y=y^i;
        }
        ans[0]=Math.min(x,y);
        ans[1]=Math.max(x,y);
        return ans;
    }
}
