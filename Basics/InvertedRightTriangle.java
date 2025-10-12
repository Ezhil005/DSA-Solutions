/**
 * Problem: Print Inverted Right-Angled Triangle Pattern
 *
 * Description:
 * Given an integer n, print an inverted right-angled triangle pattern of asterisks.
 * The first row has n asterisks, and each subsequent row has one less.
 *
 * Example:
 * Input: n = 5
 * Output:
 * *****
 * ****
 * ***
 * **
 * *
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
            System.out.println();
        }
    }
}