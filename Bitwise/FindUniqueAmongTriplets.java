/**
 * Problem: Find Unique Element Among Triplets
 *
 * Description:
 * Given an array where every element appears exactly three times except one,
 * find the element that appears only once.
 *
 * Approach:
 * - For each bit position (0 to 31), count how many numbers have that bit set.
 * - If the count % 3 != 0, it means the unique number has that bit set.
 * - Reconstruct the unique number from these bits.
 *
 * Time Complexity: O(32 * n) = O(n)
 * Space Complexity: O(1)
 *
 * Example:
 * Input: [5, 7, 5, 4, 7, 11, 11, 9, 11, 7, 5, 4, 4]
 * Output: 9
 */
public class Main {
    public static int uniq(int[] arr) {
        int n = arr.length;
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if ((arr[j] & (1 << i)) != 0)
                    count++;
            }
            if (count % 3 > 0)
                ans = ans | (1 << i);
        }
        return ans;
    }
    public static void main(String[] args){
        int[] arr={5,7,5,4,7,11,11,9,11,7,5,4,4};
        System.out.println(uniq(arr));
    }
}