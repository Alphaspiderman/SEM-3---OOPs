package Lab_5;

import java.util.Scanner;

class Student {

	int reg_no;
	String name;
	short semester;
	float gpa;
	float cgpa;
	String doj;
	static int num = 0;
	static Scanner sc = new Scanner(System.in);

	Student(String name2, Short semester2, float gpa2, float cgpa2, String doj2) {
		num++;
		this.name = name2;
		this.semester = semester2;
		this.gpa = gpa2;
		this.cgpa = cgpa2;
		this.doj = doj2;

		int n = doj.length();
		String reg = "" + num;
		if (num < 10) {
			reg = "0" + reg;
		}
		String temp = doj.substring(n - 2) + reg;
		reg_no = Integer.parseInt(temp);
	}

	void display() {
		System.out.println("Name - " + name);
		System.out.println("Registeration Number - " + reg_no);
		System.out.println("Date of Join - " + doj);
		System.out.println("GPA - " + gpa);
		System.out.println("GCPA - " + cgpa);
	}

	static Student[] create(int n) {
		Student arr[] = new Student[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter Name - ");
			String name = sc.nextLine();
			System.out.println("Enter Current Semester - ");
			Short semester = sc.nextShort();
			System.out.println("Enter GPA of Semester - ");
			float gpa = sc.nextFloat();
			System.out.println("Enter CGPA - ");
			float cgpa = sc.nextFloat();
			sc.nextLine();
			System.out.println("Enter Date of joining");
			String doj = sc.nextLine();
			Student stu = new Student(name, semester, gpa, cgpa, doj);
			arr[i] = stu;
		}
		return arr;
	}

	public static void main(String[] args) {
		Student arr[] = Student.create(5);
		System.out.println("Enter SubString to Check - ");
		String sub = sc.next();
		for (Student stu : arr) {
			stu.check_sub(sub);
		}
		
		
		System.out.println("Enter Charater to Check - ");
		String ch = sc.next();
		for (Student stu : arr) {
			stu.check_starts(ch);
		}
		
		for (Student stu : arr) {
			stu.generateName();
			stu.display();
		}
	}
	
	void check_sub(String sub) {
    	if (name.contains(sub)) {
    		System.out.println(name+" Contains " + sub);
    	} else {
    		System.out.println(name+" Does not Contain " + sub);
    	}
    }
	
	void check_starts(String c) {
    	if (name.substring(0,1) == c) {
    		System.out.println(name+" Starts with " + c);
    	} else {
    		System.out.println(name+" Does not Starts with " + c);
    	}
    }
	
	void generateName() {
		String new_name = "";
		
        String[] temp = name.split(" ");
        int n = temp.length;
        for(int i = 0; i<n; i++) {
        	if(i != n-1) {
        		new_name = new_name + temp[i].toCharArray()[0] + ". ";
        	} else {
        		new_name += temp[i];
        	}
        }
        
        name = new_name;
        System.out.println("New Name - "+ name);
    }
}
