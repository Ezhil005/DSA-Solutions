/**
 * Problem: Print Square Pattern
 *
 * Description:
 * Given an integer n, print a square pattern of asterisks with n rows and n columns.
 *
 * Example:
 * Input: n = 4
 * Output:
 * ****
 * ****
 * ****
 * ****
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(1)
 */

public class Main {
    public static void main(String[] args){
        int n=4;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}