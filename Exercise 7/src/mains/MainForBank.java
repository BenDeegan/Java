package mains;

import classes.BankAcc;

public class MainForBank {
	public static void main(String[] args) {
		BankAcc b1 = new BankAcc("Ben", "Swords", BankAcc.current);
		BankAcc b2 = new BankAcc("Steff", "Finglas", BankAcc.student);
		BankAcc b3 = new BankAcc("Shane", "Dublin", BankAcc.current);
		BankAcc b4 = new BankAcc("Liam", "Swords", BankAcc.student);
		
		BankAcc [] arr = new BankAcc []{b1,b2,b3,b4};
		print(arr);
		System.out.println("below deposit");
		b2.deposit(15000);
		print(arr);
		System.out.println("below interest");
		b2.interest();
		print(arr);
		System.out.println("below withdraw");
		b2.withdraw(1000);
		print(arr);
		System.out.println("below withdrawall");
		b2.withdrawAll();
		print(arr);
		
	}
	
	public static void print(BankAcc [] arr ){
		for (int i = 0; i < arr.length; i++) {
			
					System.out.println(arr[i].toString());
		}
	}

}
