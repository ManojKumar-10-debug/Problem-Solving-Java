package loops;

import java.util.Scanner;

public class FirstNMultiplesOf3And5And7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int count = 0;
        for(int i = 3; count < n; i++){
            if(i % 3 == 0 || i % 5 == 0 || i % 7 == 0){
                System.out.print(i + " ");
                count++;
            }
        }
    }
}
