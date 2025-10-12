/**
 * Problem: Print Left-Aligned Pyramid Pattern
 *
 * Description:
 * Given an integer n, print a pyramid pattern of asterisks with n rows.
 * Each row is left-aligned by printing (n - i) spaces followed by i asterisks.
 *
 * Example:
 * Input: n = 5
 * Output:
 *     *
 *    **
 *   ***
 *  ****
 * *****
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(1)
 */

public class Main {
    public static void main(String[] args){
        int n=5;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=(n-i);j++)
                System.out.print(" ");
            for (int j=1;j<=(i-1)+1;j++)
                System.out.print("*");
            System.out.println();
        }
    }
}