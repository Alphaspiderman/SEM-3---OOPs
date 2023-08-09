package Lab_1;
import java.util.Scanner;

public class L1_Q2 {
	
	public static void main(String[] args) {
		int num, rev;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number - ");
		num = sc.nextInt();
		sc.close();
		
		rev = reverse(num);
		
		if(rev == num) {
			System.out.println("Palindrome");			
		} else {
			System.out.println("Not a Palindrome");
		}

	}
	public static int reverse(int num) {
		int reverse, n;
		n = num;
		reverse = 0;
		
		while(n != 0) {
			reverse *= 10;
			reverse += n%10;
			n /=10;
		}
		
		return reverse;
	}

}
