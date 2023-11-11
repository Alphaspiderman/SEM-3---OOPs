package Lab_4;

import java.util.Scanner;

class Account {
	String name;
	int acc_no;
	String type;
	double balance;
	static double rate = 6.5;
	// System.out.println("");

	Account() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Account Number - ");
		acc_no = sc.nextInt();

		System.out.println("Enter Type of Account - ");
		type = sc.next();
		sc.nextLine();

		System.out.println("Enter Name of Holder - ");
		name = sc.nextLine();

		System.out.println("Enter Current Balance - ");
		balance = sc.nextDouble();

	}

	Account(String name, int acc_no, String type, double balance) {
		this.name = name;
		this.acc_no = acc_no;
		this.type = type;
		this.balance = balance;

	}

	void deposit() {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter amount to be deposited: ");
		int amt = sc.nextInt();
		System.out.println("The amout deposited is: " + amt);
		balance += amt;
	}

	void withdraw() {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter amount to be withdrawn - ");
		int amt_withdraw = sc.nextInt();
		if (amt_withdraw > balance) {
			System.out.println("Low balanace!!");
		} else {

			System.out.println("Withdrew - " + amt_withdraw);
			balance -= amt_withdraw;
			System.out.println("Current Balance - " + balance);
		}
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Loading first Account (Default Constructor)");
		Account acc1 = new Account();

		System.out.println("Saved first Account");

		System.out.println("Loading second Account (Parameterised Constructor)");
		System.out.println("Enter Account Number - ");
		int acc_no = sc.nextInt();

		System.out.println("Enter Type of Account - ");
		String type = sc.next();
		sc.nextLine();

		System.out.println("Enter Name of Holder - ");
		String name = sc.nextLine();

		System.out.println("Enter Current Balance - ");
		double balance = sc.nextDouble();
		Account acc2 = new Account(name, acc_no, type, balance);

		System.out.println("Saved second account");
		System.out.println("Showing Rate of Interest");
		Account.display_roi();

		System.out.println("Processing First Account");
		acc1.deposit();
		acc1.withdraw();
		acc1.display();
		System.out.println("Processing Second Account");
		acc2.deposit();
		acc2.withdraw();
		acc2.display();
	}

	static void display_roi() {
		System.out.println("Rate of Interest - " + rate);
	}

	void display() {
		System.out.println("Account Number - " + acc_no);
		System.out.println("Account Type - " + type);
		System.out.println("Name of Account Holder - " + name);
		System.out.println("Balance of Account - " + balance);
		System.out.println("Rate of Interest - " + rate);

		System.out.println("\n\n");
	}
}
