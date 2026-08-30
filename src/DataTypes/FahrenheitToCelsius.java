/*
Notes:
1. The problem asks us to convert a temperature from Fahrenheit to Celsius.
2. I take the Fahrenheit value as integer input using Scanner and store it in Fahrenheit.
3. I use the formula (Fahrenheit - 32) * 5 / 9 to calculate Celsius.
4. I use 9.0 instead of 9 so the calculation produces a decimal result.
5. I store the calculated value in the double variable Celsius.
6. I use System.out.printf() with %.4f to print the Celsius value up to 4 decimal places.
7. Concept: Scanner input, variables, arithmetic operators, type promotion, double, and formatted output.
*/

package DataTypes;

import java.util.Scanner;


public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int fahrenheit = input.nextInt();

        double celsius = (fahrenheit-32) * 5 / 9.0; // formula

        System.out.printf("%.4f\n", celsius);
    }
}
