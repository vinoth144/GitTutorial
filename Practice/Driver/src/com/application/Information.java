package com.application;

public  class Information implements Facebook {

public  void user1(String name, int age) {
		
		System.out.println(name +" "+ age);
	}
	
	public  void user1(String name, String location) {
		System.out.println(name+" "+location);
	}

public void data () {
	System.out.println("you are lucky ");
}

public void data (int id) {
	
	System.out.println(id);
}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Information person = new Information();
		
		person.user1("babu", 25);
		person.user1("stuart", "goa");
		person.data();
		person.data(12);
		
	}

}
