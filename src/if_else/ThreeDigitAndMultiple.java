/*
Notes:
1. The problem asks us to check whether a number is a 3-digit number and a multiple of 10.
2. I first take the number as input and store it in num.
3. I check num > 99 and num < 1000 to verify that it is a 3-digit number.
4. I check num % 10 == 0 to verify that it is a multiple of 10.
5. I combine all conditions using && because all conditions must be true.
6. I use the ternary operator to store "Yes" when the condition is true, otherwise "No".
7. I store the result in isThreeDigitAndMultipleOf10 so I can reuse the result without repeating the condition.
8. I print the stored result.
9. Java concepts: && operator, % operator, ternary operator, variable storage.
*/

package if_else;

import java.util.Scanner;

public class ThreeDigitAndMultiple {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        String isThreeDigitAndMultipleOf10 = (num > 99 && num < 1000 && num % 10 == 0) ? "Yes" : "No";

        System.out.println(isThreeDigitAndMultipleOf10);
    }
}
