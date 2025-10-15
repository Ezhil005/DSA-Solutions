// ✅ Two-pointer merge | Merges two sorted arrays into one | O(n + m) time
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int[] a={7,10,11,14}; int[] b={3,8,9};
        int k=0;
        int p1=0;
        int p2=0;
        int[] c=new int[a.length+b.length];
        while (p1< a.length && p2<b.length){
            if (a[p1]<b[p2]){
                c[k]=a[p1];
                p1++;
            }
            else {
                c[k]=b[p2];
                p2++;
            }
            k++;
        }
        while (p1<a.length){
            c[k]=a[p1];
            p1++; k++;
        }
        while (p2< b.length){
            c[k]=b[p2];
            k++; p2++;
        }
        System.out.println(Arrays.toString(c));
    }
}