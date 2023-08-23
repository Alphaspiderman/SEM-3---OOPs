package Lab_3;

import java.util.Scanner;

class Mixer {
    int arr[];

    void accept() {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Elements - ");
        int n = sc.nextInt();
        arr = new int[n];
        System.out.println("Enter Elements - ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
        
        System.out.println("Saved Data");
    }

    void display() {
        System.out.println("Displaying Elements - ");
        for (int i : arr) {
            System.out.println(i);
        }
    }

    Mixer mix(Mixer A) {
        int[] temparr = new int[this.arr.length + A.arr.length];
        int count = 0;
        for (int i : arr) {
            temparr[count++] = i;
        }
        for (int i : A.arr) {
            temparr[count++] = i;
        }

        for (int i = 0; i < temparr.length; i++) {
            for (int j = 1; j < temparr.length - i; j++) {
                if (temparr[j - 1] > temparr[j]) {
                    int temp = temparr[j];
                    temparr[j] = temparr[j - 1];
                    temparr[j - 1] = temp;
                }
            }
        }
        Mixer C = new Mixer();
        C.arr = temparr;

        System.out.println("Mixed Objects");

        return C;
    }
    public static void main(String[] args) {
        Mixer obj1 = new Mixer();
        Mixer obj2 = new Mixer();
        
        obj1.accept();
        obj2.accept();

        Mixer obj3 = obj1.mix(obj2);
        System.out.println("Displaying Mixed Object");
        obj3.display();

    }
}
