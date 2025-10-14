/**
 * Problem: Factorial Using Recursion
 *
 * Description:
 * Given an integer n, compute its factorial using recursion.
 * Factorial of n (n!) is the product of all positive integers from 1 to n.
 *
 * Approach:
 * - Base case: if n == 0, return 1
 * - Recursive case: return n * fact(n - 1)
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n) due to recursion stack
 *
 * Example:
 * Input: n = 5
 * Output: 120
 */
public class Main {
    public static int fact(int n){
        if (n==0)
            return 1;
        return n*fact(n-1);
    }
    public static void main(String[] args){
        int n=5;
        System.out.println(fact(n));
    }
}