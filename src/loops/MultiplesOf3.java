/*
 * Notes:
 * 1. Problem: Print the first N multiples of 3.
 * 2. I take N as input and store it in `n`.
 * 3. I use a `for` loop because I need to generate exactly N multiples.
 * 4. I start `i` from 1 and run the loop while `i <= n`.
 * 5. In each iteration, I multiply `i` by 3 to generate the multiples:
 *    1*3 = 3, 2*3 = 6, 3*3 = 9, ...
 * 6. `i++` moves to the next multiplier after every iteration.
 * 7. I use `System.out.print()` with a space so all multiples appear on
 *    the same line.
 * 8. Approach: take N → loop N times → calculate `i * 3` → print it.
 * 9. Concepts used: Scanner, for loop, counter variable, multiplication,
 *    and System.out.print().
 */

package loops;

import java.util.Scanner;

public class MultiplesOf3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        for (int i = 1; i <= n ; i++) {
            System.out.print((i * 3) + " ");
        }
    }
}
