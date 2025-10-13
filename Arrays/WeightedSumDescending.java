/**
 * Problem: Weighted Sum of Descending Array
 *
 * Description:
 * Given an array of integers, sort it in descending order and compute the weighted sum
 * where each element is multiplied by its 1-based index.
 *
 * Example:
 * Input: {4, 6, 1}
 * Sorted Descending: {6, 4, 1}
 * Weighted Sum: 1×6 + 2×4 + 3×1 = 17
 *
 * Time Complexity: O(n log n) for sorting
 * Space Complexity: O(1)
 */
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int[] ar={4,6,1}; int ans=0;
        int n=ar.length;
        Arrays.sort(ar);
        int i=0; int j=n-1;
        while (i<j){
            int temp=ar[i];
            ar[i]=ar[j];
            ar[j]=temp;
            i++;j--;
        }
        int[] ar1=ar;
        for (int k=0;k<ar1.length;k++){
            ans+=(k+1)*ar1[k];
        }
        System.out.println(ans);
    }
}