package Arrays;

import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] ar = new int[size];
        for(int i = 0; i < ar.length; i++){
            ar[i] = input.nextInt();
        }
        System.out.println(arraySumElements(ar));
    }
    public static long arraySumElements(int[] ar){
        long sum = 0;
        for(int i = 0; i < ar.length; i++){
            sum += ar[i];
        }
        return sum;
    }
}
