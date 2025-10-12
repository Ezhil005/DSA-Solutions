/**
 * Problem: Print 2D Matrix in Row-Wise Wave Form
 *
 * Description:
 * Given a 2D matrix, print its elements in a wave pattern row-wise:
 * - Even-indexed rows: left to right
 * - Odd-indexed rows: right to left
 *
 * Example:
 * Input:
 * {
 *   {4, 3, 1, 7},
 *   {6, 2, 3, 4},
 *   {5, 3, 2, 7}
 * }
 * Output:
 * 4 3 1 7
 * 4 3 2 6
 * 5 3 2 7
 *
 * Time Complexity: O(n * m)
 * Space Complexity: O(1)
 */
public class Main {
    public static void main(String[] args){
        int[][] mat = {
            {4, 3, 1, 7},
            {6, 2, 3, 4},
            {5, 3, 2, 7}
        };
        int n = mat.length;
        int m = mat[0].length;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < m; j++)
                    System.out.print(mat[i][j] + " ");
            } else {
                for (int j = m - 1; j >= 0; j--)
                    System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
