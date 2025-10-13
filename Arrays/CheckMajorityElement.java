/**
 * Problem: Check for Majority Element in Array
 *
 * Description:
 * Given an array of integers, determine if there exists a majority element —
 * an element that appears more than n/2 times.
 * Uses Boyer-Moore Majority Vote Algorithm for efficient candidate selection.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Example:
 * Input: {1, 2, 1, 6, 1, 1}
 * Output: true (1 appears 4 times out of 6)
 */
public class Main {
    public static boolean majEle(int[] arr){
        int temp_ans=0;
        int count=0;
        int n=arr.length;
        for (int i=0;i<n;i++){
            if (count==0){
                temp_ans=arr[i];
                count=1;
            }
            if (temp_ans==arr[i])
                count++;
            else
                count--;
        }
        int freq=0;
        for (int i=0;i<n;i++){
            if (arr[i]==temp_ans)
                freq++;
        }
        return (freq>n/2);
    }
    public static void main(String[] args){
        int[] arr={1,2,1,6,1,1};
        int n= arr.length;
        System.out.println(majEle(arr));
    }
}