/*
 Notes:
 1. Problem: Print multiples of 2 from 2 up to N.
 2. I take N as input and store it in `n`.
 3. I start the loop variable `i` from 2 because 2 is the first multiple of 2.
 4. I use `i <= n` so the loop continues only while `i` is within N.
 5. Instead of checking `% 2` each time, I increase `i` by 2 using `i = i + 2`.
 6. This directly generates multiples of 2: 2, 4, 6, 8, ...
 7. `System.out.print(i + " ")` prints each multiple on the same line.
 8. Approach: start at 2 → increase by 2 each time → stop at N → print `i`.
 9. Concepts used: Scanner, for loop, loop variable, increment by 2,
    and System.out.print().
 */

package loops;

import java.util.Scanner;

public class MultiplesOf2TillN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        for(int i = 2; i <= n; i = i + 2){
            System.out.print(i + " ");
        }
    }
}
