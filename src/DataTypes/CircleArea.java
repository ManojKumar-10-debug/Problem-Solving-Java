/*
Notes:
1. The problem asks us to find the area of a circle using the given radius.
2. I create a constant PI and store 3.142 because its value should remain fixed.
3. I take the radius as integer input using Scanner and store it in radius.
4. I use the formula PI * radius * radius to calculate the circle's area.
5. I store the calculated value in the double variable area because the result can contain decimals.
6. Finally, I print area using System.out.println().
7. Concept: Scanner input, final constant, variables, arithmetic operators, and double.
*/

package DataTypes;

import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double PI = 3.142;

        int radius = input.nextInt();

        // formula
        double area = PI * radius * radius;

        System.out.println(area);
    }
}
