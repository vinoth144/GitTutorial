package controlStatements;

import java.util.Scanner;

public class ConditionalStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Mark");
		int marksObtained = input.nextInt();

		int marksToScore = 35;
		int marks = 90;
		if(marksObtained>marksToScore&&marksObtained<marks) {
			System.out.println("you are passed");
		}
		else if(marksObtained==marksToScore) {
			System.out.println("you are just pass");
			
		}
		else if(marksObtained>marks) {
			System.out.println("you are gold medallist");
			
		}
		else{
			System.out.println("you are not passed");
		}
	}

}
