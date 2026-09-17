/*
 Notes:
 1. Problem: Print elements present at even and odd indexes separately.
 2. Array indexes start from 0, not 1.
 3. `printEvenIndexedElements()` prints elements at indexes 0, 2, 4, ...
 4. We start `i = 0` because 0 is the first/even index.
 5. `i += 2` skips directly to the next even index.
 6. `printOddIndexedElements()` prints elements at indexes 1, 3, 5, ...
 7. We start `i = 1` because 1 is the first/odd index.
 8. `i += 2` skips directly to the next odd index.
 9. We use `i < ar.length` to stay within the array boundaries.
 10. Example 1: Array = `1 2 3 4 5`
     Index =   0 1 2 3 4
     Even indexes → `1 3 5`
     Odd indexes  → `2 4`
 11. Example 2: Array = `10 20 30 40`
     Even indexes → `10 30`
     Odd indexes  → `20 40`
 12. Important: "Even indexed" means the INDEX is even,
     not that the ELEMENT is even.
 13. Example: At index 0, element `7` is printed even though 7 is odd.
 14. Concepts used: array, index, array.length, for loop,
     `i += 2`, methods, parameters, and array traversal.
 */

package Arrays;

import java.util.Scanner;

public class EvenOddIndexed {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] ar = new int[size];
        for(int i = 0; i < ar.length; i++){
            ar[i] = input.nextInt();
        }
        System.out.println("Even Indexed Elements : ");
        printEvenIndexedElements(ar);
        System.out.println();
        System.out.println("Odd Indexed Elements : ");
        printOddIndexedElements(ar);

    }
    public static void printEvenIndexedElements(int[] ar){
        for (int i = 0; i < ar.length; i += 2) {
            System.out.print(ar[i] + " ");
        }
    }
    public static void printOddIndexedElements(int[] ar){
        for (int i = 1; i < ar.length; i += 2) {
            System.out.print(ar[i] + " ");
        }
    }
}
