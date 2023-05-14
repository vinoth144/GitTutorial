package workouts;

public class ConceptClear {
double a=4;
	 public  long toMilesPerHour( double kilo) {

	        if(kilo < 0) {
	            return -1;
	        }
	        else if(a <5) {
	        	return Math.round(kilo/2); 
	        }
	        return Math.round(kilo / 1.609);
	    }

	    public  void printConversion(double kilometersPerHour) {

	        if(kilometersPerHour <0) {
	            System.out.println("Invalid Value");
	        } else {
	            long milesPerHour = toMilesPerHour(kilometersPerHour);
	            System.out.println(kilometersPerHour +
	                    " km/h= " + milesPerHour +
	                    " mi/h");
	        }
}
	    
	   public static void main(String[]args) {
		   
		   //printConversion( 10.5);
			ConceptClear s = new ConceptClear();
			long milesPerHour = s.toMilesPerHour(20);
			System.out.println(milesPerHour);
		}
}
