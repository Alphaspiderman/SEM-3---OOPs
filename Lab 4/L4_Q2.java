package Lab_4;

import java.util.Scanner;

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
		System.out.println("Enter base salary - ");
		basic = sc.nextDouble();
		this.da = 0.52 * basic;
		this.gross_sal = basic + da;
		net_sal = (1 - 0.3) * gross_sal;
		System.out.println("Saved Information of Employee");	
	}
	
	Employee(String ename, int eid, double basic) {
		this.ename = ename;
		this.eid = eid;
		this.basic = basic;
		this.da = 0.52 * basic;
		this.gross_sal = basic + da;
		net_sal = (1 - 0.3) * gross_sal;
	}

	public static void main(String[] args) {
		
		System.out.println("Loading first Employee (Default Constructor)");
		Employee emp1 = new Employee();
		
		System.out.println("Saved first Employee");
		
		System.out.println("Loading second Employee (Parameterised Constructor)");
				
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name - ");
		String ename = sc.next();
		System.out.println("Enter ID - ");
		int eid = sc.nextInt();
		System.out.println("Enter base salary - ");
		double basic = sc.nextDouble();
		Employee emp2 = new Employee(ename, eid, basic);

		System.out.println("Saved second Employee");
		
		System.out.println("Displaying first employee");
		emp1.display();
		System.out.println("Displaying second employee");
		emp2.display();

	}
	
	void display() {
		System.out.println("Name - " + ename);
		System.out.println("ID - " + eid);
		System.out.println("Basic Salary - " + basic);
		System.out.println("DA - " + da);
		System.out.println("Gross Salary - " + gross_sal);
		System.out.println("Net Salary - " + net_sal);

		System.out.println("\n\n");
	}

}
