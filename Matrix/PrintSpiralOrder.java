/**
 * Problem: Print Matrix in Spiral Order
 *
 * Description:
 * Given a square matrix, print all its elements in spiral order.
 * This solution traverses the matrix layer by layer, moving right, down, left, and up,
 * and shrinks the boundary inward after each full loop.
 *
 * Approach:
 * - Start from top-left corner (i=0, j=0)
 * - While n > 1:
 *     - Traverse top row → right column → bottom row → left column
 *     - Move inward by incrementing i and j, and reducing n by 2
 * - If n == 1 (center element remains), print it
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(1)
 *
 * Example:
 * Input:
 *   1  2  3  4  5
 *  16 17 18 19  6
 *  15 24 25 20  7
 *  14 23 22 21  8
 *  13 12 11 10  9
 * Output: 12345678910111213141516171819202122232425
 */
public class Main {
    public static void main(String[] args){
        int[][] mat={{1,2,3,4,5},{16,17,18,19,6},{15,24,25,20,7},{14,23,22,21,8},{13,12,11,10,9}};
        int n=mat.length; int m=mat[0].length;
        int i=0; int j=0;
        while (n>1) {
            for (int k = 0; k < n - 1; k++) {
                System.out.print(mat[i][j]);
                j++;
            }
            for (int k = 0; k < n - 1; k++) {
                System.out.print(mat[i][j]);
                i++;
            }
            for (int k = 0; k < n - 1; k++) {
                System.out.print(mat[i][j]);
                j--;
            }
            for (int k = 0; k < n - 1; k++) {
                System.out.print(mat[i][j]);
                i--;
            }
            i++;
            j++;
            n=n-2;
        }
        if (n==1)
            System.out.print(mat[i][j]);
    }
}