/**
 * Problem: Sum of First n Natural Numbers (Recursive)
 *
 * Description:
 * Given an integer n, compute the sum of the first n natural numbers using recursion.
 *
 * Approach:
 * - Base case: if n == 1, return 1
 * - Recursive case: return n + sum(n - 1)
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n) due to recursion stack
 *
 * Example:
 * Input: n = 5
 * Output: 15
 */
public static int sum(int n){
    if (n == 1)
        return 1;
    return n + sum(n - 1);
}
