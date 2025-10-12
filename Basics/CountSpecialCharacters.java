/**
 * Problem: Count Special Characters in a String
 *
 * Description:
 * Given a string, count and return the number of characters that are not letters (A–Z, a–z) or digits (0–9).
 *
 * Example:
 * Input: "!@#hello()&"
 * Output: 6
 *
 * Time Complexity: O(n) where n = length of the string  
 * Space Complexity: O(1)
 */
public class Main {
    public static int countSpecial(String str){
        int count=0;
        for (int i=0;i< str.length();i++){
            char ch=str.charAt(i);
            if (!((ch>='A' && ch<='Z') || (ch>='a' && ch<='z') || (ch>='0' && ch<='9')))
                count++;
        }
        return count;
    }
    public static void main(String[] args){
        String s="!@#hello()&";
        System.out.println(countSpecial(s));
    }
}