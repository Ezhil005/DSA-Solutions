/**
 * Problem: Print Numbers from 1 to n (Increasing Order)
 *
 * Description:
 * Given an integer n, print numbers from 1 to n using recursion.
 * This uses post-order recursion to print after reaching the base case.
 *
 * Approach:
 * - Base case: if n == 0, return
 * - Recursive case: call inc(n - 1), then print n
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n) due to recursion stack
 *
 * Example:
 * Input: n = 5
 * Output: 12345
 */
public class Main {
    public static void inc(int n){
        if (n==0)
            return;
        inc(n-1);
        System.out.print(n);
    }
    public static void main(String[] args){
        int n=5;
        inc(n);
    }
}