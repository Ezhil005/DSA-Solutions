/**
 * Problem: Print Rectangle Pattern
 *
 * Description:
 * Given two integers n and m, print a rectangle pattern of asterisks with n rows and m columns.
 *
 * Example:
 * Input: n = 3, m = 4
 * Output:
 * ****
 * ****
 * ****
 *
 * Time Complexity: O(n × m)
 * Space Complexity: O(1)
 */

public class Main {
    public static void main(String[] args){
        int n=3; int m=4;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=m;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}