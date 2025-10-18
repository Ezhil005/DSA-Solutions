// ✅ Tens Digit Sorting | Custom Comparator | Greedy | O(n log n)
public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        Collections.sort(A, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                if (tens(a) == tens(b)) {
                    if (a < b)
                        return 1;
                    else if (a > b)
                        return -1;
                    return 0;
                } else if (tens(a) < tens(b)) {
                    return -1;
                }
                return 1;
            }
        });
        return A;
    }

    public int tens(int num) {
        return (num / 10) % 10;
    }
}
