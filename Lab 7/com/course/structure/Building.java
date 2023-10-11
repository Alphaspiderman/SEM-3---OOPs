package com.course.structure;

import java.util.Scanner;

public class Building {
	int floors;
	double area;
	static Scanner sc = new Scanner(System.in);
	
	public Building(){
		System.out.println("Enter Number of Floors");
		floors = sc.nextInt();
		System.out.println("Enter Area - ");
		area = sc.nextDouble();
	}
	
	public void display() {
		System.out.println("Area - "+area);
		System.out.println("Number of Floors - "+floors);
	}
}
