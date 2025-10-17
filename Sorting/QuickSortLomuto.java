// ✅ Quick Sort | Lomuto Partition | In-place | O(n log n) average
import java.util.Arrays;

public class Main {
    public static int partition(int[] arr,int l, int r){
        int i=l; int j=l;
        int n=arr.length;
        int p=arr[r];
        while (j<r){
            if (arr[j]<p){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
            }
            j++;
        }
        int temp=arr[i];
        arr[i]=arr[r];
        arr[r]=temp;
        return i;
    }
    public static void quicksort(int[] arr,int s,int e){
        if (s>=e)
            return;
        int p_index=partition(arr,s,e);
        quicksort(arr,s,p_index-1);
        quicksort(arr,p_index+1,e);
    }
    public static void main(String[] args){
        int[] arr={7,8,9,10,3,4,1};
        int s=0; int e=arr.length-1;
        quicksort(arr,s,e);
        System.out.println(Arrays.toString(arr));
    }
}