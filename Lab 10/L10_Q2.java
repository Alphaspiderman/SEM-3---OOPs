package Lab_10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class L10_Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create generic stack of size 5 for Employee objects
        GenStack<Employee> empStack = new GenStack<>(5);
        // Create generic stack of size 5 for Student objects
        GenStack<Student> stuStack = new GenStack<>(5);
        // Menu driven program
        System.out.println("1. Push Employee");
        System.out.println("2. Push Student");
        System.out.println("3. Pop Employee");
        System.out.println("4. Pop Student");
        System.out.println("5. Display Employee Stack");
        System.out.println("6. Display Student Stack");
        System.out.println("7. Exit");
        while (true) {
            System.out.println("Enter choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter Employee details: ");
                    System.out.println("Enter Name: ");
                    String name = sc.next();
                    System.out.println("Enter Employee ID: ");
                    int empId = sc.nextInt();
                    Employee emp = new Employee(name, empId);
                    empStack.push(emp);
                    break;
                case 2:
                    System.out.println("Enter Student details: ");
                    System.out.println("Enter Name: ");
                    name = sc.next();
                    System.out.println("Enter Student ID: ");
                    int stuId = sc.nextInt();
                    Student stu = new Student(name, stuId);
                    stuStack.push(stu);
                    break;
                case 3:
                    emp = empStack.pop();
                    if (emp != null) {
                        System.out.println("Popped Employee: ");
                        emp.display();
                    }
                    break;
                case 4:
                    stu = stuStack.pop();
                    if (stu != null) {
                        System.out.println("Popped Student: ");
                        stu.display();
                    }
                    break;
                case 5:
                    System.out.println("Employee Stack: ");
                    empStack.display();
                    break;
                case 6:
                    System.out.println("Student Stack: ");
                    stuStack.display();
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}

class Student {
    public String name;
    public int studentId;

    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Student ID: " + studentId);
    }

}

class Employee {
    public String name;
    public int employeeId;

    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
    }

}

class GenStack<T> {
    int top;
    List<T> arr;
    int size;

    GenStack(int n) {
        top = -1;
        size = n;
        arr = new ArrayList<>(n);
    }

    void push(T data) {
        if (top == size - 1) {
            System.out.println("Stack Overflow");
        } else {
            arr.add(data);
            top++;
        }
    }

    T pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return null;
        } else {
            T data = arr.get(top);
            arr.remove(top);
            top--;
            return data;
        }
    }

    void display() {
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {
            for (int i = top; i >= 0; i--) {
                System.out.println(arr.get(i).display());
            }
        }
    }
}