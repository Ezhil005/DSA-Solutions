/**
 * Problem: Transpose a Square Matrix In-Place
 *
 * Description:
 * Given a square matrix, transpose it in-place.
 * Transposing means converting rows to columns and vice versa.
 *
 * Approach:
 * - Swap mat[r][c] with mat[c][r] for all r > c.
 * - This avoids double-swapping and keeps the operation in-place.
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(1)
 *
 * Example:
 * Input:
 * mat = {
 *   {1, 2, 3},
 *   {4, 5, 6},
 *   {7, 8, 9}
 * }
 * Output:
 * {
 *   {1, 4, 7},
 *   {2, 5, 8},
 *   {3, 6, 9}
 * }
 */
public class Main {
    public static void main(String[] args){
        int[][] mat={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        int n=mat.length; int m= mat[0].length;
        for (int r=0;r<n;r++){
            for (int c=0;c<r;c++){
                int temp=mat[r][c];
                mat[r][c]=mat[c][r];
                mat[c][r]=temp;
            }
        }
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}