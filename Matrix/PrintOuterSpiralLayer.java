/**
 * Problem: Print Outer Layer of Matrix in Spiral Order
 *
 * Description:
 * Given a square or rectangular matrix, print the outermost boundary elements
 * in spiral order: top row → right column → bottom row (reversed) → left column (reversed).
 *
 * Approach:
 * - Start from the top-left corner (i=0, j=0)
 * - Traverse:
 *     1. Top row: left to right (excluding last column)
 *     2. Right column: top to bottom (excluding last row)
 *     3. Bottom row: right to left (excluding first column)
 *     4. Left column: bottom to top (excluding first row)
 *
 * Time Complexity: O(n + m), where n = rows, m = columns
 * Space Complexity: O(1)
 *
 * Example:
 * Input:
 *   1  2  3  4  5
 *  16 17 18 19  6
 *  15 24 25 20  7
 *  14 23 22 21  8
 *  13 12 11 10  9
 * Output: 1234567891011121314151617
 */
public class Main {
    public static void main(String[] args){
        int[][] mat={{1,2,3,4,5},{16,17,18,19,6},{15,24,25,20,7},{14,23,22,21,8},{13,12,11,10,9}};
        int n=mat.length; int m=mat[0].length;
        int i=0; int j=0;
        for (int k=0;k<m-1;k++){
            System.out.print(mat[i][j]);
            j++;
        }
        for (int k=0;k<n-1;k++){
            System.out.print(mat[i][j]);
            i++;
        }
        for (int k=0;k<m-1;k++){
            System.out.print(mat[i][j]);
            j--;
        }
        for (int k=0;k<n-1;k++){
            System.out.print(mat[i][j]);
            i--;
        }
    }
}