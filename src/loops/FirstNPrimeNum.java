/*
 Notes:
 1. Problem: Print the first N prime numbers.
 2. `count` keeps track of how many prime numbers have been printed.
 3. `count = 0` because initially no prime numbers are printed.
 4. The loop starts with `i = 2` because 2 is the first prime number.
 5. `count < n` makes the loop continue until N prime numbers are printed.
 6. `isPrime(i)` checks whether the current number is prime.
 7. If `isPrime(i)` returns true, the number is printed.
 8. After printing a prime number, `count++` increases the count by 1.
 9. `i++` checks the next number because prime numbers are not always consecutive.
 10. Example 1: N = 5 → 2 3 5 7 11.
 11. Example 2: N = 3 → 2 3 5.

 12. `isPrime(int n)` checks whether a number is prime.
 13. `n <= 1` → not prime, so return false.
 14. `i * i <= n` checks divisors only up to √n.
 15. We use `i * i` instead of `n / 2` because √n requires fewer checks.
 16. Example 1: n = 100 → √100 = 10 → check only up to 10.
 17. Example 2: n = 49 → √49 = 7 → check only up to 7.
 18. `n % i == 0` means n is exactly divisible by i, so n is not prime.
 19. If a divisor is found, `return false` immediately.
 20. If no divisor is found, `return true`.

 21. Important: Here the loop condition is `count < n`, not `i <= n`.
 22. `i` represents the numbers being checked, while `count` represents
     the number of prime numbers already printed.
 23. The loop can go beyond N because we need the first N prime numbers,
     not prime numbers only up to N.

 24. Concepts used: for loop, nested if, method calling, boolean,
     return, counter variable, `%` modulus, and `i * i <= n`.
 */

package loops;

import java.util.Scanner;

public class FirstNPrimeNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int count = 0;
        for(int i = 2; count < n; i++){
            if(isPrime(i)){
                System.out.println(i + " ");
                count++;
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
