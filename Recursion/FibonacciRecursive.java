/**
 * Problem: Fibonacci Number Using Recursion
 *
 * Description:
 * Given an integer n, compute the n-th Fibonacci number using recursion.
 * The Fibonacci sequence is defined as:
 *   fib(0) = 0, fib(1) = 1
 *   fib(n) = fib(n - 1) + fib(n - 2)
 *
 * Approach:
 * - Base case: if n <= 1, return n
 * - Recursive case: return fib(n - 1) + fib(n - 2)
 *
 * Time Complexity: O(2^n) — exponential due to repeated subproblems
 * Space Complexity: O(n) — due to recursion stack
 *
 * Example:
 * Input: n = 6
 * Output: 8
 */
public class Main {
    public static int fib(int n){
        if (n<=1)
            return n;
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args){
        int n=6;
        System.out.print(fib(n));
    }
}