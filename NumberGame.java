package projects;
import java.util.Random;
import java.util.Scanner;
public class NumberGame {
	public static void main(String args[]) {
		
		Random akash =new Random();
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Number Guessing game");
		System.out.println("Guess a number betwen 1-100");
		
		int guess=0;
		int attempts=0;
		int number=akash.nextInt(1,100);
		
		while(guess!=number) {
			System.out.print("Enter a guess :");
			guess=sc.nextInt();
			attempts++;
			 if (guess > number + 20) {
	                System.out.println(" TOO HIGH!");
	         }else if (guess < number - 20) {
	                System.out.println(" TOO LOW!");
	         }else if (guess > number) {
	                System.out.println(" ALMOST! Slightly high ");
	         }else if (guess < number) {
	                System.out.println(" ALMOST! Slightly low ");
	         }else {
	                System.out.println(" You got it! " + number + " is the number");
	                System.out.println("#Attempts: " + attempts);
	            }
			}
			
		sc.close();
		}
	}





