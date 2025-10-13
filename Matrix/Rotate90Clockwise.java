/**
 * Problem: Rotate a Square Matrix 90 Degrees Clockwise (In-Place)
 *
 * Description:
 * Given a square matrix, rotate it 90 degrees clockwise in-place.
 *
 * Approach:
 * 1. Transpose the matrix (convert rows to columns).
 * 2. Reverse each row.
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(1)
 *
 * Example:
 * Input:
 * {
 *   {1, 2, 3},
 *   {4, 5, 6},
 *   {7, 8, 9}
 * }
 * Output:
 * {
 *   {7, 4, 1},
 *   {8, 5, 2},
 *   {9, 6, 3}
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
        for (int r=0;r<n;r++){
            int i=0; int j=n-1;
            while (i<j){
                int temp=mat[r][i];
                mat[r][i]=mat[r][j];
                mat[r][j]=temp;
                i++;j--;
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