package workouts;

public class BarkingDog {

	 
	 
	public static void shouldWakeUp (boolean barking,int day) {
		 
		if(day<=23&&day>8) {
			barking= true;
			
		}
		else {
			barking = false;
		}
		
	
		System.out.println(barking);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			
		shouldWakeUp ( true, 7);
		
		System.out.println(1000);
		
	}

}
