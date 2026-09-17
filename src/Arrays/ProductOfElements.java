/*
 Notes:
 1. Problem: Find the product of all elements in an array.
 2. `size` stores the number of elements in the array.
 3. `ar` stores the input elements.
 4. The first `for` loop reads and stores every element.
 5. `long product = 1` initializes the product to 1.
 6. We use 1 instead of 0 because multiplying anything by 0 gives 0.
 7. `for (int j : ar)` traverses every element of the array.
 8. `product *= j` multiplies the current product by each element.
 9. `return product` returns the final product.
 10. Example 1: `2 3 4` → 2 × 3 × 4 = `24`.
 11. Example 2: `5 2 3` → 5 × 2 × 3 = `30`.
 12. `long` is used because the product can become very large.
 13. Important: If any array element is `0`, the final product becomes `0`.
 14. Concepts used: array, method, parameter, enhanced for loop,
     accumulator variable, multiplication, `*=`, and return value.
 */

package Arrays;

import java.util.Scanner;

public class ProductOfElements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] ar = new int[size];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = input.nextInt();
        }
        System.out.println(product(ar));
    }
    public static long product(int[] ar){
        long product = 1;
        for(int j : ar){
            product *= j;
        }
        return product;
    }
}
