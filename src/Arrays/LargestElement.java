/*
 Notes:
 1. Problem: Find the largest element in an array.
 2. `size` stores the number of elements in the array.
 3. `ar` stores the input elements.
 4. The first `for` loop reads and stores every element.
 5. `largest = Integer.MIN_VALUE` gives the smallest possible int value initially.
 6. This is better than using `largest = 0` because the array may contain
    only negative numbers.
 7. Example 1: `-10 -5 -20` → largest = `-5`.
 8. If we started with `largest = 0`, the result would incorrectly remain 0.
 9. `for (int j : ar)` traverses every element of the array.
 10. `if (largest < j)` checks whether the current element is greater
     than the current largest value.
 11. If `j` is greater, `largest = j` updates the largest value.
 12. After checking all elements, `return largest` returns the largest value.
 13. Example 2: `10 25 7 40` → largest = `40`.
 14. `Integer.MIN_VALUE` is used because every possible int element is
     greater than or equal to it.
 15. Concepts used: array, enhanced for loop, comparison, variable update,
     `Integer.MIN_VALUE`, method, parameter, and return value.
 */

package Arrays;

import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] ar = new int[size];
        for(int i = 0; i < ar.length; i++){
            ar[i] = input.nextInt();
        }
        int largestElement = findLargestElement(ar);
        System.out.println(largestElement);
    }
    public static int findLargestElement(int[] ar){
        int largest = Integer.MIN_VALUE;
        for(int j : ar){
            if(largest < j){
                largest = j;
            }
        }
        return largest;
    }
}
