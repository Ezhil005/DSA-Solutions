/**
 * Problem: Print Each Character of a String on a New Line
 *
 * Description:
 * Read a string from user input and print each character on a separate line.
 *
 * Example:
 * Input: hello
 * Output:
 * h
 * e
 * l
 * l
 * o
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
            System.out.println(str.charAt(i));
        }
    }
}