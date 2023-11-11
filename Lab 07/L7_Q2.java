import myPackage.p1.*;
import java.util.Scanner;
public class L7_Q2 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println();
		// 3 Integers
		int n1, n2, n3;
		System.out.println("Enter 3 numbers - ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		
		System.out.println("Max Value "+Maximum.max(n1,n2,n3));
		
		// 3 Floats
		float f1, f2, f3;
		System.out.println("Enter 3 numbers - ");
		f1 = sc.nextFloat();
		f2 = sc.nextFloat();
		f3 = sc.nextFloat();
		
		System.out.println("Max Value "+Maximum.max(f1,f2,f3));
		
		
		// Array
		System.out.println("Enter length of array - ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter elements - ");
		for (int i = 0; i<n; i++) {
			arr[i] = sc.nextInt();
			
		}
		System.out.println("Max Value "+Maximum.max(arr));
		
		// Matrix
		System.out.println("Enter dimensions of Matrix - ");
		int o = sc.nextInt();
		int p = sc.nextInt();
		int[][] mat = new int[o][p];
		System.out.println("Enter elements - ");
		for (int i = 0; i<o; i++) {
			for (int j = 0; j < p; j++) {
				mat[i][j] = sc.nextInt();
			}	
		}
		
		System.out.println("Max Value "+Maximum.max(mat));
		}

}
