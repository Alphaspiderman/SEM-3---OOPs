package Lab_4;

import java.util.Scanner;

class Student {
	String sname;
	int[] marks_array;
	int total;
	double avg;
	
	Student(){
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name - ");
		sname = sc.next();
		System.out.println("Number of Subjects - ");
		int n = sc.nextInt();
		System.out.println("Enter Marks");
		marks_array = new int[n];
		for (int i = 0; i < n; i++) {
			marks_array[i] = sc.nextInt();
		}
		System.out.println("Saved Information \n");
	}
	
	Student(String sname, int[] marks){
		
		this.sname = sname;
		marks_array = marks;
	}

	public static void main(String[] args) {
		System.out.println("Loading Student 1 (Default Constructor)");
		Student stu = new Student();
		System.out.println("Saved Student 1");
		
		
		System.out.println("Loading Student 2 (Parameterised Constructor)");

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name - ");
		String sname = sc.next();
		System.out.println("Number of Subjects - ");
		int n = sc.nextInt();
		System.out.println("Enter Marks");
		int[] marks_array = new int[n];
		for (int i = 0; i < n; i++) {
			marks_array[i] = sc.nextInt();
		}
		
		Student stu2 = new Student(sname, marks_array);
		
		
		System.out.println("Saved Student 2\n\n");
		
		
		stu.compute();
		stu.display();
		System.out.println("\n\n");
		
		
		stu2.compute();
		stu2.display();
		
	}
	
	void display() {
		System.out.println("Name - " + sname);
		System.out.println("Marks Obtained - ");
		for (int i = 0; i < marks_array.length; i++) {
			System.out.print(" " + marks_array[i]);
		}
		System.out.println("\nTotal Marks - " + total);
		System.out.println("Average Marks - " + avg);

	}
	
	void compute() {
		int sum = 0;
		for (int i : marks_array) {
			sum += i;
		}
		total = sum;
		avg = sum / marks_array.length;
	}

}
