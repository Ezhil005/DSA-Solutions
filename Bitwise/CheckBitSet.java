/**
 * Problem: Check if a Specific Bit is Set
 *
 * Description:
 * Given an integer n and a bit index i (0-based from right), check whether the i-th bit is set (i.e., equals 1).
 *
 * Approach:
 * - Use bitwise AND with a mask: (n & (1 << i)) != 0
 * - If result is non-zero, the bit is set; otherwise, it's not.
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 *
 * Example:
 * Input: n = 45 (binary 101101), i = 2
 * Output: true
 */
public class Main {
    public static boolean checkbit(int n, int i){
        if ((n&(1<<i))==0)
            return false;
        return true;
    }
    public static void main(String[] args){
        int n=45; int i=2;
        System.out.println(checkbit(n,i));
    }
}