/**
 * Problem: Check if a Number is COLORFUL
 *
 * Description:
 * A number is COLORFUL if the product of digits of every possible consecutive subsequence is unique.
 * This solution extracts digits, generates all consecutive subsequences, and checks for duplicate products.
 *
 * Time Complexity: O(n²), where n = number of digits
 * Space Complexity: O(n²) for storing products
 *
 * Example:
 * Input: 23 → Products: [2, 3, 6] → All unique → Output: 1
 * Input: 236 → Products: [2, 3, 6, 6, 18, 36] → Duplicate 6 → Output: 0
 */
public class Solution {
    public int colorful(int A) {
        ArrayList<Integer> ar=new ArrayList<Integer>();
        while(A!=0){
            ar.add(A%10);
            A/=10;
        }
        int n=ar.size();
        HashSet<Integer> hs=new HashSet<>();
        for (int i=0;i<n;i++){
            int prod=1;
            for (int j=i;j<n;j++){
                prod*=ar.get(j);
                if (hs.contains(prod)){
                    return 0;
                }else {
                    hs.add(prod);
                }
            }
        }
        return 1;
    }
}
