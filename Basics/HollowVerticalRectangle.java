/**
 * Problem: Print Hollow Rectangle (Vertical Borders Only)
 *
 * Description:
 * Given an integer n, print a hollow rectangle pattern with n rows and n columns.
 * Only the first and last columns of each row contain asterisks; the rest are spaces.
 *
 * Example:
 * Input: n = 5
 * Output:
 * *   *
 * *   *
 * *   *
 * *   *
 * *   *
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(1)
 */

public class Main {
    public static void main(String[] args){
        int n=5;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                if (j==1 || j==n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}