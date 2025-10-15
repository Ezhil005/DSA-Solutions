// ✅ Merge Subarray [s..e] | Two-pointer technique | Handles partial merge in-place | O(e - s + 1) time
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
    public static void main(String[] args){
        int[] arr={4,8,-1,2,6,9,11,3,4,7,13,0};
        int s=2; int m=6; int e=9;
        System.out.println(Arrays.toString(merge(arr,s,m,e)));
    }
}