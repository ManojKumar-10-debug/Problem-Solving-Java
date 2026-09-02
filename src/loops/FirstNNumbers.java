/*
 * Notes:
 * 1. Problem: Print the first N natural numbers, excluding 0.
 * 2. I take N as input and store it in `num`.
 * 3. I created a separate method `printFirstNNumbers()` to handle the
 *    printing logic and pass `num` to it.
 * 4. Inside the method, I use a `for` loop because the number of repetitions
 *    is already known from 1 to `num`.
 * 5. I initialize `i = 1` because natural numbers start from 1 and 0 is excluded.
 * 6. `i <= num` keeps the loop running until N is reached.
 * 7. `i++` increases `i` by 1 after every iteration.
 * 8. Each iteration prints the current value of `i`.
 * 9. I use `i + " "` so the numbers are printed with spaces.
 * 10. Approach: start from 1 → repeat until N → print each number.
 * 11. Concepts used: for loop, initialization, condition, increment,
 *     method creation, and method calling.
 */
// print First N natural numbers excluding 0

package loops;

import java.util.Scanner;

public class FirstNNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        printFirstNNumbers(num);
    }
    public static void printFirstNNumbers(int num){
        for(int i = 1; i <= num; i++){
            System.out.print(i + " ");
        }
    }
}
