package org.data;

import java.util.Scanner;

import com.xinterface.Example;

public class Types implements Example  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Types obj = new Types();
obj.staff(27);
obj.staff("babu");

	
	}

	@Override
	public void staff(String name) {
		// TODO Auto-generated method stub
		System.out.println(name);
	}
	

}
