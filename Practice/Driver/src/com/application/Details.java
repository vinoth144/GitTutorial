package com.application;

public class Details implements Orkut  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Orkut obj = new Details ();
		obj.boys();
		obj.boys("Adapt to change");
		
	}

	@Override
	public void boys() {
		// TODO Auto-generated method stub
		System.out.println("Boys are back");
	}

	@Override
	public void boys(String name) {
		// TODO Auto-generated method stub
		System.out.println(name);
	}

	@Override
	public void boys(int a, int b, int c) {
		// TODO Auto-generated method stub
		System.out.println(a *b+c);
	}
		
	
	
	}

