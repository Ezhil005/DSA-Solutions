/**
 * Problem: Reverse an Integer
 *
 * Description:
 * Given an integer n, reverse its digits and print the result.
 * This is done by extracting each digit using modulo (%) and
 * building the reversed number by multiplying the result by 10
 * and adding the last digit.
 *
 * Example:
 * Input: 4567
 * Output: 7654
 *
 * Time Complexity: O(log₁₀n)
 * Space Complexity: O(1)
 */

public class Main {
    public static void main(String[] args){
        int n=4567;
        int reverse=0;
        while (n>0){
            int lastdigit=n%10;
            reverse=reverse*10+lastdigit;
            n=n/10;
        }
        System.out.println(reverse);
    }
} 