package Lab_6;

import java.util.Scanner;

public class L6_Q2 {

	public static void main(String[] args) {
		FullTimeEmp emp1 = new FullTimeEmp();
		PartTimeEmp emp2 = new PartTimeEmp();
		
		emp1.compute();
		emp2.compute();
		
		emp1.display();
		emp2.display();
	}

}

class Employee {
	String ename;
	int eid;
	double basic, da, gross_sal, net_sal;
	
	Employee(){
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name - ");
		ename = sc.next();
		System.out.println("Enter ID - ");
		eid = sc.nextInt();
	}
	
	void compute() {
		this.da = 0.52 * basic;
		this.gross_sal = basic + da;
		net_sal = (1 - 0.3) * gross_sal;
	}
	
	void display() {
		System.out.println("Name - " + ename);
		System.out.println("ID - " + eid);
	}
}

class FullTimeEmp extends Employee{
	double bonus;
	double deductions;
	
	FullTimeEmp(){
		super();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Base salary - ");
		basic = sc.nextDouble();	
		System.out.println("Enter Bonus salary - ");
		bonus = sc.nextDouble();	
		System.out.println("Enter Deductions salary - ");
		deductions = sc.nextDouble();	
	}
	
	void compute() {
		this.da = 0.52 * basic;
		this.gross_sal = basic + da;
		net_sal = (1 - 0.3) * (gross_sal - deductions + bonus);
	}
	
	void display() {
		System.out.println("\n\n");
		super.display();
		System.out.println("Base Salary - " + basic);
		System.out.println("DA - " + da);
		System.out.println("Bonus - " + bonus);
		System.out.println("Gross Salary - " + gross_sal);
		System.out.println("Deductions - " + deductions);
		System.out.println("Net Salary - " + net_sal);
	}
}

class PartTimeEmp extends Employee{
	int hoursWorked;
	final static double hourlyRate = 2500.00;
	
	PartTimeEmp(){
		super();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Hours Worked - ");
		hoursWorked = sc.nextInt();	
	}
	
	void compute() {
		this.gross_sal = hoursWorked * hourlyRate;
		net_sal = (1 - 0.3) * gross_sal;
	}
	
	void display() {
		System.out.println("\n\n");
		super.display();
		System.out.println("Hours Worked - " + hoursWorked);
		System.out.println("Gross Salary - " + gross_sal);
		System.out.println("Net Salary - " + net_sal);
	}
}