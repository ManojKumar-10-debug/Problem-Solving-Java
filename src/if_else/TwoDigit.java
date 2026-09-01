/*
Notes:
1. Problem: Check whether the given number is a two-digit number.
2. Read the number using Scanner and store it in the variable num.
3. A two-digit number is greater than 9 and less than 100.
4. Used the ternary operator to check both conditions in one statement.
5. If num > 9 && num < 100 is true, store "Yes" in isTwoDigit.
6. Otherwise, store "No" in isTwoDigit.
7. Finally, print the stored result using System.out.println().
8. Java concepts used: Scanner, logical AND (&&), ternary operator, String variable.
*/

package if_else;

import java.util.Scanner;

public class TwoDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        String isTwoDigit = (num > 9 && num < 100) ? "Yes" : "No";
        System.out.println(isTwoDigit);
    }
}
