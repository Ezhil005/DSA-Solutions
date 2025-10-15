/**
 * Problem: Sort Array with Negative and Positive Integers Using Counting Sort
 *
 * Description:
 * Sorts an array of integers (including negatives) using frequency counting.
 * Adapts classic Counting Sort by shifting indices to handle negative values.
 *
 * Approach:
 * - Find min and max values to determine range
 * - Use a frequency array of size (max - min + 1)
 * - Map each element to its shifted index: arr[i] - min
 * - Reconstruct sorted array using frequency counts
 *
 * Time Complexity: O(n + range)
 * Space Complexity: O(range)
 *
 * Example:
 * Input: [-8, 12, 2, 6, 78, -9, 45, 789]
 * Output: [-9 -8 2 6 12 45 78 789]
 */
public class Main {
    public static void main(String[] args){
        int[] arr={-8,12,2,6,78,-9,45,789};
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for (int i=0;i<n;i++){
            max=Math.max(max,arr[i]);
            min=Math.min(min,arr[i]);
        }
        int[] freq=new int[max-min+1];
        for (int i=0;i<n;i++){
            int index=arr[i]-min;
            freq[index]++;
        }
        for (int i=0;i<freq.length;i++){
            for (int j=0;j<freq[i];j++){
                System.out.print(i+min+" ");
            }
        }
    }
}