package projects;
import java.util.Scanner;
public class Calculator {
	public static void main (String args[]) {
		Scanner akash =new Scanner(System.in);
		System.out.print("Enter number 1 : ");
		int a=akash.nextInt();
		System.out.print("Enter number 2 : ");
		int b=akash.nextInt();
		System.out.print("Enter the character :");
		char operation=akash.next().charAt(0);
		switch (operation) {
		case '+':
			System.out.println("Result :"+(a+b));
			break;
		case '-':
			System.out.println("Result :"+(a-b));
			break;
		case '*':
			System.out.println("Result :"+(a*b));
			break;
		case '/':
			System.out.println("Result :"+(a/b));
			break;	
		default:
			System.out.println("Invalid operation");
		}
		akash.close();
	}
}

