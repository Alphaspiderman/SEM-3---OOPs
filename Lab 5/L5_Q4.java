package Lab_5;

import java.util.Scanner;

class Student{
	int reg_no;
	String name;
	short semester;
	float gpa;
	float cgpa;
	String doj;
	static int num = 0;
	static Scanner sc = new Scanner(System.in);
	
	public Student(String name2, Short semester2, float gpa2, float cgpa2, String doj2) {
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
	
	static void sort_name(Student[] s) {
		int n = s.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (s[j].name.compareTo(s[j + 1].name) > 0) {
					Student temp;
					temp = s[j];
					s[j] = s[j + 1];
					s[j + 1] = temp;
				}
			}
		}
	}

	static void sort_m(Student[] s) {
		int n = s.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (s[j].semester > s[j + 1].semester) {
					Student temp;
					temp = s[j];
					s[j] = s[j + 1];
					s[j + 1] = temp;
				}
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (s[j].semester == s[j + 1].semester && s[j].cgpa > s[j + 1].cgpa) {
					Student temp;
					temp = s[j];
					s[j] = s[j + 1];
					s[j + 1] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// System.out.println("");
		Student arr[] = Student.create(5);
		for (Student stu : arr) {
			stu.display();
		}

		System.out.println("Sorting with respect to Semester and CGPA");
		sort_m(arr);
		for (Student stu : arr) {
			System.out.println("\n\nName - " + stu.name + "\nSemester - " + stu.semester + "\nCGPA - " + stu.cgpa);
		}

		System.out.println("Sorting with respect to Name");
		sort_name(arr);
		for (Student stu : arr) {
			System.out.println("Name - " + stu.name);
		}
	}

}
