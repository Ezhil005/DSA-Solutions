/**
 * Problem: Print ASCII Value of Each Character in a String
 *
 * Description:
 * Read a string from user input and print each character followed by its ASCII value.
 *
 * Example:
 * Input: hello
 * Output:
 * h 104
 * e 101
 * l 108
 * l 108
 * o 111
 *
 * Time Complexity: O(n) where n = length of the string  
 * Space Complexity: O(1)
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            int ascii=ch;
            System.out.println(ch+" "+ascii);
        }
    }
}