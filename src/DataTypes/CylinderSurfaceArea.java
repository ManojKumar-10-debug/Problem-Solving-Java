/*
Notes:
1. The problem asks us to calculate the total surface area of a cylinder.
2. I take radius and height as integer inputs and store them in radius and height.
3. I store PI as a constant using final because its value should not change.
4. I use the formula 2 * PI * radius * (radius + height) to calculate the surface area.
5. I store the calculated result in the double variable area.
6. I use System.out.printf() with %.4f to print the result up to 4 decimal places.
7. Approach: take input → apply the formula → store the result → print the formatted result.
8. Java concepts: Scanner, variables, final constant, arithmetic operators, and formatted output.
*/

package DataTypes;

import java.util.Scanner;

public class CylinderSurfaceArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double PI = 3.142;

        int radius = input.nextInt();
        int height = input.nextInt();

        // formula
        double area = 2*PI*radius* (radius + height) ;
        System.out.printf("%.4f", area);
    }
}
