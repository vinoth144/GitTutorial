package com.academy;

import java.util.ArrayList;
import java.util.Arrays;
import java.lang.String;
public class NameList {
	
	 protected void studentName() {
		System.out.println("raja");
	}
	public void studentId() {
		System.out.println("345");
	}
	public void studentAge() {
		System.out.println("34");
	}
	
	public static void main(String[]args) {
		
		NameList record = new NameList();
		
		 record.	studentName();
		
		record.studentId();
		
		record.studentAge();
		
		
		

		
		
	
	
		
		
		
	String [] arr = new String [5];
	
	arr[0]="rob";
	arr[1]="mob";
	arr[2]="arasu";
	arr[3]="be honest person";
	arr[4]="welcome man";
	
	String[] split = arr[2].split("arasu");
	System.out.println(split);
	
	for(int i =0;i<arr.length;i++) {
		 
		 System.out.println(arr[i]);
	 }
	
	for(String m:arr) {
		System.out.println(m);
	}
	
	
	boolean case1 = arr[2].equalsIgnoreCase("bob");
	
	 System.out.println(case1);

	int ase2 =  arr[3].indexOf("person");
	System.out.println(ase2);
	 
	
	String [] x = {"luck","bob","chem","marely"};
	
	 boolean empty = x[2].isEmpty();
	 
	 System.out.println( empty);
	 
	 char charAt = x[3].charAt(0);
	
	System.out.println(charAt);
	
	int length = x[0].length();
	
	System.out.println(length);
	
	String ase = x[3].toUpperCase();
	
	System.out.println(ase);
	
	boolean startsWith = x[1].startsWith("b");
	
	System.out.println(startsWith);
	
 for(int i =0;i<x.length;i++) {
	 
	 System.out.println(x[i]);
 }
	
	for(String g :x) {
		System.out.println(g);
	}
	
	
	
	
	
	
	
		
	}
	
	
	}

