/*
Notes:
1. The problem asks us to find the circumference of a circle using the given radius.
2. I create a constant PI and store 3.142 because its value is fixed.
3. I take the radius as integer input using Scanner and store it in radius.
4. I calculate the circumference using the formula 2 * PI * radius.
5. I store the calculated value in the double variable circumference because the result can contain decimals.
6. I use System.out.printf() with %.4f to print the circumference up to 4 decimal places.
7. Concept: Scanner input, final constant, variables, arithmetic operators, double, and formatted output.
*/

package DataTypes;

import java.util.Scanner;

public class CircumferenceOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double PI = 3.142;

        int radius = input.nextInt();

        double circumference = 2 * PI * radius;

        System.out.printf("%.4f\n", circumference);
    }
}
