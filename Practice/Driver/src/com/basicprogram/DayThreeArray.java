package com.basicprogram;

import java.util.Arrays;

public class DayThreeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] a = new int[4];
		a[0]= 22;
		a[1]= 34;
		a[2]=66;
		a[3]=76;
		
		
		System.out.println(Arrays.toString(a));
	
		System.out.println(a);
		
		int length=a.length;
		System.out.println(length);
		for(int i =0; i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		for(int b:a) {
			System.out.println(b);
		}
		
		String [] c = new String [4];
		
		c[0]= "rambo";
		c[1]= "donald";
		c[2]= "federer";
		c[3]="nadal";
		
		for(int i =0; i<c.length;i++) {
			System.out.println(c[i]);
		}		
		String[] split = c[0].split("m");
		
	System.out.println(split[1]);
		
		int indexOf = split[1].indexOf("bo");
		
		System.out.println(indexOf);
		
		char charAt = split[1].charAt(0);
		System.out.println(charAt);
		
		
		char charAt1 = split[0].charAt(1);
		System.out.println(charAt1);
		
		char charAt2 = c[0].charAt(2);
		
		System.out.println(charAt2);
	}

}
