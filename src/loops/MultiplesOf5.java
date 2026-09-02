/*
 Notes:
 1. Problem: Print the first N multiples of 5.
 2. I take N as input and store it in `n`.
 3. I use a `for` loop because I need to generate exactly N multiples.
 4. I start `i` from 1 and run the loop while `i <= n`.
 5. In each iteration, I multiply `i` by 5 to generate the multiples:
    1*5 = 5, 2*5 = 10, 3*5 = 15, ...
 6. `i++` increases the multiplier by 1 after each iteration.
 7. I use `System.out.print()` with a space to print all multiples on the same line.
 8. Approach: take N → loop N times → calculate `i * 5` → print it.
 9. Concepts used: Scanner, for loop, counter variable, multiplication,
    and System.out.print().
 */

package loops;

import java.util.Scanner;

public class MultiplesOf5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        for (int i = 1; i <= n ; i++) {
            System.out.print((i * 5) + " ");
        }
    }
}
