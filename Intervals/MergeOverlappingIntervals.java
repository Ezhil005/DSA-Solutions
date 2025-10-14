/**
 * Problem: Merge Overlapping Intervals
 *
 * Description:
 * Given a list of intervals, merge all overlapping intervals into consolidated ranges.
 * Assumes input intervals are sorted by start time.
 *
 * Approach:
 * - Track current interval's start and end.
 * - If next interval overlaps (start ≤ current end), extend the end.
 * - If not overlapping, add current interval to result and start a new one.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n) for storing merged intervals
 *
 * Example:
 * Input: [[0,2],[1,4],[5,6],[6,8],[7,10],[8,9],[12,14]]
 * Output: [[0,4],[5,10],[12,14]]
 */
public static ArrayList<ArrayList<Integer>> merge(ArrayList<ArrayList<Integer>> al){
    ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
    int start = al.get(0).get(0);
    int end = al.get(0).get(1);
    for (int i = 1; i < al.size(); i++) {
        if (end >= al.get(i).get(0)) {
            end = Math.max(end, al.get(i).get(1));
        } else {
            ArrayList<Integer> interval = new ArrayList<>();
            interval.add(start);
            interval.add(end);
            ans.add(interval);
            start = al.get(i).get(0);
            end = al.get(i).get(1);
        }
    }
    ArrayList<Integer> interval = new ArrayList<>();
    interval.add(start);
    interval.add(end);
    ans.add(interval);
    return ans;
}
