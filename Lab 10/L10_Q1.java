package Lab_10;

import java.util.Scanner;

public class L10_Q1 {
    public static <T> void exchange(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length of Array - ");
        int n = sc.nextInt();
        Integer[] arr = new Integer[n];
        System.out.println("Enter elements - ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Before exchange - ");
        for (Integer i : arr) {
            System.out.print(i + " ");
        }
        // Take input for elements to swap
        System.out.println("\nEnter Indexes to swap - ");
        int i = sc.nextInt();
        int j = sc.nextInt();
        exchange(arr, i, j);
        System.out.println("After exchange - ");
        for (Integer k : arr) {
            System.out.print(k + " ");
        }
        System.out.println();
    }
}
