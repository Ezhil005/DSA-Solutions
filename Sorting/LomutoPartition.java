// ✅ Lomuto Partition | Quick Sort step | In-place | O(n) time
import java.util.Arrays;

public class LomutoPartition {
    public static void main(String[] args){
        int[] arr = {3, 7, 2, 5, 16, 4};
        int n = arr.length;
        int pivot = arr[n - 1];
        int i = 0;

        for (int j = 0; j < n - 1; j++) {
            if (arr[j] < pivot) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }

        int temp = arr[i];
        arr[i] = arr[n - 1];
        arr[n - 1] = temp;

        System.out.println(Arrays.toString(arr));
    }
}
