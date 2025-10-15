// ✅ Merge Sort | Recursive divide-and-conquer | Two-pointer merge | O(n log n) time
import java.util.Arrays;

public class Main {
    public static int[] merge(int[] arr, int s, int m, int e){
        int n=arr.length;
        int p1=s; int p2=m+1;
        int k=0;
        int[] c=new int[e-s+1];
        while (p1<=m && p2<=e){
            if (arr[p1]<arr[p2]){
                c[k]=arr[p1];
                p1++;
            }
            else {
                c[k]=arr[p2];
                p2++;
            }
            k++;
        }
        while (p1<=m){
            c[k]=arr[p1];
            p1++;k++;
        }
        while (p2<=e){
            c[k]=arr[p2];
            p2++;k++;
        }
        for (int i=0;i<c.length;i++){
            arr[s+i]=c[i];
        }
        return arr;
    }
    public static void merge_sort(int[] arr,int s,int e){
        if (s==e)
            return;
        int mid=s+(e-s)/2;
        merge_sort(arr,s,mid);
        merge_sort(arr,mid+1,e);
        merge(arr,s,mid,e);
    }
    public static void main(String[] args){
        int[] arr={10,15,3,8,6,2,17,12,18};
        int s=0; int e=arr.length-1;
        merge_sort(arr,s,e);
        System.out.println(Arrays.toString(arr));
    }
}

