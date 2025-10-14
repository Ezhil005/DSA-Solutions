/**
 * Problem: Find Two Unique Elements Among Duplicates
 *
 * Description:
 * Given an array where all elements appear exactly twice except two unique elements,
 * find and return those two unique numbers.
 *
 * Approach:
 * - XOR all elements to get val = a ^ b (where a and b are the unique numbers)
 * - Find the rightmost set bit in val to partition the array
 * - XOR elements in each partition to isolate a and b
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Example:
 * Input: [4, 5, 5, 4, 1, 2]
 * Output: [1, 2]
 */
import java.util.Arrays;

public class Main {
    public static int[] uniq(int[] arr){
        int n=arr.length;
        int val=0;
        for (int i=0;i<n;i++){
            val=val^arr[i];
        }
        int focusindex=0;
        for (int i=0;i<32;i++){
            if (((val&(1<<i))==1)) {
                focusindex = i;
                break;
            }
        }
        int set=0; int unset=0;
        for (int i=0;i<n;i++){
            if ((arr[i]&(1<<focusindex))>0)
                set=set^arr[i];
            else
                unset=unset^arr[i];
        }
        return new int[]{set,unset};
    }
    public static void main(String[] args){
        int[] arr={4,5,5,4,1,2};
        System.out.println(Arrays.toString(uniq(arr)));
    }
}