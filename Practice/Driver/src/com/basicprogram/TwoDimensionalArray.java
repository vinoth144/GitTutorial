package com.basicprogram;

import java.util.Arrays;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a [][]= new int [2][2];
		
		a[0][0]=10;
		a[0][1]=20;
		a[1][0]=30;
		a[1][1]=40;
		
		int length = a.length;
		System.out.println(length);
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
			System.out.println(a[i][j]);
		}
			
		
		}
		
		
		
		
		
		System.out.println("*************");
		for(int b[]:a) {
			for(int c :b) {
				System.out.println(c);
			}
		}
			
		System.out.println("_________");	
		int a1 [][]	= new int  [3][3];
		
		a1[0][0]=10;
		a1[0][1]=20;
		a1[0][2]=30;
		a1[1][0]=40;
		a1[1][1]=50;
		a1[1][2]=60;
		a1[2][0]=70;
		a1[2][1]=80;
		a1[2][2]=90;
			
		for(int i=0;i<3;i++) {
			for(int j =0;j<3;j++) {
				System.out.println(a1[i][j]);
			}
		}
	}
}




			