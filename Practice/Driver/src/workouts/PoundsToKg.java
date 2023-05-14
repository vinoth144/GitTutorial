package workouts;

import java.util.Scanner;

public class PoundsToKg {

	public static void conversion (double pounds) {
		
    double convert = 0.4535*pounds;
		
		double kiloGram = convert;
		
		System.out.println(kiloGram);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		conversion(200);
		int a = 40;
		
		a = 34;
		
		System.out.println(a);
		
		double myFirstVariable = 20.00;
		
		double secondVariable = 80.00;
		
		double ThirdVariable = (myFirstVariable + secondVariable)*100.00;
		
		double FourthVariable = (ThirdVariable%40.00);
		
		boolean remainder =((ThirdVariable%40.00)==0 )?true:false;
		
		System.out.println(remainder);
		
		if(remainder==false)
			System.out.println("Got some");
		
		
		
		
		
		 
		
int position = calculatedScore(1500);
	
	displayHighScoreposition("Dinesh",position  );
	
	position = calculatedScore(800);
	
	displayHighScoreposition("babloo",position);
	
	
	}	
	
	
	
	
	public static void displayHighScoreposition(String name,int position) {
		
		System.out.println(name +"  "+" Managed to get into position" +" "+ position +" "+ "on the score table ");
	}
	
	
	public static int calculatedScore(int playerScore) {
		
		if(playerScore>1000) {
			return 1;
		}
		
		else if(playerScore>500 && playerScore<1000) {
			
			return 2;
				
		}	
		else if(playerScore>100 && playerScore < 500) {
					
					return 3;
		}
		
		
		
			return 4;
		
	
	}
}
	
	
	
	
	
	
	
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		