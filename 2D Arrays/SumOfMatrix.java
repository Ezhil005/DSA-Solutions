/**
 * Problem: Sum of All Elements in a 2D Matrix
 *
 * Description:
 * Given a 2D matrix of integers, calculate and print the sum of all its elements.
 *
 * Example:
 * Input:
 * mat = {
 *   {4, 3, 1, 7},
 *   {6, 2, 3, 4},
 *   {5, 3, 2, 7}
 * }
 * Output: 47
 *
 * Time Complexity: O(n * m) where n = number of rows, m = number of columns
 * Space Complexity: O(1)
 */
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
       int[][] mat={{4,3,1,7},{6,2,3,4},{5,3,2,7}};
       int n=mat.length; int m= mat[0].length;
       int sum=0;
       for (int i=0;i<n;i++){
           for (int j=0;j<m;j++){
               sum+=mat[i][j];
           }
       }
       System.out.println(sum);
    }
}