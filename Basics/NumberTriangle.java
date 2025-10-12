/**
 * Problem: Print Incremental Number Triangle
 *
 * Description:
 * Given an integer n, print a right-angled triangle pattern of numbers.
 * Numbers start from 1 and increment row by row.
 *
 * Example:
 * Input: n = 5
 * Output:
 * 1
 * 23
 * 456
 * 78910
 * 1112131415
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(1)
 */
public class Main {
    public static void main(String[] args){
        int n=5;int x=1;
        for (int i=1;i<=n;i++){
           for (int j=1;j<=i;j++){
               System.out.print(x);
               x++;
           }
            System.out.println();
        }
    }
}