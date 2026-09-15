/*
 Notes:
 1. Problem: Find the sum of absolute values of all elements in an array.
 2. `size` stores the number of elements in the array.
 3. `ar` stores the input elements.
 4. The first `for` loop reads and stores every element.
 5. `long sum = 0` stores the total sum.
 6. `for (int j : ar)` traverses every element of the array.
 7. `if (j < 0)` checks whether the current element is negative.
 8. For a negative value, `-j` converts it to its positive/absolute value.
 9. For a positive value or 0, `j` is added directly.
 10. `sum += ...` keeps adding each element's absolute value.
 11. `return sum` returns the final absolute sum.
 12. `long` is used for `sum` because the total can become larger than int.
 13. Example 1: `-5 3 -2` → 5 + 3 + 2 = `10`.
 14. Example 2: `-10 -20 5` → 10 + 20 + 5 = `35`.
 15. Concepts used: array, enhanced for loop, if-else, negative numbers,
     absolute value, accumulator variable, method, parameter, and return.
 */

package Arrays;

import java.util.Scanner;

public class AbsoluteSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] ar = new int[size];
        for(int i = 0; i < ar.length; i++){
            ar[i] = input.nextInt();
        }
        System.out.println(absolutSum(ar));
    }
    public static long absolutSum(int[] ar){
        long sum = 0;
        for (int j : ar) {
            if (j < 0) {
                sum += (-j);
            } else {
                sum += j;
            }
        }
        return sum;
    }
}
