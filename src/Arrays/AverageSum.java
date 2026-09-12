/*
 Notes:
 1. Problem: Find the average of all elements in an array.
 2. `n` stores the size of the array.
 3. `arr` stores the input elements.
 4. The first `for` loop reads and stores every array element.
 5. `arraySum(arr)` is called to calculate the total sum of the array.
 6. `arraySum()` uses `sum += arr[i]` to add every element.
 7. `return sum` sends the calculated sum back to `main()`.
 8. `double average` is used because the average can contain decimal values.
 9. `(double) sum` converts `sum` to double before division.
 10. This avoids integer division and preserves the decimal part.
 11. `sum / n` calculates the average.
 12. `printf("%.2f", average)` prints the average with exactly 2 decimal places.
 13. Example 1: `10 20 30` → sum = 60 → average = 20.00.
 14. Example 2: `10 20 25` → sum = 55 → average = 18.33.
 15. Concepts used: array, method, parameter, return value, for loop,
     sum, type casting, double, division, and printf formatting.
 */

package Arrays;

import java.util.Scanner;

public class AverageSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = input.nextInt();
        }
        int sum = arraySum(arr);
        double average = (double)sum / n;
        System.out.printf("%.2f", average);
    }
    public static int arraySum (int[] arr){
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        return sum;
    }
}
