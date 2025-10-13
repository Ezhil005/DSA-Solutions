/**
 * Problem: Longest Palindromic Substring (Length Only)
 *
 * Description:
 * Given a string, return the length of the longest palindromic substring.
 * Uses center expansion to check all possible centers (odd and even).
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(1)
 *
 * Example:
 * Input: "feacabacabgf"
 * Output: 7 (substring "acabaca")
 */
import java.util.Arrays;

public class Main {
    public static int expand(String str, int l, int r){
        while (l>=0 && r<str.length()){
            if (str.charAt(l)==str.charAt(r)){
                l--;r++;}
            else
                break;;
        }
        return r-l-1;
    }
    public static int longestPali(String str){
        int ans=0;
        for (int i=0;i<str.length();i++){
            int local_maxima=expand(str,i,i);
            ans=Math.max(ans,local_maxima);
            local_maxima=expand(str,i,i+1);
            ans=Math.max(ans,local_maxima);
        }
        return ans;
    }
    public static void main(String[] args) {
        String str = "feacabacabgf";
        System.out.println(longestPali(str));
    }

}