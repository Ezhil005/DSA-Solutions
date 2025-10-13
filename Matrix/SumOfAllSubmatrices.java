/**
 * Problem: Sum of All Submatrices in a 2D Matrix
 *
 * Description:
 * Given a 2D matrix, compute the sum of all possible submatrices.
 * Each cell contributes to multiple submatrices, and its total contribution is:
 *     (i + 1) * (j + 1) * (n - i) * (m - j) * mat[i][j]
 *
 * Time Complexity: O(n * m)
 * Space Complexity: O(1)
 *
 * Example:
 * Input:
 *   mat = {
 *     {3, 1},
 *     {-1, -2},
 *     {2, 4}
 *   }
 * Output: 36
 */
public class Main {
    public static void main(String[] args) {
        int[][] mat={{3,1},{-1,-2},{2,4}};
        int n=mat.length; int m=mat[0].length;
        int ans=0;
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                int contri=(i+1)*(j+1)*(n-i)*(m-j);
                ans+=contri*mat[i][j];
            }
        }
        System.out.println(ans);
    }
}