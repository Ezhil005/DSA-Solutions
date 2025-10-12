/**
 * Problem: Range Sum Queries Using Prefix Sum
 *
 * Description:
 * Given an array and a list of queries (each with a start and end index),
 * compute the sum of elements in each range efficiently using prefix sums.
 *
 * Example:
 * Input: arr = {-3,6,2,4,5,2,8,-9,3,1}
 *        Q = {{4,3,1,0,7},{8,7,3,4,7}}
 * Output: 9, 10, 12, 12, -1
 *
 * Time Complexity: O(n + q)  
 * Space Complexity: O(n)
 */
import java.util.Arrays;

public class Main {
  public static void main(String[] args){
      int[] arr={-3,6,2,4,5,2,8,-9,3,1};
      int[][] Q={{4,3,1,0,7},{8,7,3,4,7}};
      int n= arr.length;
      int[] pf=new int[n];
      pf[0]=arr[0];
      for (int i=1;i<n;i++)
          pf[i]=pf[i-1]+arr[i];
      for (int q=0;q<Q[0].length;q++){
          int l=Q[0][q];
          int r=Q[1][q];
          int sum=0;
          if (l>0)
              sum+=pf[r]-pf[l-1];
          else
              sum+=pf[r];
          System.out.println(sum);
      }

  }
}