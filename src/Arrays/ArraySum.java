/*
 Notes:
 1. Problem: Find the sum of all elements in an array.
 2. `size` stores the number of elements in the array.
 3. `ar` stores the input elements.
 4. The first `for` loop reads and stores every element in the array.
 5. `arraySumElements(ar)` sends the array to the method for calculating the sum.
 6. `long sum = 0` stores the total sum.
 7. `for (int j : ar)` traverses every element of the array.
 8. `sum += j` adds each element to the sum.
 9. `return sum` returns the final sum to `main()`.
 10. `System.out.println(...)` prints the returned sum.
 11. Example 1: `10 20 30` → sum = `60`.
 12. Example 2: `-5 10 15` → sum = `20`.
 13. `long` is used for the sum so the total can hold larger values
     than an `int`.
 14. Concepts used: array, method, parameter, enhanced for loop,
     accumulator variable, `+=`, and return value.
 */
package Arrays;

import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] ar = new int[size];
        for(int i = 0; i < ar.length; i++){
            ar[i] = input.nextInt();
        }
        System.out.println(arraySumElements(ar));
    }
    public static long arraySumElements(int[] ar){
        long sum = 0;
        for (int j : ar) {
            sum += j;
        }
        return sum;
    }
}
