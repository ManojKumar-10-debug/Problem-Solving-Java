/*
 Notes:
 1. Problem: Count the total number of factors of a given number.
 2. `findFactors(int n)` is a separate method that contains the factor-counting logic.
 3. I create `count = 0` to store how many factors are found.
 4. I use a `for` loop from 1 to `n` to check every possible factor.
 5. `n % i == 0` checks whether `i` is a factor of `n`.
 6. When `i` is a factor, I increase `count` using `count++`.
 7. After checking all values, `return count` sends the total number of
    factors back to the calling statement.
 8. In `main`, I pass `n` to `findFactors(n)` and directly print the
    returned value using `System.out.println()`.
 9. I used a method with `int` return type because the method needs to
    send the calculated factor count back to `main`.
 10. Approach: take n → check every number from 1 to n → count the numbers
     that divide n exactly → return count → print the returned result.
 11. Example 1: 12 → factors are 1, 2, 3, 4, 6, 12 → count = 6.
 12. Example 2: 7 → factors are 1, 7 → count = 2.
 13. Concepts used: Scanner, method, parameter, return value, for loop,
     counter variable, `%` modulus, if condition, and method calling.
 */

package loops;

import java.util.Scanner;

public class CountFactors {

    static int findFactors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println(findFactors(n));
    }
}