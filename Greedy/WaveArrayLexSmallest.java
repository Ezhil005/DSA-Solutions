// ✅ Wave Array | Lexicographically Smallest | Greedy | O(n log n)
public class Solution {
    public int[] wave(int[] A) {
        Arrays.sort(A);
        int n=A.length;
        for(int i=0;i<n-1;i+=2){
            int temp=A[i];
            A[i]=A[i+1];
            A[i+1]=temp;
        }
        return A;
    }
}
