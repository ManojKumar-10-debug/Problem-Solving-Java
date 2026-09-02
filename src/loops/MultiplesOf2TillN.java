package loops;

import java.util.Scanner;

public class MultiplesOf2TillN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        for(int i = 2; i <= n; i = i + 2){
            System.out.print(i + " ");
        }
    }
}
