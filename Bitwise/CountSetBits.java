/**
 * Problem: Count Set Bits in an Integer
 *
 * Description:
 * Given an integer n, count how many bits are set to 1 in its 32-bit binary representation.
 * This solution uses bit masking and a custom checkBit(i) method to inspect each bit.
 *
 * Approach:
 * - Loop from i = 0 to 31
 * - For each bit position, use (n & (1 << i)) to check if the bit is set
 * - Increment count if set
 *
 * Time Complexity: O(32) = O(1)
 * Space Complexity: O(1)
 *
 * Example:
 * Input: n = 45 (binary 101101)
 * Output: 4
 */
public class Main {
    public static boolean checkbit(int n, int i){
        if ((n&(1<<i))==0)
            return false;
        return true;
    }
    public static int countbits(int n){
        int count=0;
        for (int i=0;i<32;i++){
            if (checkbit(n,i))
                count++;
        }
        return count;
    }
    public static void main(String[] args){
        int n=45;
        System.out.println(countbits(n));
    }
}