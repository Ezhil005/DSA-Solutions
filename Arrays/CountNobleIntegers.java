/**
 * Problem: Count Noble Integers (Including Duplicates)
 *
 * Description:
 * A noble integer is an integer x such that exactly x elements in the array are greater than x.
 * This version counts all occurrences of noble integers, including duplicates.
 *
 * Approach:
 * - Sort the array.
 * - Track the index of each new unique value.
 * - If the index equals the value, it's a noble integer.
 * - Count all such occurrences.
 *
 * Time Complexity: O(n log n)
 * Space Complexity: O(1)
 *
 * Example:
 * Input: {-3, 0, 2, 2, 5, 5, 5, 5, 8, 8, 10, 10, 10, 14}
 * Output: 7
 */
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int[] ar={-3,0,2,2,5,5,5,5,8,8,10,10,10,14}; int ans=0;
        int n=ar.length; int count=0;
        Arrays.sort(ar);
        if (ar[0]==0)
            count++;
        for (int i=1;i<n;i++){
            if (ar[i-1]!=ar[i])
                count=i;
            if (count==ar[i])
                ans++;
        }
        System.out.println(ans);
    }
}