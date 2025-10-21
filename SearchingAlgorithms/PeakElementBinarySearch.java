// 🔼 Peak Element Binary Search | Time Complexity: O(log n)
// Finds a peak element in the array such that A[i] > A[i-1] and A[i] > A[i+1].
// Handles edge peaks and uses binary search to efficiently locate a peak.
// Returns the peak value directly.
public class Solution {
    public int solve(int[] A) {
        int n=A.length;
        if(n==1)
          return A[0];
        if(A[0]>A[1])
           return A[0];
        if(A[n-1]>A[n-2])
           return A[n-1];
        int s=1; int e=n-2;
        while(s<=e){
            int m=(s+e)/2;
            if(A[m]>A[m-1]&&A[m]>A[m+1])
               return A[m];
            if(A[m]>A[m-1]&&A[m]<A[m+1])
               s=m+1;
            else
              e=m-1;
        }
        return Math.max(A[0],A[n-1]);
    }
}
