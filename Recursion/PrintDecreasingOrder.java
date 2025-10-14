/**
 * Problem: Print Numbers from n to 1 (Decreasing Order)
 *
 * Description:
 * Given an integer n, print numbers from n to 1 using recursion.
 * This uses pre-order recursion to print before the recursive call.
 *
 * Approach:
 * - Base case: if n == 0, return
 * - Recursive case: print n, then call dec(n - 1)
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n) due to recursion stack
 *
 * Example:
 * Input: n = 5
 * Output: 54321
 */
public class Main {
    public static void dec(int n){
        if (n==0)
            return;
        System.out.print(n);
        dec(n-1);
    }
    public static void main(String[] args){
        int n=5;
        dec(n);
    }
}