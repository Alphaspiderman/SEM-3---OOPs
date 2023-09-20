package Lab_6;

import java.util.Scanner;

public class L6_Q1 {

	public static void main(String[] args) {
		Student s1 = new Student();

		ArtsStudent s2 = new ArtsStudent();
		
		ScienceStudent s3 = new ScienceStudent();
		
		s1.compute();
		s2.compute();
		s3.compute();
		
		s1.display();
		s2.display();
		s3.display();
		s3.displayPracticalMarks();
	}
}

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
	
	void display() {
		System.out.println("\n\nName - " + sname);
		System.out.println("Total Marks - " + total);
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

class ScienceStudent extends Student{
	private int practicalMarks;
	
	ScienceStudent(){
		super();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Practical Marks - ");
		practicalMarks = sc.nextInt();
		
	}
	
	void displayPracticalMarks() {
		System.out.println("Practical Marks - " + practicalMarks);
	}
	
	
	void compute() {
		super.compute();
		total = total + practicalMarks;
		avg = total / marks_array.length + 1;
	}
}

class ArtsStudent extends Student{
	private String electiveSubject;
	
	ArtsStudent(){
		super();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Elective Subject - ");
		electiveSubject = sc.nextLine();
		
	}
	
	void display() {
		super.display();
		System.out.println("Elective Subject - " + electiveSubject);

	}
}