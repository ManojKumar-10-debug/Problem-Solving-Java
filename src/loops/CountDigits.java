/*
 Notes:
 1. Problem: Count the number of digits in a given number.
 2. `count = 0` stores the number of digits counted so far.
 3. `while (num > 0)` continues until all digits are removed.
 4. `count++` increases the count by 1 for each digit.
 5. `num /= 10` removes the last digit from `num`.
 6. We use `while` because the number of digits is not fixed.
 7. The loop depends on the condition `num > 0`, not on a fixed number
    of iterations.
 8. Approach: count one digit → remove one digit → repeat until num is 0.
 9. `System.out.println(count)` prints the total number of digits.
 10. Example 1: 1234 → 4 digits.
 11. Example 2: 507 → 3 digits.
 12. Concepts used: Scanner, while loop, counter variable, integer division,
     and variable updating.
 */

package loops;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        int count = 0;

        while ( num > 0 ){
            count++;
            num /= 10;
        }
        System.out.println(count);
    }
}
