/*
 Notes:
 1. Problem: Find and print all factors of a given number.
 2. `findFactors(int n)` is a separate method that contains the factor logic.
 3. I use a `for` loop from 1 to `n` to check every possible factor.
 4. `n % i == 0` checks whether `i` divides `n` exactly.
 5. If the remainder is 0, `i` is a factor, so I print it.
 6. `findFactors(n)` calls the method and passes the input number to it.
 7. A separate method is used to keep the factor logic organized and reusable.
 8. Approach: start from 1 → check each number → if remainder is 0,
    print it → continue until n.
 9. Example 1: Factors of 12 → 1 2 3 4 6 12.
 10. Example 2: Factors of 10 → 1 2 5 10.
 11. Concepts used: Scanner, method, for loop, `%` modulus, if condition,
     method calling, and parameters.
 */

package loops;

import java.util.Scanner;

public class Factors {

    static void findFactors(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        findFactors(n);
    }
}