/**
 * Problem: Check if a Number is Prime
 *
 * Description:
 * Given an integer n, determine whether it is a prime number.
 * A prime number has exactly two distinct positive divisors: 1 and itself.
 * This program counts the total number of divisors and checks if it's more than 2.
 *
 * Example:
 * Input: n = 7
 * Output: it is a prime number
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class Main {
    public static void main(String[] args){
        int count=0;
        int n=7;
        for (int i=1;i<=n;i++){
            if(n%i==0)
                count++;
        }
        if (count>2)
            System.out.print("it is  not an prime number");
        else
            System.out.println("it is an prime number");
    }
}