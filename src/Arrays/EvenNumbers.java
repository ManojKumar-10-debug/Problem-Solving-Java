/*
 Notes:
 1. Problem: Print all even numbers present in the array.
 2. `size` stores the number of elements in the array.
 3. `arr` creates an integer array of the given size.
 4. The first `for` loop takes input and stores each value in the array.
 5. `for (int j : arr)` traverses every element of the array.
 6. `j % 2 == 0` checks whether the current element is even.
 7. If the condition is true, the element is printed.
 8. `found = false` assumes initially that no even number exists.
 9. When an even number is found, `found = true`.
 10. `if (!found)` means "if an even number was NOT found".
 11. If no even number exists, `"None"` is printed.
 12. Example 1: `1 4 7 8 9` → `4 8`.
 13. Example 2: `1 3 5 7` → `None`.
 14. `boolean` is used because `found` needs only two states: true or false.
 15. Concepts used: array, enhanced for loop, condition, modulus `%`,
     boolean variable, negation `!`, and traversal.
 */

package Arrays;

import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++){
            arr[i] = input.nextInt();
        }
        boolean found = false;

        for (int j : arr) {
            if (j % 2 == 0) {
                System.out.print(j + " ");
                found = true;
            }
        }
        if(!found){
            System.out.println("None");
        }
    }
}
