/**
 * Problem: Print Diagonal Star Pattern with Trailing Spaces
 *
 * Description:
 * Given an integer n, print a pattern where each row starts and ends with a star '*',
 * and has (n - i) spaces between them. This creates a mirrored diagonal effect.
 *
 * Example:
 * Input: n = 5
 * Output:
 * *    *
 * *   *
 * *  *
 * * *
 * **
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(1)
 */
public class Main {
    public static void main(String[] args){
        int n=5;
        for (int i=1;i<=n;i++){
            System.out.print("*");
            for (int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            System.out.println("*");
        }
    }
}