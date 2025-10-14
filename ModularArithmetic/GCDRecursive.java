/**
 * Problem: Compute GCD Using Recursion (Euclidean Algorithm)
 *
 * Description:
 * Given two integers a and b, compute their greatest common divisor (GCD).
 * This uses the Euclidean algorithm: gcd(a, b) = gcd(b, a % b)
 *
 * Approach:
 * - Base case: if b == 0, return a
 * - Recursive case: return gcd(b, a % b)
 *
 * Time Complexity: O(log min(a, b))
 * Space Complexity: O(log min(a, b)) due to recursion stack
 *
 * Example:
 * Input: a = 24, b = 16
 * Output: 8
 */
public class Main {
    public static int gcd(int a, int b){
        if (b==0)
            return a;
        return gcd(b,a%b);
    }
    public static void main(String[] args){
        int a=24; int b=16;
        System.out.println(gcd(a,b));
    }
}