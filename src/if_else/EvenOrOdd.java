/*
Notes:
1. The problem asks us to check whether the given number is even or odd and return "Yes" or "No".
2. I take the number as an integer input and store it in num.
3. I pass num to the isEvenOrOdd() method to keep the checking logic separate from main().
4. Inside the method, I use num % 2 to check the remainder when num is divided by 2.
5. If the remainder is 0, the number is even, so the method returns "Yes".
6. Otherwise, the number is odd, so the method returns "No".
7. I store the returned String value in res and print it.
8. Approach: take input → pass it to a method → check using % → return "Yes"/"No" → store and print the result.
9. Java concepts: methods, parameters, return value, String, if-else, and modulus (%) operator.
*/


package if_else;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        String res = isEvenOrOdd(num);
        System.out.println(res);
    }
    public static String isEvenOrOdd(int num){
        if(num % 2 == 0){
            return "Yes";
        }else{
            return "No";
        }
    }
}
