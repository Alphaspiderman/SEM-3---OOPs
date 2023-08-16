package Lab_2;

import java.util.Scanner;

public class L2_Q4 {

	public static void main(String[] args) {
		int m,n,i,j;
		Scanner sc = new Scanner(System.in);
		System.out.println("For 1st Matrix, enter m and n - ");
		m = sc.nextInt();
		n = sc.nextInt();
		
		int[][] mat1 = new int[m][n];
		
		System.out.println("For 2nd Matrix, enter m and n - ");
		m = sc.nextInt();
		n = sc.nextInt();
		
		int[][] mat2 = new int[m][n];
		
		if(mat1.length != mat2.length || mat1[0].length != mat2[0].length) {
			System.out.println("Unable to add Matrices of different orders");
			System.exit(1);
		}
		
		// int[][] mat3 = new int[m][n];
		
		System.out.println("Enter enteries for Matrix 1");
		
		for(i = 0; i<m; i++) {
			for(j = 0; j<n;j++) {
				System.out.print("\nEnter Value ["+i+"]["+j+"] - ");
				mat1[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Enter enteries for Matrix 2");
		
		for(i = 0; i<m; i++) {
			for(j = 0; j<n;j++) {
				System.out.print("\nEnter Value for ["+i+"]["+j+"] - ");
				mat2[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Showing Sum of Matrices");
		for(i = 0; i<m; i++) {
			for(j = 0; j<n;j++) {
				int val = mat1[i][j] +  mat2[i][j];
				System.out.print("  "+val);
				// mat3[i][j] = mat1[i][j] +  mat2[i][j];
				// System.out.print("  "+mat3[i][j]);
			}
			System.out.print("\n");
		}
	}
}
