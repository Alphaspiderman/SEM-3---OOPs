package Lab_8;

import java.util.Scanner;

class Student {
    int regNo;
    int yearOfJoin;
    String name;
    static int number = 0;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter number of students to create: ");
        int n = sc.nextInt();
        Student[] stu = new Student[n];
        int i;
        for (i = 0; i < n; i++) {
            try {
                stu[i] = new Student();
            } catch (SeatsFilledException e) {
                System.out.println("Seats filled");
                break;
            }
        }
        for (int j = 0; j < i; j++) {
            stu[i].display();
        }
    }

    public Student() throws SeatsFilledException {
        if (number >= 25) {
            throw new SeatsFilledException();
        }
        sc.nextLine();
        System.out.println("Enter name - ");
        this.name = sc.nextLine();
        System.out.println("Enter year - ");
        this.yearOfJoin = sc.nextInt();
        this.regNo = ((this.yearOfJoin % 100) * 100) + number;
        number = number + 10;

    }

    void display() {
		System.out.println("\nRegistration Number: " + regNo);
		System.out.println("Name: " + name);
		System.out.println("Year: " + yearOfJoin);
	}
}

class SeatsFilledException extends Exception {}
