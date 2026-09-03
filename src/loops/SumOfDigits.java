/*
 Notes:
 1. Problem: Find the sum of all digits in a number.
 2. `sum = 0` stores the total of the extracted digits.
 3. `while (num > 0)` continues until all digits are processed.
 4. `num % 10` extracts the last digit of `num`.
 5. `sum += digit` adds the extracted digit to `sum`.
 6. `num = num / 10` removes the last digit because `num` is an int
    and Java performs integer division.
 7. We use `while` because the number of digits is not fixed.
 8. The loop is controlled by `num > 0`, not by a fixed number of
    iterations.
 9. Approach: extract last digit → add it to sum → remove last digit
    → repeat until num becomes 0.
 10. `System.out.println(sum)` prints the final sum.
 11. Example 1: 123 → 1 + 2 + 3 = 6.
 12. Example 2: 507 → 5 + 0 + 7 = 12.
 13. Concepts used: Scanner, while loop, `%` modulus, integer division,
     variable update, and System.out.println().
 */

package loops;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        int sum = 0;
        while (num > 0){
            int digit = num % 10;
            sum += digit;
            num = num / 10;
        }
        System.out.println(sum);
    }
}
