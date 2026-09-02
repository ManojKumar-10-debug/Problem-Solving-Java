/*
 Notes:
 1. Problem: Print the first N numbers that are multiples of 3, 5, or 7.
 2. I take N as input and store it in `n`.
 3. I create `count` and initialize it to 0 to keep track of how many
    required numbers have been printed.
 4. I start `i` from 3 because 3 is the first possible multiple.
 5. I use `count < n` as the loop condition because I need exactly N
    matching numbers, not numbers only up to N.
 6. I check whether `i` is a multiple of 3, 5, or 7 using `%` and `||`.
 7. If any condition is true, I print `i`.
 8. After printing, I increase `count` by 1 because one required number
    has been found.
 9. `i++` checks the next number in every loop iteration.
 10. Approach: start from 3 → check every number → print if it is a
     multiple of 3, 5, or 7 → increase count → stop after N matches.
 11. Concepts used: Scanner, for loop, counter variable, `%` modulus,
     if condition, logical OR (`||`), and System.out.print().
 */

package loops;

import java.util.Scanner;

public class FirstNMultiplesOf3And5And7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int count = 0;
        for(int i = 3; count < n; i++){
            if(i % 3 == 0 || i % 5 == 0 || i % 7 == 0){
                System.out.print(i + " ");
                count++;
            }
        }
    }
}
