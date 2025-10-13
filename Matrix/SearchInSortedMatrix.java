/**
 * Problem: Search in Row-wise and Column-wise Sorted Matrix
 *
 * Description:
 * Given a matrix where each row and each column is sorted in increasing order,
 * determine if a target value exists in the matrix.
 * This solution starts from the top-right corner and moves left or down based on comparisons.
 *
 * Approach:
 * - Start at (0, m-1) — top-right corner.
 * - If current element == target → return true
 * - If current element > target → move left
 * - If current element < target → move down
 * - Continue until out of bounds
 *
 * Time Complexity: O(n + m)
 * Space Complexity: O(1)
 *
 * Example:
 * Input:
 *   mat = {
 *     {-5, -2, 1, 13},
 *     {-4,  0, 3, 14},
 *     {-3,  2, 6, 18}
 *   }, k = 13
 * Output: true
 */
public class Main {
    public static boolean findK(int[][] mat,int k){
        int n=mat.length; int m=mat[0].length;
        int r=0; int c=m-1;
        while (r<n && c>=0){
            if (mat[r][c]==k)
                return true;
            if (mat[r][c]>k)
                c--;
            if (mat[r][c]<k)
                r++;
        }
        return false;
    }
    public static void main(String[] args){
        int[][] mat={{-5,-2,1,13}, {-4, 0, 3, 14},{-3,2,6,18}};
        int k=13;
        System.out.println(findK(mat,k));
    }
}