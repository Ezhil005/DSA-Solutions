/**
 * Problem: Search for an Element in an Array
 *
 * Description:
 * Given an integer array and a target value `k`, determine whether `k` exists in the array.
 * This implementation uses a simple linear search.
 *
 * Example:
 * Input: arr = {2, 3, 4, 5, 1, 2}, k = 3
 * Output: true
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class Main {
    public static boolean findK(int[] arr, int k){
        for (int i=0;i<arr.length;i++) {
            if (arr[i] == k)
                return true;
        }
        return false;
    }
    public static void main(String[] args){
       int[] arr={2,3,4,5,1,2};
       int k=3;
        System.out.println(findK(arr,k));
    }
}