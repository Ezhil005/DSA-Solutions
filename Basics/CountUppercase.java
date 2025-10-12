/**
 * Problem: Count Uppercase Letters in a String
 *
 * Description:
 * Given a string, count and return the number of uppercase alphabetic characters.
 *
 * Example:
 * Input: "HELLo woRlD"
 * Output: 6
 *
 * Time Complexity: O(n) where n = length of the string  
 * Space Complexity: O(1)
 */
public class Main {
    public static int countUpper(String str){
        int count=0;
        for (int i=0;i< str.length();i++){
            if (Character.isUpperCase(str.charAt(i)))
                count++;
        }
        return count;
    }
    public static void main(String[] args){
        String s="HELLo woRlD";
        System.out.println(countUpper(s));
    }
}