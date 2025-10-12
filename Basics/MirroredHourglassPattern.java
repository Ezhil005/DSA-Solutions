/**
 * Problem: Print Mirrored Hourglass Pattern
 *
 * Description:
 * Given an integer n, print a symmetric hourglass-like pattern using asterisks.
 * Each row contains:
 * - (n + 1 - i) asterisks on the left
 * - (i - 1) × 2 spaces in the middle
 * - (n + 1 - i) asterisks on the right
 *
 * Example:
 * Input: n = 5
 * Output:
 * *****  *****
 * ****    ****
 * ***      ***
 * **        **
 * *          *
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
    }
}