/**
 * Problem: Invert Case of Characters in a String
 *
 * Description:
 * Given a string, convert all uppercase letters to lowercase and all lowercase letters to uppercase.
 * Non-alphabetic characters remain unchanged.
 *
 * Example:
 * Input: "HeLLo WoRld"
 * Output: "hEllO wOrLD"
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
       String s="HeLLo WoRld";
       String ans="";
       for (int i=0;i<s.length();i++){
           if (s.charAt(i)>='A' && s.charAt(i)<='Z')
               ans+=(char)(s.charAt(i)+32);
           if (s.charAt(i)>='a' && s.charAt(i)<='z')
               ans+=(char)(s.charAt(i)-32);
       }
        System.out.println(ans);
    }
}