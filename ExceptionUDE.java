package Exceptions;

class MyException extends Exception
{
	MyException(String msg)
	{
		super(msg);  //sending to Exception
	}
}
public class ExceptionUDE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int m1=124;
			if(m1>=100)
			{
				throw new MyException("marks must be<=99");
			}
			 
		}
		catch(MyException m)
		{
			System.out.println(m.getMessage());
		}

	}

}
