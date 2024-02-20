package Exceptions;

import java.util.Scanner;

public class Ex6  extends Exception{



	Ex6(String name)
	{
		System.out.println(name);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name;
		int age;
		
		System.out.println("Enter ur age: ");
		
		 age=sc.nextInt();
		 try {
			 if(age<18||age>60) {
				 throw new Ex6("invalid age");
			 }
			 else
			 {
				 System.out.println("Valid age");
			 }
			 
		 }
		 catch(Ex6 e)
		 {
			 System.out.println(e);
		 }
		 
	}
	


}
