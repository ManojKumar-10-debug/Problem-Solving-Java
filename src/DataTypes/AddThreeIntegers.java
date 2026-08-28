/*
1. Take three numbers as input.
2. Add the three numbers.
3. Store the result in variable sum.
4. Print sum.
*/
package DataTypes;

import java.util.Scanner;

public class AddThreeIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();
        int thirdNumber = input.nextInt();

        int res = addThreeIntegers(firstNumber, secondNumber, thirdNumber);
        System.out.println(res);
    }
    public static int addThreeIntegers(int firstNumber, int secondNumber, int thirdNumber){
        return firstNumber + secondNumber + thirdNumber;
    }
}
