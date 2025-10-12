/**
 * Problem: Filter Multiples of 5 or 7 from Input List
 *
 * Description:
 * Read integers from user input until -1 is entered.
 * Return a list containing only the numbers that are divisible by 5 or 7.
 *
 * Example:
 * Input: 10 14 3 21 8 -1
 * Output: [10, 14, 21]
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Integer> multiples(ArrayList<Integer> al){
        ArrayList<Integer> ans=new ArrayList<>();
        for (int i=0;i<al.size();i++){
            int x=al.get(i);
            if (x%5==0 || x%7==0)
                ans.add(x);
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        ArrayList<Integer> al=new ArrayList<>();
        while (true){
            int x=s.nextInt();
            if (x==-1)
                break;
            else
                al.add(x);
        }
        System.out.println(multiples(al));
    }
}