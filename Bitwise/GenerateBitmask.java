/**
 * Problem: Generate a Custom Bitmask
 *
 * Description:
 * Given integers b and c, generate a bitmask with the lowest b bits set to 1,
 * then left-shift the result by c positions.
 *
 * Approach:
 * - Loop from i = 0 to b - 1 and set each bit using (1 << i)
 * - After building the mask, shift it left by c bits
 *
 * Time Complexity: O(b)
 * Space Complexity: O(1)
 *
 * Example:
 * Input: b = 3, c = 2
 * Output: 28 (binary 00011100)
 */
public class Main {
    public static void main(String[] args){
        int a=4; int b=3; int c=2;
        int ans=0;
        for (int i=0;i<b;i++){
            ans=ans|(1<<i);
        }
        ans=ans<<c;
        System.out.println(ans);
    }
}