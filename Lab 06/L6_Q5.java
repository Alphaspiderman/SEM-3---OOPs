package Lab_6;

import java.util.Scanner;

public class L6_Q5 {

	public static void main(String[] args) {
		Figure ref;
		
		System.out.println("Working on Rectange");
		Rectangle r = new Rectangle();
		ref = r;
		ref.calc_area();
		
		System.out.println("Working on a Triangle");
		Triangle t = new Triangle();
		ref = t;
		ref.calc_area();
		
		System.out.println("Working on a Square");		
		Square s = new Square();
		ref = s;
		ref.calc_area();
	}
}

abstract class Figure{
	double dim1;
	double dim2;
	double area; 
	static Scanner sc = new Scanner(System.in);
	abstract void calc_area();
	
	public Figure() {	
		System.out.println("Enter Dimension 1 - ");
		dim1 = sc.nextDouble();
		System.out.println("Enter Dimension 2 - ");
		dim2 = sc.nextDouble();
	}
}

class Rectangle extends Figure{
	void calc_area() {
		area = dim1*dim2;
		System.out.println("Area of Rectangle - "+area);
	}
}

class Triangle extends Figure{
	void calc_area() {
		area = 0.5*dim1*dim2;
		System.out.println("Area of Triangle - "+area);
	}
}

class Square extends Figure{
	void calc_area() {
		if (dim1 == dim2) {
			area = dim1*dim2;
			System.out.println("Area of Square - "+area);
		}
		else {
			System.out.println("Dimensions are not of a Square!!!!");
		}
	}
}

