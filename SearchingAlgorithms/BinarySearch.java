// ✅ Binary Search | O(log n) | Sorted Array Required
public class Main {
    public static boolean binary(int[] arr,int k){
        int s=0; int e= arr.length-1;
        while (s<=e){
            int m=(s+e)/2;
            if (arr[m]==k)
                return true;
            else if (arr[m]<k) {
                s=m+1;
            }
            else
                e=m-1;
        }
        return false;
    }