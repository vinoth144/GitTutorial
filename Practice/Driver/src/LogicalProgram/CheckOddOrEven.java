package LogicalProgram;

import java.util.Scanner;

public class CheckOddOrEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int nextInt = input.nextInt();
	
			if(nextInt%2==0) {
				System.out.println("even");
				
			}else {
				System.out.println("odd");
			}
			
			// print 1 to 10 odd no
			
			for(int i=0;i<=10;i++) {
				if(i%2==1) {
					System.out.println(i);
				}
				
				}
			
		
		
		
		// sum odd no 1 to 100
		int a =0;
		for(int i=0;i<=100;i++) {
			if(i%2==1) {
				a+=i;
				System.out.println(a);
				
			}
			
			}
		
		//reverse the no 1024
		
		int num = 12321;
		int rev=0;
		while(num>0) {
			int n =num%10;
			rev=(rev*10)+n;
			num=num/10;
		}
			if( num==rev) {
				System.out.println("palindrome");
			}else {
				System.out.println("not a palindrome");
			}
		
	
	
		String a1 = "HelloWorld";
		int b = 0;
		int c = 0;
		for(int i =0;i<a1.length();i++) {
			char s =a1.charAt(i);
			if(s>=65&&s<=90) {
				b++;
			}else {
				c++;
			}
		}
		System.out.println(b++);
		System.out.println(c++);
		}
		
}


