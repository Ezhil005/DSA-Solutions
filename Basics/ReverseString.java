/**
 * Problem: Reverse a String Using Character Array
 *
 * Description:
 * Convert the input string to a character array and reverse it using two-pointer technique.
 * Print the reversed string.
 *
 * Example:
 * Input: "hello"
 * Output: "olleh"
 *
 * Time Complexity: O(n)  
 * Space Complexity: O(n) (due to character array)
 */
public class Main {
    public static void main(String[] args){
        String s="hello";
        char[] ch=s.toCharArray();
        int i=0;int j=ch.length-1;
        while (i<j){
            char temp=ch[i];
            ch[i]=ch[j];
            ch[j]=temp;
            i++;j--;
        }
        System.out.println(ch);
    }
}