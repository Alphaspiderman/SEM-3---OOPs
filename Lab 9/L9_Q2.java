package Lab_9;

import java.util.Scanner;

public class L9_Q2 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter dimensions of matrix - ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] matrix = new int[m][n];
        System.out.println("Enter elements of matrix - ");
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Saved");
		int totalSum = 0;

		RowSum[] calculators = new RowSum[m];
		Thread[] threads = new Thread[m];

		for (int i = 0; i < m; i++) {
			calculators[i] = new RowSum(matrix[i]);
			threads[i] = new Thread(calculators[i]);
			threads[i].start();
		}

		try {
			for (int i = 0; i < m; i++) {
				threads[i].join();
				totalSum += calculators[i].sum;
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

        System.out.println("Sum of all elements = " + totalSum);
    }
}

class RowSum implements Runnable{
    int[] row;
    int sum = 0;

    public void run(){
        for(int i : row){
            sum += i;
        }
        // System.out.println("Sum of row " + row + " = " + sum);
    }

    RowSum(int[] r){
        row = r;
    }
}