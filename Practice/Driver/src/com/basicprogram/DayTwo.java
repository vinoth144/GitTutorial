package com.basicprogram;

import java.util.Scanner;

public class DayTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input =new Scanner(System.in);
System.out.println("Enter the age");
int word = input.nextInt();
if (word>=1&&word <=18) {
	System.out.println("you are eligble to vote ");
}
else {
	System.out.println("you are  not eligble to vote");
}
int sum = 0;
for(int i = 1;i<=100;i++) {
 if (i%2!=0) {
		sum = sum+i;
		
	}
}
System.out.println(sum);
int x = 28;
for(int i = 1;i<=x;i++) {
	 if (x%2!=0) {
			System.out.println(x+"is a odd number");
			break;
	 }
			else {
				System.out.println(x+"is a even number");
				break;
			}

	}
int count =0;
for(int i=2;i<=100;i++) 
	if(i%2==0) 
		count++;
		 
	
	

System.out.println(count);

for (int i = 1; i <= 100; i++) {
    if (i == 5) {
continue;
    }
    System.out.println(i);

  }

for (int i = 1; i <= 3; i++) {
    for (int j = 1; j <= 3; j++) {
      System.out.println(j);
    }

  }


}
	}
	







