/*
Notes:
1. Problem: Check whether the given number represents an uppercase letter,
   lowercase letter, numerical character, or special character using ASCII values.
2. Code takes the ASCII value as input and stores it in the variable `num`.
3. Uses if-else-if conditions to check which ASCII range the value belongs to.
4. 65–90 represents uppercase letters, so the code prints "Uppercase".
5. 97–122 represents lowercase letters, so the code prints "Lowercase".
6. 48–57 represents numerical characters, so the code should print "Numerical".
7. If the value does not fall into these ranges, the code prints "Special Characters".
8. Approach: Instead of converting the ASCII value to a character, the code directly
   compares the input number with the known ASCII ranges.
9. Important concept: if-else-if ladder and ASCII value ranges.
*/

package if_else;

import java.util.Scanner;

public class UppercaseAsciiLowercaseAsciiNumberAscii {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        isUppercaseOrLowercase(num);
    }
    public static void isUppercaseOrLowercase(int num){
        if(num >= 65 && num <= 90){
            System.out.println("Uppercase");
        } else if (num >= 97 && num <= 122) {
            System.out.println("Lowercase");
        } else if (num >= 48 && num <= 57) {
            System.out.println("Numerical");
        }else{
            System.out.println("Special Characters");
        }
    }
}
