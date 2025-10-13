/**
 * Problem: Longest Common Prefix Among Strings
 *
 * Description:
 * Given an array of strings, return the longest string that is a prefix of all the strings.
 * Uses sorting and compares only the first and last strings for efficiency.
 *
 * Constraints:
 * - 0 <= sum of lengths of all strings <= 1,000,000
 *
 * Time Complexity: O(n log n + m), where m = length of first string
 * Space Complexity: O(1)
 *
 * Example:
 * Input: ["abab", "ab", "abcd"]
 * Output: "ab"
 */
public class Solution {
    public String longestCommonPrefix(String[] A) {
        String ans="";
        Arrays.sort(A);
        String first=A[0];
        String last=A[A.length-1];
        for (int i=0;i<first.length();i++){
            if (first.charAt(i)==last.charAt(i))
              ans+=first.charAt(i);
            else
               break;
        }
        return ans;
        
    }
}
