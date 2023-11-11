package Lab_2;

import java.util.Scanner;

public class L2_Q2 {
    public static void main(String[] args){
        int length, i;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter desired length of List - ");
        length = sc.nextInt();

        sc.close();

        int[] arr = new int[length];
        
        for(i=0; i<length;i++){
            arr[i] = i+1;
        }

        System.out.print("Values in list -");

        for(int var : arr){
            System.out.print(" " + var);
        }
    }
}
