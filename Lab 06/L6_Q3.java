package Lab_6;

import java.util.Scanner;

public class L6_Q3 {

	public static void main(String[] args) {
		Person p1 = new Person();
		College p2 = new College();
		
		p1.display();
		p2.display();

	}

}

class Person{
	String name;
	String dateOfBirth;
	static Scanner sc = new Scanner(System.in);
	
	Person(){
		System.out.println("Enter Name - ");
		name = sc.nextLine();
		System.out.println("Enter Date of Birth - ");
		dateOfBirth = sc.nextLine();
	}
	
	void display() {
		System.out.println("\n\nName - "+name);
		System.out.println("Date of Birth - "+dateOfBirth);
	}
}

class College extends Person{
	private double gpa;
	private int yearOfPassing;
	
	College(){
		System.out.println("Enter GPA - ");
		gpa = sc.nextDouble();
		System.out.println("Enter Year of Passing - ");
		yearOfPassing = sc.nextInt();
	}
	
	void display() {
		super.display();
		System.out.println("GPA - "+gpa);
		System.out.println("Year of Passing - "+yearOfPassing);
	}
}