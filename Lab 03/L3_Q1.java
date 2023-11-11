package Lab_3;

import java.util.Scanner;

class Student {
    String sname;
    int[] marks_array;
    int total;
    double avg;

    void assign() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name -");
        sname = sc.next();
        System.out.println("Enter Number of Subjects");
        int n = sc.nextInt();
        marks_array = new int[n];
        System.out.println("Enter marks obtained in the subjects - ");
        for (int i = 0; i < marks_array.length; i++) {
            marks_array[i] = sc.nextInt();
        }
        System.out.println("Saved Information\n\n");
        sc.close();
    }

    void display() {
        System.out.println("Name of Student - " + sname);
        System.out.println("Marks obtained in the subjects - ");
        for (int i = 0; i < marks_array.length; i++) {
            System.out.print(" "+marks_array[i]);
        }
        System.out.println("Total Marks - " + total);
        System.out.println("Average Marks - " + avg);
    }

    void compute() {
        int sum = 0;
        for (int i = 0; i < marks_array.length; i++) {
            sum += marks_array[i];
        }
        total = sum;
        avg = sum / marks_array.length;

        System.out.println("Calculated Total and Average Marks");
    }
    public static void main(String[] args) {
        Student stu = new Student();
        stu.assign();
        stu.compute();
        stu.display();
    }
}

