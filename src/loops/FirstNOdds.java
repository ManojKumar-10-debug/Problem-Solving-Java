/*
 * Notes:
 * 1. Problem: Print the first N odd natural numbers.
 * 2. I take N as input and store it in `n`.
 * 3. I use a `for` loop because I need to generate exactly N odd numbers.
 * 4. I start `i` from 1 and run the loop while `i <= n`.
 * 5. `i++` increases the counter by 1 after each iteration.
 * 6. I use `(i * 2) - 1` to generate odd numbers:
 *    1*2-1 = 1, 2*2-1 = 3, 3*2-1 = 5, ...
 * 7. `System.out.print()` prints each number on the same line with a space.
 * 8. Approach: repeat N times → calculate the odd number using `2*i - 1`
 *    → print it.
 * 9. Concepts used: Scanner, for loop, counter variable, arithmetic
 *    expression, and System.out.print().
 */

package loops;

import java.util.Scanner;

public class FirstNOdds {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.print((i * 2) - 1 + " ");
        }
    }
}
