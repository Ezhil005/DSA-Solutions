/**
 * Problem: Print Right-Angled Triangle Pattern
 *
 * Description:
 * Given an integer n, print a right-angled triangle pattern of asterisks with n rows.
 * Each row i contains i asterisks.
 *
 * Example:
 * Input: n = 5
 * Output:
 * *
 * **
 * ***
 * ****
 * *****
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(1)
 */

public class Main {
    public static void main(String[] args){
        int n=5;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}