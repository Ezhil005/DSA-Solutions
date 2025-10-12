/**
 * Problem: Print Prime Numbers from 2 to n
 *
 * Description:
 * Given an integer n, print all prime numbers from 2 to n.
 * A prime number has exactly two divisors: 1 and itself.
 * This approach counts the number of divisors for each number.
 *
 * Example:
 * Input: n = 24
 * Output: 2 3 5 7 11 13 17 19 23
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(1)
 */
public class Main {
    public static void main(String[] args){
        int n=24;
        for (int i=2;i<=n;i++){
            int count=0;
            for (int j=1;j<=i;j++){
                if (i%j==0)
                    count++;
            }
            if (count==2)
                System.out.print(i+" ");
        }
    }
}