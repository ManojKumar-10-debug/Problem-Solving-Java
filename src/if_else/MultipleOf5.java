/*
Notes:
1. Problem: Check whether the given number is a multiple of 5.
2. I first take the number as input using Scanner and store it in num.
3. I use the modulus (%) operator to find the remainder when num is divided by 5.
4. If num % 5 == 0, the number is exactly divisible by 5, so I print "Yes".
5. Otherwise, the remainder is not 0, so I print "No".
6. I used if-else because there are two possible cases: multiple of 5 or not.
7. Important concept: Modulus (%) and if-else decision-making.
*/

package if_else;

import java.util.Scanner;

public class MultipleOf5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if(num % 5 == 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }

}
