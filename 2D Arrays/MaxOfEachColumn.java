/**
 * Problem: Maximum of Each Column in a 2D Matrix
 *
 * Description:
 * Given a 2D matrix of integers, find and print the maximum value in each column.
 *
 * Example:
 * Input:
 * mat = {
 *   {4, 3, 1, 7},
 *   {6, 2, 3, 4},
 *   {5, 3, 2, 7}
 * }
 * Output:
 * 6
 * 3
 * 3
 * 7
 *
 * Time Complexity: O(n * m) where n = number of rows, m = number of columns  
 * Space Complexity: O(1)
 */
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
       int[][] mat={{4,3,1,7},{6,2,3,4},{5,3,2,7}};
       int n=mat.length; int m= mat[0].length;
       for (int j=0;j<m;j++){
           int colmax=0;
           for (int i=0;i<n;i++){
               if (mat[i][j]>colmax)
                   colmax=mat[i][j];
           }
           System.out.println(colmax);
       }
    }
}