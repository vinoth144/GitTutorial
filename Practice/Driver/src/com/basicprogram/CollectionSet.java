package com.basicprogram;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class CollectionSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set  s = new TreeSet();
		
		s.add("34.67f");
		s.add("ramu");
		s.add("fj");
		s.add("steve");
		
		
	
		for(Object b:s) {
			System.out.println(b);
		}

		Set h = new TreeSet();
		h.addAll(s);
		System.out.println(h);
		
		Boolean ra = s.contains("fj");
				System.out.println(ra);
		
				h.add("wall");
		
		Object containsAll = s.containsAll(h);
		System.out.println(containsAll);
		
		Object removeAll = h.removeAll(s);
		System.out.println(removeAll);
		
		System.out.println(h);
		
		
		Set f =new TreeSet();
		
		f.add(12);
		f.add(78);
		System.out.println(f);
		
	}

}
