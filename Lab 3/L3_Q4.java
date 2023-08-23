package Lab_3;

import java.util.Scanner;

class Stack {
    int arr[];
    int tos;

    Stack() {
        tos = -1;
        arr = new int[10];
    }

    void push() {
        if (tos == arr.length - 1) {
            System.out.println("Stack Overflow");
        } else {
            @SuppressWarnings("resource")
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Data - ");
            int data = sc.nextInt();
            arr[++tos] = data;
            System.out.println("Saved");
        }
    }

    void pop() {
        System.out.println("Element - " + arr[tos--]);
    }

    void display() {
        System.out.println("Displaying Stack - ");
        for (int i = tos; i != -1; i--) {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Stack Operations\n1) Push an Element\n2) Pop an Element\n3) Display the Stack\n4) Quit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    s.push();
                    break;
                case 2:
                    s.pop();
                    break;
                case 3:
                    s.display();
                    break;
                case 4:
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        }
    }
}
