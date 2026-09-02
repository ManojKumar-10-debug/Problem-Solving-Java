/*
 * Notes:
 * 1. Problem: Print the first N even natural numbers.
 * 2. I take N as input and store it in the variable `N`.
 * 3. I use a `for` loop to repeat the process N times.
 * 4. I start `i` from 1 because I need the first even number as 2.
 * 5. `i <= N` makes the loop run exactly N times.
 * 6. In each iteration, I multiply `i` by 2 to get the corresponding
 *    even number: 1*2, 2*2, 3*2, ...
 * 7. `i++` increases `i` by 1 after every iteration.
 * 8. I print `i * 2` with a space after each number.
 * 9. Approach: run the loop N times → generate each even number using
 *    `i * 2` → print it.
 * 10. Concepts used: Scanner, for loop, counter variable, multiplication,
 *     and System.out.print().
 */

package loops;

import java.util.Scanner;

public class FirstNEvenNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        for(int i = 1; i <= N; i++){
            System.out.print(i * 2 + " ");
        }
    }
}
