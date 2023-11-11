package Lab_1;
import java.util.Scanner;

public class L1_Q1A {

	public static void main(String args[]) {
		int n1, n2, n3;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 3 numbers - ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		sc.close();
		
		max(n1,n2,n3);
	}
	public static void max(int x, int y, int z) {
		if (x>=y && x>=z) {
			System.out.println("Max Value - "+x);
		} else if (y>=z && y>=z) {
			System.out.println("Max Value - "+y);
		} else if (z>=z && z>=y) {
			System.out.println("Max Value - "+z);
		} 
	}

}
