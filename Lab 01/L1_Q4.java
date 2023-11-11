package Lab_1;
import java.util.Scanner;

public class L1_Q4 {

	public static void main(String[] args) {
		int n, flag;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number - ");
		n = sc.nextInt();
		sc.close();
		
		flag = isPrime(n);
		if (flag == 1){
			System.out.println("Prime Number");
		} else {
			System.out.println("Not a Prime Number");
		}

	}
	public static int isPrime(int num) {
		for(int i = 2; i < num; i++) {
			if (num %i == 0) {
				return 0;
			}
		}
		return 1;
	}

}