/**
 * Problem: Compute aⁿ Using Recursion (Exponentiation by Squaring)
 *
 * Description:
 * Given integers a and n, compute aⁿ using optimized recursion.
 * This uses exponentiation by squaring to reduce time complexity.
 *
 * Approach:
 * - Base case: if n == 0, return 1
 * - Recursive case:
 *     - If n is even: return pow(a, n/2) * pow(a, n/2)
 *     - If n is odd: return pow(a, n/2) * pow(a, n/2) * a
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(log n) due to recursion stack
 *
 * Example:
 * Input: a = 2, n = 10
 * Output: 1024
 */
public class Main {
    public static int pow(int a,int n){
        if (n==0)
            return 1;
        int p=pow(a,n/2);
        if (n%2==0)
            return p*p;
        else
            return p*p*a;
    }
    public static void main(String[] args){
        int a=2; int n=10;
        System.out.print(pow(a,n));
    }
}