/*
Notes:
1. Problem: Check whether the given number is a 3-digit number and a multiple of 2, 5, and 10.
2. I take the number as input and store it in num.
3. I check 99 < num < 1000 to make sure num is a 3-digit number.
4. I check num % 10 == 0 to make sure num is a multiple of 10.
5. A multiple of 10 is automatically a multiple of both 2 and 5, so I only need to check % 10.
6. I combine both conditions using && because both conditions must be true.
7. I use the ternary operator to store "Yes" when the conditions are true, otherwise "No".
8. I store the final result in isThreeDigitAndMultipleOf10 so I can print the variable directly.
9. System.out.println() prints the stored result.
10. Concepts used: Scanner, variables, relational operators, %, &&, and ternary operator.
*/
// ThreeDigit and Multiples of 2, 5, 10
package if_else;

import java.util.Scanner;

public class ThreeDigitAndMultiples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        String isThreeDigitAndMultipleOf10 = (num > 99 && num < 1000 && num % 10 == 0) ? "Yes" : "No";

        System.out.println(isThreeDigitAndMultipleOf10);
    }
}
