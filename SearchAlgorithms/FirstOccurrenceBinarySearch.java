// ✅ First Occurrence Binary Search | O(log n) | Handles Duplicates
public class Main {
    public static int firstoccur(int[] arr,int k){
        int s=0; int e= arr.length-1;
        int ans=-1;
        while (s<=e){
            int m=(s+e)/2;
            if (arr[m]==k) {
                ans = m;
                e = m - 1;
            }
            else if (arr[m]<k) {
                s=m+1;
            }
            else
                e=m-1;
        }
        return ans;
    }
}