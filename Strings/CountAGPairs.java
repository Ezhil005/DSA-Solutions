/**
 * Problem: Count "ag" Pairs in a String
 *
 * Description:
 * Count the number of pairs (i, j) such that s[i] = 'a', s[j] = 'g', and i < j.
 * Each 'g' contributes `count_a` to the total, where `count_a` is the number of 'a's seen so far.
 *
 * Example:
 * Input: "gacgdgag"
 * Output: 4
 *
 * Time Complexity: O(n)  
 * Space Complexity: O(1)
 */
public class Main {
    public static void main(String[] args){
        String s="gacgdgag";
        int n=s.length();
        int count_a=0; int ans=0;
        for (int i=0;i<n;i++){
            if (s.charAt(i)=='a')
                count_a++;
            if (s.charAt(i)=='g')
                ans+=count_a;
        }
        System.out.println(ans);
    }
}