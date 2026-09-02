// Notes:
// 1. Take an ASCII value as an integer input.
// 2. Convert the integer ASCII value into its equivalent character.
// 3. `(char) num` performs explicit type casting from int to char.
// 4. The converted character is stored in the `ascii` variable.
// 5. Printing `ascii` displays the character represented by that ASCII value.

package if_else;

import java.util.Scanner;

public class EquivalentAscii {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        char ascii = (char)num;
        System.out.println(ascii);
    }
}
