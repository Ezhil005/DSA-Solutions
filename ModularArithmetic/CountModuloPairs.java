/**
 * Problem: Count Pairs with Sum Divisible by m
 *
 * Description:
 * Given an array and an integer m, count the number of pairs (i, j) such that:
 *   (arr[i] + arr[j]) % m == 0
 *
 * Approach:
 * - For each element, compute modv = arr[i] % m
 * - The complement needed to form a divisible pair is (m - modv) % m
 * - Use a frequency array to track how many times each modulo value has occurred
 * - For each element, add freq[complement] to the answer
 *
 * Time Complexity: O(n)
 * Space Complexity: O(m)
 *
 * Example:
 * Input: arr = {2,3,4,8,6,15,5,12,17,7,18,10,9,16,21}, m = 6
 * Output: 17
 */
public class Main {
    public static int pairs(int[] arr,int m){
        int ans=0;
        int[] freq=new int[m];
        int pairs=0;
        for (int i=0;i<arr.length;i++) {
            int modv = arr[i] % m;
            if (modv == 0)
                pairs = 0;
            else
                pairs = m - modv;
            ans+=freq[pairs];
            freq[modv]++;
        }
        return ans;
    }
    public static void main(String[] args){
        int[] arr={2,3,4,8,6,15,5,12,17,7,18,10,9,16,21}; int m=6;
        System.out.println(pairs(arr,m));
    }
}