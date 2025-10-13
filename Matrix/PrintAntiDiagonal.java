/**
 * Problem: Print Anti-Diagonal of a Matrix
 *
 * Description:
 * Given a 2D matrix, print all elements on its anti-diagonal.
 * The anti-diagonal consists of elements where row + column = n - 1.
 *
 * Example:
 * Input:
 * mat = {
 *   {1, 2, 3, 4, 5},
 *   {6, 7, 8, 9, 10},
 *   {11,12,13,14,15},
 *   {16,17,18,19,20},
 *   {21,22,23,24,25}
 * }
 * Output: 5 9 13 17 21
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class Main {
    public static void main(String[] args){
        int[][] mat={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        int n=mat.length; int m= mat[0].length;
        int r=0; int c=m-1;
        while (r<n && c>=0){
            System.out.print(mat[r][c]+" ");
            r++;c--;
        }
    }
}