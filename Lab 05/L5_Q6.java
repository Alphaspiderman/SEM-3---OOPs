package Lab_5;

import java.util.Scanner;

public class L5_Q6 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number - ");
		String inp = sc.nextLine();

		String out = "";
		int count = 0;
		char[] arr = inp.toCharArray();
		int n = arr.length;

		for (int i = n-1 ; i!=-1; i--){
			out = arr[i] + out;
			count++;
			if (count%3 == 0 && i != 0){
				out = ","+out;
			}
		}

		System.out.println("Formatted - "+out);
	}

}
