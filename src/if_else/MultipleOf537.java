/*
Notes:
1. Problem: Check whether the given number is a multiple of 5, 3, and 7.
2. I take the number as input and store it in num.
3. I check all three conditions using the modulus (%) operator.
4. num % 5 == 0 checks whether num is divisible by 5.
5. num % 3 == 0 checks whether num is divisible by 3.
6. num % 7 == 0 checks whether num is divisible by 7.
7. I combine the conditions using &&, so all three must be true.
8. I use the ternary operator (? :) to choose "Yes" or "No".
9. The selected result is stored in the String variable res.
10. Finally, I print res.
11. Important concepts: modulus (%), logical AND (&&), ternary operator (? :), String, and input using Scanner.
*/

package if_else;

import java.util.Scanner;

public class MultipleOf537 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        String res = (num % 5 == 0 && num % 3 == 0 && num % 7 == 0 ) ? "Yes" : "No";
        System.out.println(res);
    }
}
