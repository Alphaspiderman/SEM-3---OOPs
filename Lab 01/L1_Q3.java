package Lab_1;
import java.util.Scanner;
public class L1_Q3 {

	public static void main(String[] args) {
		int n,c,r;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter value of N and R - ");
		n = sc.nextInt();
		r = sc.nextInt();
		sc.close();
		
		c = fact(n)/(fact(n-r) * fact(r));
		
		System.out.println("Value of nCr = " + c);
	}
	
	public static int fact(int num) {
		if(num < 0) {
			System.out.println("Can not find factorial of negative numbers");
			return 0;
		}
		int facto, n;
		facto = 1;
		n = num;
		
		while(n>1) {
			facto *= n;
			n--;
		}
		return facto;
		
	}

}
