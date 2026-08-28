package DataTypes;

import java.util.Scanner;

/* First take two variables
             ||
          Take input
             ||
        sum two number
             ||
          Store in c
             ||
           print c
*/
public class Add {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();

        int c = firstNumber + secondNumber;

        System.out.println(c);
    }
}
