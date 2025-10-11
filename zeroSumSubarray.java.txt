import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static boolean nonre(int[] arr) {
        HashSet<Integer> hs=new HashSet<>();
        int n= arr.length;
        int[] pf=new int[n];
        pf[0]=arr[0];
        for (int i=1;i<n;i++){
            pf[i]=pf[i-1]+arr[i];
        }
        for (int i=0;i<arr.length;i++){
            if (pf[i]==0 || hs.contains(pf[i]))
                return true;
            hs.add(pf[i]);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr={2,-1,-1,5,3,-8,0};
        System.out.println(nonre(arr));
    }
}