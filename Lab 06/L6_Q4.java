package Lab_6;

import java.util.Scanner;

public class L6_Q4 {

	public static void main(String[] args) {
		
		System.out.println("Setting up a School");
		School school =  new School();		
		school.set_grade();
		school.set_qty_classrooms();
		
		System.out.println("\n\nSetting up a House");
		House house = new House();
		house.set_qty_bathroom();
		house.set_qty_bedroom();
		
		System.out.println("\n\nDisplaying Details of School");
		
		school.display();
		school.get_grade();
		school.get_qty_classrooms();
		
		System.out.println("\n\nDisplaying Details of House");
		
		house.display();
		house.get_qty_bathroom();
		house.get_qty_bedroom();
	}

}

class Building{
	double area;
	int floors;
	static Scanner sc = new Scanner(System.in);
	
	public Building() {
		System.out.println("Enter Area - ");
		area = sc.nextDouble();
		System.out.println("Enter Number of Floors / Stories - ");
		floors = sc.nextInt();
	}
	
	void display() {
		System.out.println("Area - "+area);
		System.out.println("Floors - "+floors);
	}
}

class House extends Building{
	int qty_bedroom;
	int qty_bathroom;
	
	void get_qty_bedroom() {
		System.out.println("Number of Bedrooms - "+ qty_bedroom);
	}
	
	void get_qty_bathroom() {
		System.out.println("Number of Bathrooms - "+ qty_bathroom);
	}
	
	void set_qty_bedroom() {
		System.out.println("Enter Number of Bedrooms - ");
		qty_bedroom = sc.nextInt();
	}
	
	void set_qty_bathroom() {
		System.out.println("Enter Number of Bathrooms - ");
		qty_bathroom = sc.nextInt();
	}
	
}

class School extends Building{
	int qty_classrooms;
	String grade;
	
	void get_qty_classrooms() {
		System.out.println("Number of classrooms - "+ qty_classrooms);
	}
	
	void get_grade() {
		System.out.println("Grade - "+ grade);
	}
	
	void set_qty_classrooms() {
		System.out.println("Enter Number of classrooms - ");
		qty_classrooms = sc.nextInt();
	}
	
	void set_grade() {
		System.out.println("Enter Grade - ");
		grade = sc.next();
	}
}