package com.xinterface;

public interface Example {

 void staff(String name);
 
 default void staff(int age) {
	System.out.println(age);
}
}