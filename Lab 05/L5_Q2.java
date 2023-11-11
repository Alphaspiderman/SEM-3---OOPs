package Lab_5;

import java.util.Scanner;

class Student {
    String sname;
    int[] marks_array;
    int total;
    double avg;

    Student() {

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Name - ");
        sname = sc.nextLine();

        System.out.println("Number of Subjects - ");
        int n = sc.nextInt();

        System.out.println("Enter Marks");
        marks_array = new int[n];

        total = 0;
        for (int i = 0; i < n; i++) {
            int mark = sc.nextInt();
            marks_array[i] = mark;
            total += mark;
        }

        avg = total / n;

        System.out.println("Saved Information \n");
    }

    void display() {
        System.out.println("Name - " + sname);
        System.out.println("Marks Obtained - ");
        for (int i = 0; i < marks_array.length; i++) {
            System.out.print(" " + marks_array[i]);
        }
        System.out.println("\nTotal Marks - " + total);
        System.out.println("Average Marks - " + avg);

    }

    void extractInitials() {
        char[] name_arr = sname.toCharArray();
        String initals = "";
        for (char i : name_arr) {
            if (Character.isUpperCase(i)) {
                initals += i;
            }
        }
        System.out.println("Initals - "+ initals);
    }

    void removeWhitespace() {
        String[] temp = sname.split(" ");
        String no_ws = "";
        for (String i : temp) {
            no_ws += i;
        }
        System.out.println("Name without Whitespace - " + no_ws);
    }
    
    static void sort(Student[] s) {
    	int n = s.length;
    	for(int i = 0; i < n; i++) {
    		for(int j = 0; j < n - i - 1; j++) {
    			if(s[j].sname.compareTo(s[j+1].sname) > 0) {
    				Student temp;
        			temp = s[j];
        			s[j] = s[j+1];
        			s[j+1] = temp;
    			}
    		}
    	}
    }
    
    void check_sub(String sub) {
    	if (sname.contains(sub)) {
    		System.out.println(sname+" Contains " + sub);
    	} else {
    		System.out.println(sname+" Does not Contain " + sub);
    	}
    }

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Students - ");
        int n = sc.nextInt();
        Student s[] = new Student[n];

        for (int i = 0; i < n; i++) {
            Student stu = new Student();
            s[i] = stu;
        }
        sc.nextLine();
        System.out.println("Enter Substring to check for - ");
        String sub = sc.nextLine();
        
        Student.sort(s);

        for (Student stu: s) {
        	stu.check_sub(sub);
        	stu.extractInitials();
        	stu.removeWhitespace();
        	stu.display();
            System.out.println("\n\n");
        }

    }
}
