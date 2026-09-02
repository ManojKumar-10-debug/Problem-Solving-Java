/*
 Notes:
 1. Problem: Print numbers from 2 to N that are multiples of 2, 5, or 7.
 2. I take N as input and store it in `n`.
 3. I use a `for` loop starting from 2 and check every number up to N.
 4. `i % 2 == 0` checks whether `i` is a multiple of 2.
 5. `i % 5 == 0` checks whether `i` is a multiple of 5.
 6. `i % 7 == 0` checks whether `i` is a multiple of 7.
 7. I use `||` because the number only needs to satisfy any one of
    the three conditions.
 8. If any condition is true, I print `i`.
 9. Approach: take N → check each number from 2 to N → check multiple
    of 2 or 5 or 7 → print the number if true.
 10. Concepts used: Scanner, for loop, `%` modulus, if condition,
     logical OR (`||`), and System.out.print().
 */

package loops;

import java.util.Scanner;

public class MultiplesOf2And5And7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        for(int i = 2; i <= n; i++){
            if(i % 2 == 0 || i % 5 == 0 || i % 7 == 0)
                System.out.print(i + " ");
        }
    }
}
