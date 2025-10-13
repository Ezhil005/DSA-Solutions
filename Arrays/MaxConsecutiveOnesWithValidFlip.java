/**
 * Problem: Max Consecutive 1s with One Valid Flip
 *
 * Description:
 * Given a binary array, return the maximum number of consecutive 1s possible
 * if you can flip exactly one 0 to 1 — but only if there are leftover 1s elsewhere.
 *
 * Approach:
 * - Count total 1s.
 * - For each 0, expand left and right to count adjacent 1s.
 * - Check if flipping is valid based on leftover 1s.
 * - Track the maximum stretch.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Example:
 * Input: {1, 1, 0, 1, 1, 0, 1}
 * Output: 5
 */
public class Main {
    public static int cons1(int[] arr){
        int n= arr.length;
        int total_1=0;
        for (int i=0;i<n;i++)
            total_1+=arr[i];
        if (total_1==0)
            return 1;
        if (total_1==n)
            return n;
        int ans=0;
        for (int i=0;i<n;i++){
            int countl=0;
            int countr=0;
            int l=i-1;int r=i+1;
            if (arr[i]==0){
                while (l>=0 && arr[l]==1){
                    countl++;
                    l--;
                }
                while (r<n && arr[r]==1){
                    countr++;
                    r++;
                }
            }
            int leftovers=total_1-countl-countr;
            int localmaxima=0;
            if (leftovers>=1)
                localmaxima=countl+countr+1;
            else
                localmaxima=countl+countr;
            ans=Math.max(ans,localmaxima);
        }
        return ans;
    }
    public static void main(String[] args){
        int[] arr={1,1,0,1,1,0,1};
        System.out.println(cons1(arr));
    }
}