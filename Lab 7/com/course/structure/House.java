package com.course.structure;

public class House extends Building {
	int qty_bedrooms, qty_bathrooms;

	public void get_qty_bathroom() {
		System.out.println("Number of Bathrooms - "+qty_bathrooms);
	}
	
	public void get_qty_bedroom() {
		System.out.println("Number of Bedrooms - "+qty_bedrooms);
	}
	
	public void set_qty_bathroom() {
		System.out.println("Enter Number of Bathrooms - ");
		qty_bathrooms = sc.nextInt();
	}
	
	public void set_qty_bedroom() {
		System.out.println("Enter Number of Bedrooms - ");
		qty_bedrooms = sc.nextInt();
	}
}
