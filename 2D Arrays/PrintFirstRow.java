/**
 * Problem: Print First Row of a 2D Matrix
 *
 * Description:
 * Given a 2D matrix of integers, print all elements of the first row.
 *
 * Example:
 * Input:
 * mat = {
 *   {1, 2, 3, 4},
 *   {5, 6, 7, 8},
 *   {9, 10, 11, 12}
 * }
 * Output:
 * 1 2 3 4
 *
 * Time Complexity: O(m) where m = number of columns
 * Space Complexity: O(1)
 */
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
       int[][] mat={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
       int n=mat.length; int m= mat[0].length;
       for (int j=0;j<m;j++){
           System.out.print(mat[0][j]+" ");
       }
    }
}