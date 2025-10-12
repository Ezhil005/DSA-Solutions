/**
 * Problem: Print Perfect Squares up to N
 *
 * Description:
 * Given an integer n, print all perfect squares less than or equal to n.
 * A perfect square is a number that can be expressed as i*i for some integer i.
 *
 * Example:
 * Input: n = 30
 * Output: 1 4 9 16 25
 *
 * Time Complexity: O(√n)
 * Space Complexity: O(1)
 */

public class Main {
    public static void main(String[] args){
        int n=30;
        int i=1;
        while (i*i<=n){
            System.out.print(i*i+" ");
            i++;
        }
    }
}