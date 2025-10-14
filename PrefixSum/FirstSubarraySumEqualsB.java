/**
 * Problem: First Continuous Subarray with Sum B
 *
 * Description:
 * Given an array A of positive integers and an integer B, find the first continuous subarray that adds up to B.
 * If no such subarray exists, return [-1].
 *
 * Approach:
 * - Use prefix sum and a HashMap to store sum → index mappings
 * - For each index i:
 *     - Compute running sum
 *     - If (sum - B) exists in map, a subarray from map.get(sum - B) + 1 to i sums to B
 *     - Return immediately on first match to ensure minimal starting index
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * Example:
 * Input: A = [1, 2, 3, 4, 5], B = 5
 * Output: [2, 3]
 */
public class Solution {
    public int[] solve(int[] A, int B) {
        long sum=0;
        int n=A.length;
        HashMap<Long,Integer> map=new HashMap<>();
        map.put(0l,-1);
        int s=-1; int e=-1;
        for(int i=0;i<n;i++){
            sum+=A[i];
            if(map.containsKey(sum-B)==true){
                s=map.get(sum-B)+1;
                e=i;
                break;
            }
            map.put(sum,i);
        }
        if(s==-1){
            int[] ans={-1};
            return ans;
        }
        int k=0;
        int[] ans=new int[e-s+1];
        for(int i=s;i<=e;i++){
            ans[k]=A[i];
            k++;
        }
        return ans;
    }
}
