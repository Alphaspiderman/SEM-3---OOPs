package Lab_2;

import java.util.Scanner;

public class L2_Q3 {
    public static void main(String[] args) {
        int length, i;

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter desired length of List - ");
        length = sc.nextInt();

        int[] arr = new int[length];

        for (i = 0; i < length; i++) {
            System.out.print("Number[" + i + "] - ");
            arr[i] = sc.nextInt();
        }

        sc.close();

        System.out.println("Saved List");
        System.out.println("Printing Prime Numbers");
        for (i = 0; i < arr.length; i++) {
            int flag = 1;
            for (int j = 2; j < arr[i]; j++) {
                if (arr[i] % j == 0) {
                    flag = 0;
                }
            }
            if (flag == 1) {
                System.out.println(arr[i]);
            }
        }
    }
}
