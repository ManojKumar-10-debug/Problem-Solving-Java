/*
 Notes:
 1. Problem: Print numbers from 2 to N that are multiples of 2 or 3.
 2. I take N as input and store it in `n`.
 3. I use a `for` loop starting from 2 and run it until `i <= n`.
 4. I check each number using the `%` operator.
 5. `i % 2 == 0` checks whether `i` is a multiple of 2.
 6. `i % 3 == 0` checks whether `i` is a multiple of 3.
 7. I use `||` because the number only needs to satisfy either condition.
 8. If either condition is true, I print `i`.
 9. Approach: take N → check each number from 2 to N → test multiple of
    2 or 3 → print when the condition is true.
 10. Concepts used: Scanner, for loop, `%` modulus, `if` condition,
     logical OR (`||`), and System.out.print().
 */

package loops;

import java.util.Scanner;

public class MultiplesOf2And3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        for(int i = 2; i <= n; i++){
            if(i % 2 == 0 || i % 3 == 0){
                System.out.print(i + " ");
            }
        }
    }
}
