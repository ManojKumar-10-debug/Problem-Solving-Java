/*
  1. Take dollar amount and exchange rate as inputs.
  2. Store them in dollar and exchangeRate.
  3. Pass both values to dollarToRupee() method.
  4. The method multiplies dollar by exchangeRate and returns the result.
  5. Store the reurned value in INR and print it with 4 decimal places.

 * Concept: Method calling, arguments, return value, type conversion.
 */
/*
1. printf() is used to print formatted output.
2. "%.4f" means print a decimal number with exactly 4 digits after the decimal point.
3. "\n" moves the cursor to the next line after printing.
4. INR is the value passed to printf() and replaces %.4f.

Example:
printf("%.4f\n", INR);
If INR = 83.456789, output is:
83.4568
*/




package DataTypes;

import java.util.Scanner;

public class DollarConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int dollar = input.nextInt();
        double exchangeRate = input.nextDouble();

        double INR = dollarToRupee(dollar, exchangeRate);

        System.out.printf("%.4f\n", INR);
    }
    public static double dollarToRupee(int dollar, double exchangeRate){
        return  dollar * exchangeRate;
    }
}
