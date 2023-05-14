package com.tata;

import com.bmw.Location;

// hierarichel inheritance



public class Product extends Location { 

	private void tea() {
		System.out.println("cardamom");
		
	}
	private void steel () {
		
		System.out.println("HARD " );
	}
	
	private void cement () {
		
		System.out.println("QUALITY");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product variety = new Product();
		variety.tea();
		variety.cement();
		variety.steel();
		
		variety.city1();
		variety.city2();
	}

}
