/**
 * Problem: Count Total Factors of a Number
 *
 * Description:
 * Given an integer n, count how many numbers from 1 to n divide n exactly (i.e., n % i == 0).
 * These are called the factors or divisors of n.
 *
 * Example:
 * Input: n = 24
 * Output: 8
 * Explanation: The factors of 24 are [1, 2, 3, 4, 6, 8, 12, 24]
 *
 * Time Complexity: O(√n)
 * Space Complexity: O(1)
 */

public class Main {
    public static void main(String[] args){
        int n = 24;
        int factors = 0;

        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                if (i * i == n)
                    factors++; // perfect square, count only once
                else
                    factors += 2; // count both i and n/i
            }
        }

        System.out.println(factors);
    }
}
