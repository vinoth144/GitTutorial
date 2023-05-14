package org.hospital;
import com.bmw.Location;
import com.method.OverLoading;

  // Heirarichel inheritance.

public class List extends Location {
	
	private void docor() {
		System.out.println("raja");
	}
	
	private void nurse() {
		System.out.println("stella");
	}
	
	
	private void peon() {
		System.out.println("mark");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List people = new List();

people.docor();

people.nurse();
people.peon();

people.city1();
people.city2();

OverLoading abc = new OverLoading();


	}

}
