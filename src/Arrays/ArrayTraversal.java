/*
 Notes:
 1. Problem: Read an array and print all its elements.
 2. `size` stores the number of elements in the array.
 3. `int[] arr = new int[size]` creates an integer array of that size.
 4. The first `for` loop is used to take input for every array element.
 5. `arr[i] = input.nextInt()` stores each input value at index `i`.
 6. `arr.length` gives the total number of elements in the array.
 7. The second `for` loop uses enhanced for loop to traverse the array.
 8. `for (int j : arr)` means take each element from `arr` one by one
    and store it in `j`.
 9. `System.out.print(j + " ")` prints each array element with a space.
 10. Example 1: Input → 5 10 20 30 40 50 → Output → 10 20 30 40 50.
 11. Example 2: Input → 3 7 4 9 → Output → 7 4 9.
 12. Concepts used: array, Scanner, array indexing, `arr.length`,
     for loop, enhanced for loop, input, and traversal.
 */

package Arrays;

import java.util.Scanner;

public class ArrayTraversal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++){
            arr[i] = input.nextInt();
        }
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
