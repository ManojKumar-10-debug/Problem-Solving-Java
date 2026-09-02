/*
 * Notes:
 * 1. The problem asks us to take a character and print its ASCII value.
 * 2. I take the input as a String using nextLine().
 * 3. charAt(0) gets the first character from the input.
 * 4. I store that character in an int variable `ascii`.
 * 5. When a char is stored in an int, Java automatically converts the character
 *    into its corresponding ASCII/Unicode value.
 * 6. Finally, I print `ascii` to display the numeric value of the character.
 * 7. Approach: input character → get first character → store in int → print value.
 */

package if_else;

import java.util.Scanner;

public class AsciiValueChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int ascii = input.nextLine().charAt(0);
        System.out.println(ascii);
    }
}
