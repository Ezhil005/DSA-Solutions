/**
 * Problem: Print Full Hourglass Star Pattern
 *
 * Description:
 * Given an integer n, print a symmetric hourglass pattern using asterisks.
 * The pattern has 2n - 1 rows:
 * - Top half: decreasing stars on both sides with increasing middle spaces
 * - Bottom half: mirror of the top half
 *
 * Example:
 * Input: n = 5
 * Output:
 * *****  *****
 * ****    ****
 * ***      ***
 * **        **
 * *          *
 * **        **
 * ***      ***
 * ****    ****
 * *****  *****
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(1)
 */
public class Main {
    public static void main(String[] args){
        int n=5;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=(n+1-i);j++){
                System.out.print("*");
            }
            for (int j=1;j<=(i-1)*2;j++)
                System.out.print(" ");
            for (int j=1;j<=(n+1-i);j++)
                System.out.print("*");
            System.out.println();
        }
        for (int i=n-1;i>=1;i--){
            for (int j=1;j<=(n+1-i);j++){
                System.out.print("*");
            }
            for (int j=1;j<=(i-1)*2;j++)
                System.out.print(" ");
            for (int j=1;j<=(n+1-i);j++)
                System.out.print("*");
            System.out.println();
        }
    }
}