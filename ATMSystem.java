package projects;
import java.util.Scanner;
public class ATMSystem {
	static double balance=50000;
	static Scanner akash=new Scanner(System.in);
	public static void main(String args[]) {
		int choice;
		System.out.println("Welcome to java ATM");
		System.out.println("1.Check Balance");
		System.out.println("2.To Deposit");
		System.out.println("3.To Withdraw");
		System.out.println("4.To Exit");
		do {
			System.out.println("Enter Your choice :");
			choice=akash.nextInt();
			switch(choice) {
				case 1:
					checkBalance();
					break;
				case 2:
					deposit();
					break;
				case 3:
					withdraw();
					break;
				case 4:
					System.out.println("Thank your for your visit to the ATM");
					break;
				case 5:
					System.out.println("Invalid choice");
			}
			
		
		}while(choice!=4);
	}
	public static void checkBalance() {
		System.out.printf("Your balance is %.2f\n",balance);
	}
	public static void deposit() {
		System.out.println("Enter the ammount to be deposited :");
		double depositAmount=akash.nextDouble();
		balance+=depositAmount;
		System.out.println("Amount deposited successfully");
	}
	public static void withdraw(){
		System.out.println("Enter the ammount to be withdrawn :");
		double withdrawAmount=akash.nextDouble();
		if(withdrawAmount<=balance) {
			balance-=withdrawAmount;
			System.out.println("Please collect your cash");
		}else {
			System.out.println("Insufficient balance");
		}
	}
}
