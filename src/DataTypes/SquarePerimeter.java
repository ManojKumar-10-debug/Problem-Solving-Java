/*
Notes:
1. The problem asks us to find the perimeter of a square using its side.
2. Scanner is used to take the side value as an integer input.
3. The side variable stores the input value.
4. I calculate the square perimeter using the formula 4 * side.
5. The calculated value is stored in the perimeter variable.
6. System.out.println() prints the perimeter as the output.
7. Java concepts used: Scanner, variables, arithmetic operators, and int.
*/

package DataTypes;

import java.util.Scanner;

public class SquarePerimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int side = input.nextInt();

        int perimeter = 4 * side;  // formula

        System.out.println(perimeter);
    }
}
