import java.util.Scanner;

public class L7_Q3 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		ByTwos s = new ByTwos();
		
		System.out.println("Enter starting value - ");
		int n = sc.nextInt();
		s.set_start(n);
		
		System.out.println("Menu \n1) Next \n2) Reset \n3) Quit");
		
		while(true) {
			System.out.println("Enter Choice - ");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Next Value - "+s.get_next());
				break;
			case 2:
				System.out.println("Reset Value ");
				s.reset();
				break;
			case 3:
				System.exit(0);
			default:
				System.out.println("Invalid Choice");
				break;
			}
		}
	}
}

interface Series{	
	int jump = 2;
	int get_next();
	void reset();
	void set_start(int start);
}

class ByTwos implements Series{
	int start, current;
	
	public int get_next() {
		current += jump;
		return current;
	}
	public void reset() {
		current = start;
	}
	public void set_start(int start) {
		this.start = start;
		current = start;
	}
}