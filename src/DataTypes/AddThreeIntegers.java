/*
Notes:
1. Scanner takes three integer inputs.
2. firstNumber, secondNumber, and thirdNumber store the inputs.
3. addThreeIntegers() receives the three numbers as parameters.
4. The method adds the three numbers and returns the result.
5. The returned result is stored in res.
6. res is printed using System.out.println().
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
