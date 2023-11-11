package Lab_1;
import java.util.Scanner;

public class L1_Q4B {

	public static void main(String[] args) {
		int b, t, flag;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a start and end of range - ");
		b = sc.nextInt();
		t = sc.nextInt();
		sc.close();
		System.out.println("Prime Numbers in Range are - ");
		for(int i = b; i < t; i++) {
			flag = isPrime(i);
			if (flag == 1){
				System.out.println(i);
			}
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
