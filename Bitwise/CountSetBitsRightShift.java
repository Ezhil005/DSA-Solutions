/**
 * Problem: Count Set Bits Using Right Shift
 *
 * Description:
 * Given an integer n, count how many bits are set to 1 in its binary representation.
 * This solution uses bitwise AND with 1 and right-shifts the number until it becomes 0.
 *
 * Approach:
 * - While n > 0:
 *     - Check if the least significant bit is set using (n & 1)
 *     - If set, increment count
 *     - Right shift n by 1 to move to the next bit
 *
 * Time Complexity: O(log n) — proportional to the number of bits in n
 * Space Complexity: O(1)
 *
 * Example:
 * Input: n = 45 (binary 101101)
 * Output: 4
 */
public class Main {
    public static int countbits(int n){
        int count=0;
        while (n>0){
            if ((n&1)==1)
                count++;
            n=n>>1;
        }
        return count;
    }
    public static void main(String[] args){
        int n=45;
        System.out.println(countbits(n));
    }
}