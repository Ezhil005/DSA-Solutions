/**
 * Problem: Insert and Merge Interval
 *
 * Description:
 * Given a list of non-overlapping intervals sorted by start time,
 * insert a new interval and merge if necessary to maintain sorted non-overlapping intervals.
 *
 * Approach:
 * - Add the new interval to the list.
 * - Sort all intervals by start time.
 * - Traverse and merge overlapping intervals using a linear scan.
 *
 * Time Complexity: O(n log n) for sorting + O(n) for merging
 * Space Complexity: O(n) for storing merged intervals
 *
 * Example:
 * Input: intervals = [[1, 3], [6, 9]], newInterval = [2, 5]
 * Output: [[1, 5], [6, 9]]
 */
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static ArrayList<ArrayList<Integer>> merge(ArrayList<ArrayList<Integer>> A, ArrayList<Integer> B) {
        A.add(B);
        A.sort((a, b) -> Integer.compare(a.get(0), b.get(0)));
        int start = A.get(0).get(0);
        int end = A.get(0).get(1);
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for (int i = 1; i < A.size(); i++) {
            if (end >= A.get(i).get(0))
                end = Math.max(end, A.get(i).get(1));
            else {
                ArrayList<Integer> interval = new ArrayList<>();
                interval.add(start);
                interval.add(end);
                ans.add(interval);
                start = A.get(i).get(0);
                end = A.get(i).get(1);
            }
        }
        ArrayList<Integer> interval = new ArrayList<>();
        interval.add(start);
        interval.add(end);
        ans.add(interval);
        return ans;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> intervals = new ArrayList<>();
        intervals.add(new ArrayList<>(Arrays.asList(1, 3)));
        intervals.add(new ArrayList<>(Arrays.asList(6, 9)));

        ArrayList<Integer> newInterval = new ArrayList<>(Arrays.asList(2, 5));

        ArrayList<ArrayList<Integer>> result = merge(intervals, newInterval);

        System.out.println(result);
    }
}
