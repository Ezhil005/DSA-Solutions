/**
 * Problem: Sum of Each Row in a 2D Matrix
 *
 * Description:
 * Given a 2D matrix of integers, calculate and print the sum of each row individually.
 *
 * Example:
 * Input:
 * mat = {
 *   {4, 3, 1, 7},
 *   {6, 2, 3, 4},
 *   {5, 3, 2, 7}
 * }
 * Output:
 * 15
 * 15
 * 17
 *
 * Time Complexity: O(n * m) where n = number of rows, m = number of columns  
 * Space Complexity: O(1)
 */
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
       int[][] mat={{4,3,1,7},{6,2,3,4},{5,3,2,7}};
       int n=mat.length; int m= mat[0].length;
       for (int i=0;i<n;i++){
           int rowsum=0;
           for (int j=0;j<m;j++){
               rowsum+=mat[i][j];
           }
           System.out.println(rowsum);
       }
    }
}