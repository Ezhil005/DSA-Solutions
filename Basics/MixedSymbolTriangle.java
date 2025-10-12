/**
 * Problem: Print Mixed Symbol Triangle Pattern
 *
 * Description:
 * Given an integer n, print a right-angled triangle pattern with n rows.
 * For each row i, print i characters:
 * - Print '*' at odd positions
 * - Print the number j at even positions
 *
 * Example:
 * Input: n = 5
 * Output:
 * *
 * *2
 * *2*
 * *2*4
 * *2*4*
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(1)
 */

public class Main {
    public static void main(String[] args){
        int n=5;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                if (j%2==0)
                    System.out.print(j);
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}