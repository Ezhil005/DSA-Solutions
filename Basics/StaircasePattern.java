/**
 * Problem: Generate Staircase Pattern Using Nested ArrayLists
 *
 * Description:
 * Given an integer `n`, generate a staircase pattern where each row contains
 * increasing numbers from 1 up to the row index. The result is stored as a
 * list of lists.
 *
 * Example:
 * Input: n = 3
 * Output: [[1], [1, 2], [1, 2, 3]]
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(n²)
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<ArrayList<Integer>> staircase(int n){
        ArrayList<ArrayList<Integer>> al=new ArrayList<>();
        for (int i=1;i<=n;i++){
            ArrayList<Integer> row=new ArrayList<>();
            for (int j=1;j<=i;j++){
                row.add(j);
            }
            al.add(row);
        }
        return al;
    }
    public static void main(String[] args){
        int n=3;
        System.out.println(staircase(n));
    }
}