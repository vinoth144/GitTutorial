package com.loop;

public class NestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i =2;i<100;i++) {
			boolean a = true;
			
			for(int j=2;j<i;j++) {
				
			if(i%j==0) {	
				a = false;
				break;
			}
			
			}
			if (a==true) {
			System.out.println(i);
			}
			
			
		}
		
		int x = 97;
		
		for(int i=2;i<x;i++) {
			boolean a = true;
		if(x%i==0) {
			a= false;
		
		}
		
		if (a==true) {
		
		System.out.println("x is a prime");
		break;
		}
		else {
			System.out.println("x is not a prime");
			break;
		}
	}
		}
		}
	

