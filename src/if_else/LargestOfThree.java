/*
 * Notes:
 * 1. Problem: Find the largest number among three given numbers.
 * 2. I take three numbers as input and store them in `a`, `b`, and `c`.
 * 3. I create `largest` to store whichever number is found to be greatest.
 * 4. First, I check whether `a` is greater than or equal to both `b` and `c`.
 * 5. If true, I store `a` in `largest`.
 * 6. Otherwise, I check whether `b` is greater than or equal to both `a` and `c`.
 * 7. If true, I store `b` in `largest`; otherwise, `c` must be the largest,
 *    so I store `c`.
 * 8. Finally, I print the value stored in `largest`.
 * 9. Approach: compare each number against the other two and store the
 *    largest one in a separate variable.
 * 10. Concepts used: Scanner, variables, comparison operators, and
 *     if-else-if-else ladder.
 */

package if_else;

import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int largest;
        if (a >= b && a >= c) {
            largest = a;
        } else if (b >= a && b >= c) {
            largest = b;
        } else {
            largest = c;
        }

        System.out.println("Largest: " + largest);
    }
}