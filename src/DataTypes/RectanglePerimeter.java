/*
Notes:
1. The problem asks us to find the perimeter of a rectangle using length and width.
2. Scanner is used to take two integer inputs from the user.
3. length stores the first input and width stores the second input.
4. I calculate the perimeter using the formula 2 * (length + width).
5. The calculated value is stored in the perimeter variable.
6. I use long for perimeter to store the calculated result safely.
7. System.out.println() prints the perimeter.
8. Java concepts used: Scanner, variables, arithmetic operators, and type long.
*/

package DataTypes;

import java.util.Scanner;

public class RectanglePerimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int length = input.nextInt();
        int width = input.nextInt();

        long perimeter = 2L * (length + width);

        System.out.println(perimeter);
    }
}
