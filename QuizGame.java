package projects;
import java.util.Scanner;
public class QuizGame {
	public static void main(String args[]) {
		Scanner akash=new Scanner(System.in);
		
		String[] Questions= {"Which bird fly backwards ?",
							 "Who is prime minister of India ?",
							 "Who is known as father of computer ?",
							 "What is the color of apple ?",
							 "What year was facebook launched"};
		
		String[] [] Options= {{"1.Eagle","2.Bat","3.Hummingbird","4.Hawk"},
							  {"1.Jawaharlal Nehru","2.Narendra Modi","3.M.K.Stalim","4.Ram Nath Govinth"},
							  {"1.Charles Babbage","2.Alexander Grahambell","3.Jeff Bezoz","4.Bill Gates"},
							  {"1.Red","2.Green","3.White","4.Both 1 and 2"},
							  {"1.1990","2.2004","3.2007","4.1998"}};
		
		int[] answers= {3,2,1,4,2};
		int score=0;
		int guess;
		
		System.out.println("*****************************");
		System.out.println("Welcome to Java Quiz Game !!!");
		System.out.println("*****************************\n");
				
		for(int i=0;i<Questions.length;i++) {
			System.out.println(Questions[i]);
			for(String option:Options[i]) {
				System.out.println(option);	
			}
			System.out.print("Your guess :");
			guess=akash.nextInt();
			if (guess==answers[i]) {
				System.out.println("********");
				System.out.println("Correct!!!");
				System.out.print("********");
				score+=1;
			}else {
				System.out.println("********");
				System.out.println("Wrong!!!");
				System.out.print("********");
			}
			System.out.println("\n");
		}
		System.out.println("*****************************\n");
		System.out.printf("Your final score is %d out of 5\n\n",score);;
		System.out.println("*****************************\n");
		
		if(score==5) {
			System.out.print("Yahoo!!! You guessed all right");
		}
		akash.close();
	}

}
