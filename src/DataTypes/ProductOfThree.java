/*
  1. Take three integer inputs and find their product.
  2. Store the inputs in firstNumber, secondNumber, and thirdNumber.
  3. Pass the three values to productOfThree() method.
  4. The method multiplies them and returns the result as long.
  5. Store the returned value in res and print it.

  Concept: Method calling, arguments, return value, type casting.
 */
package DataTypes;

import java.util.Scanner;

public class ProductOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();
        int thirdNumber = input.nextInt();

        long res = productOfThree(firstNumber, secondNumber, thirdNumber);
        System.out.println(res);
    }
    public static long productOfThree(int firstNumber, int secondNumber, int thirdNumber){
        return (long) firstNumber * secondNumber * thirdNumber;
    }
}
