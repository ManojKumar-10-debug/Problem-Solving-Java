/*
 Notes:
 1. Problem: Find the smallest element in an array.
 2. `size` stores the number of elements in the array.
 3. `arr` stores the input elements.
 4. The first `for` loop reads and stores every array element.
 5. `smallest = arr[0]` assumes the first element is the smallest initially.
 6. `for (int j : arr)` traverses every element in the array.
 7. `if (smallest > j)` checks whether the current element `j`
    is smaller than the current `smallest`.
 8. If `j` is smaller, `smallest = j` updates the smallest value.
 9. After checking all elements, `return smallest` returns the smallest value.
 10. Example 1: `8 3 10 2 6` → smallest = `2`.
 11. Example 2: `15 7 20 4` → smallest = `4`.
 12. `arr[0]` is used as the initial value instead of assuming
     a fixed value like `0` or `Integer.MAX_VALUE`.
 13. Concepts used: array, method, parameter, enhanced for loop,
     comparison, variable update, and return value.
 */

package Arrays;

import java.util.Scanner;

public class SmallestElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < arr.length; i++){
            arr[i] = input.nextInt();
        }
        System.out.println(smallestElement(arr));
    }
    public static int smallestElement(int[] arr){
        int smallest = arr[0];
        for(int j : arr){
            if(smallest > j){
                smallest = j;
            }
        }
        return smallest;
    }
}
