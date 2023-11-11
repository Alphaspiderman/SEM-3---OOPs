import java.util.Scanner;

public class L7_Q4 {

	public static void main(String[] args) {
		Result res = new Result();
		
		res.set_rnumber();
		res.set_marks();
		res.put_grade();
		
		res.display_final_res();
	}

}

class Student{
	int marks;
	int rollno;
	static Scanner sc = new Scanner(System.in);
	
	int get_rnumber() {
		return rollno;
	}
	
	int get_marks() {
		return marks;
	}
	
	void set_marks() {
		System.out.println("Enter Marks - ");
		marks = sc.nextInt();
	}
	
	void set_rnumber() {
		System.out.println("Enter Roll Number - ");
		rollno = sc.nextInt();
	}
}

interface Sport{
	public void put_grade();
}

class Result extends Student implements Sport{
	int grade;
	public void put_grade() {
		System.out.println("Enter Marks in Sports - ");
		grade = sc.nextInt();
	}
	
	void display_final_res() {
		System.out.println("Roll Number - "+rollno);
		System.out.println("Marks - "+marks);
		System.out.println("Marks in Sports - "+grade);
	}
}
