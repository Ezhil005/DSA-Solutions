/**
 * Problem: Check if Substring is a Palindrome
 *
 * Description:
 * Given a string and two indices s and e, check if the substring from index s to e is a palindrome.
 *
 * Approach:
 * - Compare characters from both ends moving inward.
 * - Return false on first mismatch, true if all match.
 *
 * Time Complexity: O(k), where k = e - s + 1
 * Space Complexity: O(1)
 *
 * Example:
 * Input: str = "xzmadamsy", s = 2, e = 6
 * Output: true (substring "madam" is a palindrome)
 */
import java.util.Arrays;

public class Main {
    public static boolean isPali(String str, int s, int e){
        while (s<e){
            if (str.charAt(s)!=str.charAt(e))
                return false;
            else{
                s++; e--;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "xzmadamsy"; int s=2; int e=6;
        System.out.println(isPali(str, s, e));
    }

}