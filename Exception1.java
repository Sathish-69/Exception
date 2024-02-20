package Exceptions;

public class Exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=20;
		int b=20;
		System.out.println("a=  "+a+" b ="+b);
		
		try
		{
			//String s=args[0];
			int c=a/(a-4);
			System.out.println("c ="+c);
		}
		
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
			System.out.println("please divide non zero value");
		} 
		catch(ArrayIndexOutOfBoundsException g)
		{
			System.out.println("array error");
			System.out.println(g.getMessage());
			System.out.println("please enter cmd line args");
		}
		catch(Exception f)
		{
			System.out.println(f.getMessage());
		}
		finally
		{
			System.out.println("end of the program");
		}
	}
}
