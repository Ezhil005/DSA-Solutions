/**
 * Problem: Compute GCD of an Array
 *
 * Description:
 * Given an array of integers, compute the greatest common divisor (GCD) of all elements.
 * This uses the Euclidean algorithm iteratively across the array.
 *
 * Approach:
 * - Initialize ans = 0
 * - For each element arr[i], update ans = gcd(ans, arr[i])
 * - Uses gcd(a, b) = gcd(b, a % b)
 *
 * Time Complexity: O(n * log(max(arr[i])))
 * Space Complexity: O(log(max(arr[i]))), due to recursion stack
 *
 * Example:
 * Input: arr = {21, 35, 56}
 * Output: 7
 */
public class Main {
    public static int gcd(int a, int b){
        if (b==0)
            return a;
        return gcd(b,a%b);
    }
    public static int arrgcd(int[] arr){
        int ans=0;
        for (int i=0;i<arr.length;i++){
            ans=gcd(ans,arr[i]);
        }
        return ans;
    }
    public static void main(String[] args){
        int[] arr={21,35,56};
        System.out.println(arrgcd(arr));
    }
}