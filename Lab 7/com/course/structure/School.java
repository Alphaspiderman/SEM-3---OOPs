package com.course.structure;

public class School extends Building{
	int qty_classroom;
	String grade;

	public void get_qty_classroom() {
		System.out.println("Number of Classrooms - "+qty_classroom);
	}
	
	public void get_grade() {
		System.out.println("Grade - "+grade);
	}
	
	public void set_qty_classroom() {
		System.out.println("Enter Number of Classrooms - ");
		qty_classroom = sc.nextInt();
	}
	
	public void set_grade() {
		System.out.println("Enter grade - ");
		grade = sc.next();
	}
	
}
