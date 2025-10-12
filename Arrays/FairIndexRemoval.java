/**
 * Problem: Count Indices Where Removing Element Balances Even and Odd Indexed Sums
 *
 * Description:
 * Given an array, count how many indices can be removed such that the sum of elements
 * at even indices equals the sum of elements at odd indices in the resulting array.
 *
 * Approach:
 * - Use two prefix sum arrays: one for even indices, one for odd.
 * - For each index, simulate its removal and compare the adjusted even and odd sums.
 *
 * Example:
 * Input: arr = {4, 3, 2, 7, 6, -2}
 * Output: 2
 *
 * Time Complexity: O(n)  
 * Space Complexity: O(n)
 */
import java.util.Arrays;

public class Main {
  public static void main(String[] args){
      int[] arr={4,3,2,7,6,-2};
      int n=arr.length;
      int[] pf_even=new int[n];
      int[] pf_odd=new int[n];
      pf_odd[0]=0;
      pf_even[0]=arr[0];
      int ans=0;
      for (int i=1;i<n;i++){
          pf_odd[i]=pf_odd[i-1];
          pf_even[i]=pf_even[i-1];
          if (i%2==0)
              pf_even[i]+=arr[i];
          else
              pf_odd[i]+=arr[i];
      }
      for (int i=0;i<n;i++){
          int so=0; int se=0;
          if(i>0)
              so=pf_odd[i-1]+pf_even[n-1]-pf_even[i];
          else
              so=pf_even[n-1]-pf_even[i];
          if (i>0)
              se=pf_even[i-1]+pf_odd[n-1]-pf_odd[i];
          else
              se=pf_odd[n-1]-pf_odd[i];
          if (se==so)
              ans++;
      }
      System.out.println(ans);
  }
}