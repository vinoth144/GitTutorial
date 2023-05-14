package workouts;
import java.lang.String;
public class Today {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] black = {"don", "cat","dog"," sheep"};
		
		String[] array = black[0].split("o");
		
for(int i=0; i<array.length;i++) {
			
			System.out.println(array[i]);
		
		}
		


		String ray = "you are more than what you think";
		
		String [] no =ray.split(" ");
		
		
		for(int i=0; i<no.length;i++) {
			
			System.out.println(no[i]);
		
		}
		
		System.out.println("methods in String"+"\n"+"**************" );
		
		
		int all = no[2].length();
		
		System.out.println(all);
		
		boolean dash = ray.isEmpty();
		System.out.println(dash);
		
		char charAt = ray.charAt(3);
		System.out.println(charAt);
		
		
	
		
		
	}

}
