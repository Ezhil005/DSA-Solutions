/**
 * Problem: Tower of Hanoi
 *
 * Description:
 * You are given A disks and 3 rods numbered 1 to 3. Initially, all disks are stacked on rod 1 in increasing size from top to bottom.
 * The goal is to move all disks from rod 1 to rod 3 following these rules:
 * - Only one disk can be moved at a time.
 * - A disk can only be placed on top of a larger disk or an empty rod.
 * - You must use rod 2 as an auxiliary.
 *
 * You must return a list of moves in the format [disk, from, to], where:
 * - disk: the disk number being moved
 * - from: the rod number from which the disk is moved
 * - to: the rod number to which the disk is moved
 *
 * Example:
 * Input: A = 2
 * Output: [1, 1, 2], [2, 1, 3], [1, 2, 3]
 *
 * Time Complexity: O(2^A)
 * Space Complexity: O(2^A)
 */

public class Solution {
    public void tower(int A,int B, int C, int D, ArrayList<ArrayList<Integer>> ans){
        if(A==0)
          return;
        ArrayList<Integer> val=new ArrayList<>();
        tower(A-1,B,D,C,ans);
        val.add(A);
        val.add(B);
        val.add(D);
        ans.add(val);
        tower(A-1,C,B,D,ans);
    }
    public ArrayList<ArrayList<Integer>> towerOfHanoi(int A) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        tower(A,1,2,3,ans);
        return ans;

    }
}