/*
 Notes:
 1. Problem: Check whether a given number is prime or not.
 2. `isPrime(int n)` is a method that returns a boolean value.
 3. A prime number has exactly two factors: 1 and itself.
 4. `n <= 1` → not prime, so the method returns `false`.
 5. The loop starts from `i = 2` and checks while `i * i <= n`.
 6. `n % i == 0` means `n` is exactly divisible by `i`, so it is not prime.
 7. If a divisor is found, `return false` immediately.
 8. If no divisor is found, `return true` because the number is prime.
 9. `isPrime(n)` is called inside `if` to decide whether to print "Yes" or "No".
 10. `boolean` is used because the method only needs to return `true` or `false`.
 11. `i * i <= n` reduces unnecessary checking instead of checking up to `n`.
 12. Example 1: 7 → no divisor from 2 to √7 → `true` → prime.
 13. Example 2: 12 → divisible by 2 → `false` → not prime.
 14. Concepts used: method, boolean return type, parameter, if-else,
     for loop, `%` modulus, `return`, and method calling.
 */

package loops;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        if(isPrime(n)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
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
