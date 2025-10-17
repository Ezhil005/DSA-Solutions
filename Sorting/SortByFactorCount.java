// ✅ Sort by Factor Count | Custom Comparator | O(n√m) time
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static int factors(int x){
        int factors=0;
        for (int i=1;i*i<=x;i++){
            if (x%i==0){
                if (i*i==x)
                    factors++;
                else
                    factors+=2;
            }
        }
        return factors;
    }
    public ArrayList<Integer> compare(ArrayList<Integer> A){
        Collections.sort(A, new Comparator<Integer>() {
            @Override
            public int compare(Integer v1, Integer v2) {
                if (factors(v1)==factors(v2)) {
                    if (v1 < v2)
                        return -1;
                    else if (v2 < v1)
                        return 1;
                    return 0;
                } else if (factors(v1)<factors(v2)) {
                    return -1;
                }
                return 1;
            }
        });
        return A;
    }
    public static void main(String[] args){
        int[] arr={10,4,5,13,1};
        ArrayList<Integer> list=new ArrayList<>();
        for (int num:arr){
            list.add(num);
        }
        Main obj=new Main();
        ArrayList<Integer> sorted=obj.compare(list);
        System.out.println(sorted);
    }
}