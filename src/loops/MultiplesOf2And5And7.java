package loops;

import java.util.Scanner;

public class MultiplesOf2And5And7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        for(int i = 2; i <= n; i++){
            if(i % 2 == 0 || i % 5 == 0 || i % 7 == 0)
                System.out.print(i + " ");
        }
    }
}
