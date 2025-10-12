/**
 * Problem: Print Centered Pyramid Pattern
 *
 * Description:
 * Given an integer n, print a centered pyramid pattern using asterisks.
 * Each row i contains:
 * - (n - i) leading spaces
 * - (2 × i - 1) asterisks
 * - (n - i) trailing spaces (optional for symmetry)
 *
 * Example:
 * Input: n = 5
 * Output:
 *     *    
 *    ***   
 *   *****  
 *  ******* 
 * *********
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
            for (int j=1;j<=(i*2)-1;j++)
                System.out.print("*");
            for (int j=1;j<=(n-i);j++)
                System.out.print(" ");
            System.out.println();
        }
    }
}