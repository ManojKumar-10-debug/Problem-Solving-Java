/*
  1. Take three numbers and print the sum of every combination of two numbers.
  2. Store the inputs in m, n, and k.
  3. Add m+n, m+k, and n+k.
  4. Print each sum separately.

  Concept: Variables, arithmetic operators.
 */


package DataTypes;

import java.util.Scanner;

public class SumCombinations {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            int m = input.nextInt();
            int n = input.nextInt();
            int k = input.nextInt();

            System.out.println(m + n);
            System.out.println(m + k);
            System.out.println(n + k);

    }
}
