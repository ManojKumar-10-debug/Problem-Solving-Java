/*
 Notes:
 1. Problem: Print all prime numbers from 2 to n.
 2. `isPrime(int n)` checks whether each number is prime.
 3. `isPrime()` returns `true` if the number is prime, otherwise `false`.
 4. `n <= 1` → not prime, so return `false`.
 5. The loop checks possible divisors starting from 2.
 6. `n % i == 0` means `i` divides n exactly, so n is not prime.
 7. `return false` immediately stops checking when a divisor is found.
 8. `return true` means no divisor was found, so n is prime.
 9. In `main`, the loop checks every number from 2 to the given `n`.
 10. `isPrime(i)` is called for every number, and prime numbers are printed.

 11. Why `i * i <= n`?
     - A factor of n always has a matching factor.
     - If n has a factor greater than √n, its matching factor must be
       smaller than √n.
     - Therefore, if no divisor is found up to √n, we don't need to check
       the remaining numbers.

 12. Why not `i <= n / 2`?
     - It works, but it checks more numbers than necessary.
     - Example: for n = 100, `n / 2` requires checking up to 50,
       while `i * i <= n` only checks up to 10.

 13. Why not `i <= n`?
     - It also works, but it is wasteful because n itself is always
       divisible by n.
     - We only need to find a divisor other than 1 and n.

 14. `i * i <= n` is preferred because it reduces the number of
     iterations and makes the prime-checking algorithm more efficient.

 15. Example 1: n = 100 → √100 = 10 → check only 2 to 10.
 16. Example 2: n = 97 → √97 is about 9.8 → check only 2 to 9;
     no divisor → 97 is prime.

 17. Concepts used: method, boolean, return, for loop, `%` modulus,
     divisor, square root logic, and method calling.
 */

package loops;

import java.util.Scanner;

public class PrintPrimeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i = 2; i <= n; i++){
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
