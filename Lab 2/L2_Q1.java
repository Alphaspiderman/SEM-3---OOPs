package Lab_2;

import java.util.Scanner;

public class L2_Q1 {
    public static void main(String[] args) {
        int length, i;
        
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter desired length of List - ");
        length = sc.nextInt();

        int[] arr = new int[length];

        for(i = 0; i<length; i++){
            System.out.println("Enter Value - ");
            arr[i] = sc.nextInt();
        }

        sc.close();

        System.out.println("Saved List\nReversing");

        for(i = 0; i<length/2; i++){
            int temp = arr[i];
            arr[i] = arr[length-i-1];
            arr[length-i-1] = temp;
        }

        System.out.print("Printing Reversed list -");

        for(i=0;i<length;i++){
            System.out.print(" "+ arr[i]);
        }
    }
}
