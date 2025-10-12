/**
 * Problem: Find LCM of Two Numbers (Brute Force)
 *
 * Description:
 * Given two integers `a` and `b`, find and print their Least Common Multiple (LCM).
 * This approach starts from the maximum of `a` and `b` and increments until a common multiple is found.
 *
 * Example:
 * Input: a = 3, b = 4
 * Output: 12
 *
 * Time Complexity: O(lcm) in worst case
 * Space Complexity: O(1)
 */
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
      int a=3;
      int b=4;
      int lcm;
      if (a>b)
          lcm=a;
      else
          lcm=b;
      while (true){
          if (lcm%a==0 && lcm%b==0){
              System.out.println(lcm);
              break;
          }
          lcm++;
      }
    }
}