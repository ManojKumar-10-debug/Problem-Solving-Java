/*
 Notes:
 1. Problem: Print all prime numbers between n1 and n2.
 2. `n1` is the starting number and `n2` is the ending number.
 3. The `for` loop checks every number from `n1` to `n2`.
 4. `isPrime(i)` checks whether the current number is prime.
 5. If `isPrime(i)` returns `true`, the current number is printed.

 6. `isPrime(int n)` returns a boolean value: `true` for prime and
    `false` for non-prime.
 7. `n <= 1` → not prime, so return `false`.
 8. The divisor-checking loop starts from 2.
 9. `i * i <= n` means we check only up to √n.
 10. We use `i * i` instead of `n / 2` because checking up to √n
     requires fewer iterations and is more efficient.
 11. Example 1: n = 100 → √100 = 10, so check only up to 10.
 12. Example 2: n = 97 → √97 ≈ 9.8, so checking up to 9 is enough.

 13. `n % i == 0` means n is exactly divisible by i, so n is not prime.
 14. When a divisor is found, `return false` immediately stops the method.
 15. If no divisor is found, `return true`.

 16. Approach:
     Take n1 and n2 → loop from n1 to n2 → check each number with
     `isPrime()` → print only the numbers for which it returns `true`.

 17. Example 1: n1 = 10, n2 = 20 → 11 13 17 19.
 18. Example 2: n1 = 2, n2 = 10 → 2 3 5 7.

 19. Concepts used: Scanner, method, parameter, boolean return type,
     for loop, nested if, `%` modulus, `return`, and method calling.
 */

package loops;

import java.util.Scanner;

public class PrintPrimeNumbersN1ToN2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        for(int i = n1; i <= n2; i++){
            if(isPrime(i)){
                System.out.println(i + " ");
            }
        }
    }
    public static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        for(int i = 2; i * i <= n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
