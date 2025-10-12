/**
 * Problem: Range Sum Queries for Even Indices Using Prefix Sum
 *
 * Description:
 * Given an array and a list of queries (each with a start and end index),
 * compute the sum of elements at even indices in each range efficiently using prefix sums.
 *
 * Example:
 * Input: arr = {2,4,3,7,9,8,6,3,4,9}
 *        Q = {{4,3,1,0},{8,7,3,4}}
 * Output: 19, 17, 5, 14
 *
 * Time Complexity: O(n + q)  
 * Space Complexity: O(n)
 */
import java.util.Arrays;

public class Main {
  public static void main(String[] args){
      int[] arr={2,4,3,7,9,8,6,3,4,9};
      int[][] Q={{4,3,1,0},{8,7,3,4}};
      int n= arr.length;
      int[] pf=new int[n];
      pf[0]=arr[0];
      for (int i=1;i<n;i++) {
          if (i % 2 == 0)
              pf[i] = pf[i - 1] + arr[i];
          else
              pf[i] =pf[i-1]+ 0;
      }
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