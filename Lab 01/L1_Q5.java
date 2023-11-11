package Lab_1;
import java.util.Scanner;

public class L1_Q5 {

	public static void main(String[] args) {
		int num, sum;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number - ");
		num = sc.nextInt();
		sc.close();
		
		sum = calc(num);
		
		System.out.println("Sum of Digits - "+ sum);
		

	}
	public static int calc(int num) {
		int sum, n;
		n = num;
		sum = 0;
		
		while(n != 0) {
			sum += n%10;
			n /=10;
		}
		
		return sum;
	}

}
