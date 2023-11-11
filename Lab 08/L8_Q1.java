package Lab_8;

import java.util.Scanner;

public class L8_Q1 {
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.println("Menu\n1) Push\n2) Pop\n3) Display\n4) Exit");
        while(true){
            System.out.println("\nEnter Choice - ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    try {
                        stack.push();
                    } catch (PushException e) {
                        System.out.println("Stack Overflow");
                    }
                    break;
                case 2:
                    try {
                        stack.pop();
                    } catch (PopException e) {
                        System.out.println("Stack Underflow");
                    }
                    break;
                case 3:
                    stack.display();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice!!");
                    break;
            }
        }
    }
}
class PopException extends Exception{
    public PopException(String message){
        super(message);
    }
}
class PushException extends Exception{
    public PushException(String message){
        super(message);
    }
}

class Stack{
    private int[] stack;
    private int top;
    private int size;
    static Scanner sc = new Scanner(System.in);
    public Stack(int size){
        this.size = size;
        stack = new int[size];
        top = -1;
    }
    public void push() throws PushException{
        if(top == size-1){
            throw new PushException("Stack is full");
        }
        System.out.println("Enter value - ");
        stack[++top] = sc.nextInt();
    }
    public void pop() throws PopException{
        if(top == -1){
            throw new PopException("Stack is empty");
        }
        System.out.println("Revmoed - "+ stack[top--]); 
    }
    public void display(){
        if(top == -1){
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Stack: ");
        for(int i=0; i<=top; i++){
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
}