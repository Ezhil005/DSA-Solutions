/**
 * Problem: Valid Anagram
 * Description: Check if two strings are anagrams of each other.
 * Input: s = "listen", t = "silent"
 * Output: true
 * Explanation: Both strings contain the same characters in any order.
 * Time Complexity: O(n log n) due to sorting
 * Space Complexity: O(n)
 */

import java.util.Arrays;

public class AnagramCheck {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a, b);
    }
}
