package Exceptions;


	
	import java.util.ArrayList;
	import java.util.LinkedList;
	import java.util.List;

	class Sample
	{
		int num1;
		int num2;
		public Sample(int a,int b)
		{
			try
			{
				int sum = a+b;
				int sub = a-b;
				int mul = a*b;
				int div = a/b;
				System.out.println("sum: "+sum+" sub: "+sub+" mul: "+mul+" div: "+div);
			}
			catch(Exception e)
			{
				System.out.println("you got Exception while doing operations please try again ");
			}
		}
	}
	public class Ex5 {

		public static void main(String[] args) {
			Sample s ;
			Sample s1 ;
			try { s = new Sample(20,10);
			 s1 = new Sample(20,10);}
			catch(Exception e) { e.printStackTrace();}
			finally
			{
				s=null;
				s1=null;
				System.out.println(s);
				System.out.println(s1);
			}
		}

	}
