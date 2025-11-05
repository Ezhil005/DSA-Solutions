/**
 * ✅ Square Root of Integer (Binary Search)
 *
 * Given a non-negative integer A, compute and return floor(sqrt(A)).
 * If A is a perfect square, return its square root.
 * If not, return the greatest integer less than the actual square root.
 *
 * Constraints:
 * - 0 <= A <= 10^9
 * - Time Complexity: O(log A)
 * - Do not use built-in sqrt() function
 *
 * Approach:
 * - Use binary search between 1 and A
 * - Use long to avoid overflow when computing m * m
 * - Track the last valid m where m * m <= A
 *
 * Example:
 * Input: A = 11 → Output: 3
 * Input: A = 9  → Output: 3
 */
public class Solution {
    public int sqrt(int A) {
        long ans = 0;
        long l = 1;
        long r = A;
        while (l <= r) {
            long m = l + (r - l) / 2;
            long sqr = m * m;
            if (sqr == A)
                return (int) m;
            if (sqr > A)
                r = m - 1;
            else {
                ans = m;
                l = m + 1;
            }
        }
        return (int) ans;
    }
}
