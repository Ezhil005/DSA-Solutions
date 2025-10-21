// 🔍 Unique Element Binary Search | O(log n)
// Finds the single non-duplicate element in a sorted array where every other element appears exactly twice.
public class Main {
    public static int uniq(int[] arr){
        int n=arr.length;
        if (n==1)
            return arr[0];
        if (arr[0]!=arr[1])
            return arr[0];
        if (arr[n-1]!=arr[n-2])
            return arr[n-1];
        int s=1; int e=n-2;
        while (s<=e){
            int m=(s+e)/2;
            if (arr[m]!=arr[m-1] && arr[m]!=arr[m+1])
                return arr[m];
            if (arr[m]==arr[m-1])
                m=m-1;
            if(m%2==0)
                s=m+2;
            else
                e=m-1;
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr={8,8,5,5,9,9,6,2,2,4,4};
        System.out.println(uniq(arr));
    }
}