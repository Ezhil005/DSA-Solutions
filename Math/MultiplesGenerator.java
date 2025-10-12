/**
 * Problem: Generate First b Multiples of a Number
 *
 * Description:
 * Given two integers `a` and `b`, return a list containing the first `b` multiples of `a`.
 *
 * Example:
 * Input: a = 2, b = 4
 * Output: [2, 4, 6, 8]
 *
 * Time Complexity: O(b)
 * Space Complexity: O(b)
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Integer> multiples(int a,int b){
        ArrayList<Integer> ans=new ArrayList<>();
        for (int i=1;i<=b;i++)
            ans.add(a*i);
        return ans;
    }
    public static void main(String[] args){
        int a=2; int b=4;
        System.out.println(multiples(a,b));
    }
}