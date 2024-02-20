package Exceptions;

import java.lang.*;

public class Exception2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int x[]=new int[5];
			x[3]=200;
					
			int a=200;
			int b=a/2;
			System.out.println("b= "+b);	
		}
		catch(ArithmeticException e)
		{
			System.out.println("please divide by non zero");
		}
		catch(ArrayIndexOutOfBoundsException e1)
		{
			System.out.println("you are approaching out of index ");
		}
		finally
		{
			System.out.println("come back again....");
		}
	}

}
