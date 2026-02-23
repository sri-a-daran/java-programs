package projects;
import java.util.Scanner;
import java.util.Random;
public class DiceRoll {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		Random akash=new Random();
		System.out.print("Enter the number of rolls :");
		int rows=sc.nextInt();
		int total=0;
		if (rows>0) {
			for(int i=0;i<rows;i++) {
				int roll=akash.nextInt(1,7);
				System.out.print("You rolled :"+roll);
				System.out.println();
				printDie(roll);
				total+=roll;
			}
			System.out.print("Total :"+total);
		}
		else {
			System.out.print("Number of rolls should be more than zero");
		}

		sc.close();
	}
	static void printDie(int roll) {
		String Roll1="""
				 			 -------
        |       |
        |   ●   |      
        |       |
         -------  
                                                                                             				   			                           				   			
				     """;
		String Roll2="""
							  -------
        | ●     |
        |       |      
        |     ● |
         -------   		
		     """;
		String Roll3="""
							  -------
        | ●     |
        |   ●   |      
        |     ● |
         -------   		
		     """;
		String Roll4="""
							  -------
        | ●   ● |
        |       |      
        | ●   ● |
         -------   
		     """;
		String Roll5="""
							  -------
        | ●   ● |
        |   ●   |      
        | ●   ● |
         -------  
		     """;
		String Roll6="""
			      -------
        | ●   ● |
        | ●   ● |      
        | ●   ● |
         -------   	
			""";
		switch(roll) {
			case 1:
				System.out.print(Roll1);
				break;
			case 2:
				System.out.print(Roll2);
				break;
			case 3:
				System.out.print(Roll3);
				break;
			case 4:
				System.out.print(Roll4);
				break;
			case 5:
				System.out.print(Roll5);
				break;
			case 6:
				System.out.print(Roll6);
				break;
			default:
				System.out.print("Invalid number");
		}
		
	}
}
