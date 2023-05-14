package com.application;
import com.academy.NameList;
public class MultipleInheritance implements Orkut, Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 MultipleInheritance done = new  MultipleInheritance();
		done.boys();
		done.boys("ceasar");
		done.boys(76, 98, 362);
		done.data();
		
		done.user1("donald", 40);
		done.user1("rafael", "spain");
		
		
	}

	@Override
	public void boys() {
		// TODO Auto-generated method stub
		System.out.println("boys are back");
	}

	@Override
	public void boys(String name) {
		// TODO Auto-generated method stub
		System.out.println(name);
	}

	@Override
	public void boys(int a, int b, int c) {
		// TODO Auto-generated method stub
		System.out.println(a+b+c);
	}

	@Override
	public void user1(String name, int age) {
		// TODO Auto-generated method stub
		System.out.println(name+age);
	}

	@Override
	public void user1(String name, String location) {
		// TODO Auto-generated method stub
		System.out.println(name+" "+location);
	}

	@Override
	public void data() {
		// TODO Auto-generated method stub
		System.out.println(1234);
	}

	@Override
	public void data(int id) {
		// TODO Auto-generated method stub
		System.out.println(1234);
	}

	
		
		
		

	
	
	
	
	
	
	
}
