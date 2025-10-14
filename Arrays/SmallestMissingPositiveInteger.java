/**
 * Problem: Find the Smallest Missing Positive Integer
 *
 * Description:
 * Given an unsorted array, find the smallest missing positive integer.
 * This solution uses cyclic sort to place each number at its correct index (i.e., value = index + 1).
 *
 * Approach:
 * - While traversing, swap arr[i] to its correct position if it's in range [1, n] and not already placed.
 * - After sorting, scan the array to find the first index where arr[i] != i + 1.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Example:
 * Input: [3, -1, 1, 2, 7, 0]
 * Output: 4
 */
public class Main {
    public static int missinEle(int[] arr){
        int n=arr.length;
        int i=0;
        while (i<n){
            int index=arr[i]-1;
            if (arr[i]>0 && arr[i]<n){
                if (arr[i]!=arr[index]){
                    int temp=arr[i];
                    arr[i]=arr[index];
                    arr[index]=temp;
                }
                else
                    i++;
            }
            else
                i++;
        }
        for (int k=0;k<n;k++){
            if (arr[k]==k+1)
                continue;
            else
                return k+1;
        }
        return n+1;
    }
    public static void main(String[] args){
        int[] arr={3,-1,1,2,7,0};
        int n=arr.length;
        System.out.println(missinEle(arr));
    }
}