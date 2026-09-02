/*
Notes:
1. Problem: Check whether the given number ends with 0 or not.
2. I take the number as input and store it in num.
3. To check the last digit, I use the modulo (%) operator with 10.
4. num % 10 gives the remainder after dividing num by 10, which represents its last digit.
5. If num % 10 == 0, the number ends with 0.
6. I use the ternary operator to store "Yes" if the condition is true, otherwise "No".
7. I store the result in res so I can reuse/print the result without writing the condition again.
8. System.out.println(res) prints the stored result.
9. Concepts used: Scanner, variable, modulo (%), comparison operator, and ternary operator.
*/
// Number ends with zero or not

package if_else;

import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        String res = num % 10 == 0 ? "Yes" : "No";
        System.out.println(res);
    }
}
