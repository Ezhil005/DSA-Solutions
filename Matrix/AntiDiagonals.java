/**
 * Problem: Generate Anti-Diagonals of a Square Matrix
 *
 * Description:
 * Given a N x N matrix, return a 2D array containing all its anti-diagonals.
 * Each anti-diagonal is padded with zeros to maintain a consistent row size of N.
 *
 * Constraints:
 * - 1 <= N <= 1000
 * - 1 <= A[i][j] <= 10^9
 *
 * Approach:
 * - Start from each column of the top row and each row of the last column.
 * - Traverse diagonally down-left and collect elements.
 * - Pad remaining positions with 0.
 *
 * Time Complexity: O(N^2)
 * Space Complexity: O(N^2)
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
 *   {1, 0, 0},
 *   {2, 4, 0},
 *   {3, 5, 7},
 *   {6, 8, 0},
 *   {9, 0, 0}
 * }
 */
public class Solution {
    public int[][] diagonal(int[][] A) {
        int[][] ans=new int[2*A.length-1][A.length];
        int row=0;
        for (int i=0;i<A.length;i++){
            int[] temp=AntiDiagonal(A,0,i);
            for(int j=0;j<temp.length;j++){
                ans[row][j]=temp[j];
            }
            row++;
        }
        for(int i=1;i<A.length;i++){
            int[] temp=AntiDiagonal(A,i,A.length-1);
            for(int j=0;j<temp.length;j++){
                ans[row][j]=temp[j];
            }
            row++;
        }
        return ans;
    }
    public int[] AntiDiagonal(int[][] A,int r,int c){
        int[] temp=new int[A.length];
        int index=0;
        while(r<A.length && c>=0){
            temp[index++]=A[r][c];
            r++;c--;
        }
        return temp;
    }
}
