package Exceptions;




	import java.util.InputMismatchException;
	import java.util.Scanner;

	public class Calculator {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number");
			int a=0;
			int b=0;
			try
			{
				a = sc.nextInt();
				b = sc.nextInt();
				System.out.println(a/b);
			}
			catch(ArithmeticException ae)
			{
				System.out.println("Your entered is invalid to do the operation please enter valid number");
				 b = sc.nextInt();
				 System.out.println(a/b);
			}
			catch(InputMismatchException ex)
			{
				
				
				
				System.out.println("Your entered value is invalid please enter valid values again");
			}
		}

	}




