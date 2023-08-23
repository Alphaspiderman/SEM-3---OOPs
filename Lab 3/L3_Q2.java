package Lab_3;

import java.util.Scanner;

class Employee {

    String Ename;
    int Eid;
    double Basic, DA, Gross_Sal, Net_Sal;

    Employee(String Ename, int Eid, double Basic) {
        this.Ename = Ename;
        this.Eid = Eid;
        this.Basic = Basic;
        this.DA = 0.52 * Basic;
        this.Gross_Sal = Basic + DA;
    }

    public static Employee[] read() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Employees to process - ");
        int n = sc.nextInt();
        Employee[] arr = new Employee[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter Name - ");
            //sc.nextLine();
            String Ename = sc.next();
            System.out.println("Enter Employee ID - ");
            int Eid = sc.nextInt();
            System.out.println("Enter Basic Salary - ");
            double Basic = sc.nextDouble();
            Employee obj = new Employee(Ename, Eid, Basic);
            arr[i] = obj;
        }
        sc.close();
        return arr;
    }

    public static void main(String[] args) {
        Employee[] arr = read();

        for (Employee employee : arr) {
            employee.compute_net_sal();
            employee.display();
        }
    }

    void display() {
        System.out.println("Name of Employee - " + Ename);
        System.out.println("ID of Employee - " + Eid);
        System.out.println("Basic Salary of Employee - " + Basic);
        System.out.println("DA of Employee - " + DA);
        System.out.println("Gross Salary of Employee - " + Gross_Sal);
        System.out.println("Net Salary of Employee - " + Net_Sal);
    }

    void compute_net_sal() {
        this.Net_Sal = (1 - 0.3) * Gross_Sal;
        System.out.println("Calculated Net Salary of Employee " + Eid);
    }
}
