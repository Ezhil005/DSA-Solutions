/**
 * Problem: Print All Diagonals from Top-Right to Bottom-Left
 *
 * Description:
 * Given a 2D matrix, print all diagonals that start from the top row and the rightmost column,
 * moving diagonally down-left.
 *
 * Example:
 * Input:
 * mat = {
 *   {1, 2, 3, 4},
 *   {5, 6, 7, 8},
 *   {9,10,11,12}
 * }
 * Output:
 * 1  
 * 2 5  
 * 3 6 9  
 * 4 7 10  
 * 8 11  
 * 12
 *
 * Time Complexity: O(n × m)
 * Space Complexity: O(1)
 */
public class Main {
    public static void main(String[] args){
        int[][] mat={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int n=mat.length; int m= mat[0].length;
        for (int i=0;i<m;i++){
            int r=0; int c=i;
            while (r<n && c>=0){
                System.out.print(mat[r][c]+" ");
                r++;
                c--;
            }
            System.out.println();
        }
        for (int i=1;i<n;i++){
            int r=i; int c=m-1;
            while (r<n && c>=0){
                System.out.print(mat[r][c]+" ");
                r++;c--;
            }
            System.out.println();
        }
    }
}