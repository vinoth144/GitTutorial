package com.ashiq;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Student {
	public static void main(String[] args) {
		List a =new ArrayList();
		
		a.add("Ashiq");
		a.add("sabrin");
		a.add('R');
		a.add(4045);
		a.add(34.4)	;
		System.out.println(a.get(2));
		
		int size = a.size();
		System.out.println(size);
		
		int indexOf = a.indexOf("sabrin");
		System.out.println(indexOf);
		
		a.add(2, 45);
		System.out.println(a);
		
		
		Object set = a.set(4, 20.02);
		System.out.println(a);
		
		boolean contains = a.contains("ashiq");
		System.out.println(contains);
		
		Object remove = a.remove(4);
		System.out.println(a);
		
		List b=new LinkedList();
		System.out.println(b);
		
		
		b.addAll(a);
		b.add("selenium");
		System.out.println(b);
		
		boolean retainAll = b.retainAll(a);
		System.out.println(b);
		
		b.removeAll(a);
		System.out.println(b);
		
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}