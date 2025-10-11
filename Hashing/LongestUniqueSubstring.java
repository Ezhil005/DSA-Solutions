/**
 * Problem: Longest Substring Without Repeating Characters
 * 
 * Description:
 * Given a string, find the length of the longest substring that contains no repeating characters.
 * This solution uses a sliding window and HashSet to track unique characters efficiently.
 * 
 * Example:
 * Input: "bcacdb"
 * Output: 4  // ("acdb" is the longest substring without repeats)
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */


import java.util.HashSet;

public class Main {
    public static int longest(String str){
        int s=0;int ans=0;
        HashSet<Character> set=new HashSet<>();
        for (int e=0;e<str.length();e++){
            if (set.contains(str.charAt(e))){
                set.remove(str.charAt(s));
                s++;
            }
            set.add(str.charAt(e));
            ans=Math.max(ans,set.size());
        }
        return ans;
    }
    public static void main(String[] args){
        String s="bcacdb";
        System.out.println(longest(s));
    }
}