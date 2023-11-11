package Lab_5;

import java.util.Scanner;

class Employee {

    String ename;
    int eid;
    double basic, da, gross_sal, net_sal;
    String email;
    static Scanner sc = new Scanner(System.in);

    Employee() {
        System.out.println("Enter Name - ");
        ename = sc.nextLine();
        System.out.println("Enter ID - ");
        eid = sc.nextInt();
        System.out.println("Enter base salary - ");
        basic = sc.nextDouble();
        this.da = 0.52 * basic;
        this.gross_sal = basic + da;
        net_sal = (1 - 0.3) * gross_sal;
        System.out.println("Saved Information of Employee");
    }

    void formatEmployeeName() {

        char a[] = ename.toCharArray();
        a[0] = Character.toUpperCase(a[0]);
        for (int i = 0; i < a.length; i++) {

            if (a[i] == ' ') {
                a[i + 1] = Character.toUpperCase(a[i + 1]);
            }
        }
        ename = String.valueOf(a);
    }

    void generateEmail() {

        int index = (ename.indexOf(" ")) + 1;
        String s1 = ename.substring(0, 1);
        String s2 = ename.substring(index);
        String s3 = s1 + s2;
        s3 = s3.toLowerCase().replaceAll("\\s", "");
        email = s3 + "@example.com";
        // System.out.println("Email ID is - " + email);
    }

    void display() {
        System.out.println("\n\nName - " + ename);
        System.out.println("ID - " + eid);
        System.out.println("Email ID - " + email);
        System.out.println("Basic Salary - " + basic);
        System.out.println("DA - " + da);
        System.out.println("Gross Salary - " + gross_sal);
        System.out.println("Net Salary - " + net_sal);

    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.formatEmployeeName();
        emp.generateEmail();
        emp.display();
    }
}