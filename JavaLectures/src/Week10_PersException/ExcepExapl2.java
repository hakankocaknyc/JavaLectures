package Week10_PersException;

import java.util.InputMismatchException;

 

public class ExcepExapl2 {

	static void method(){
		System.out.println("Mehemete");
	}
	public static void main(String[] args) {
		
		
		
		 try {
			 System.out.println(9/0);
			 
			try {
				  try {
					
				}   
				  catch (ArithmeticException e) {
				 System.out.println("InputMismatchException");
				}
			} catch (Exception e) {
				 System.out.println("IndexOutOfBoundsException");
			}
		} catch (IndexOutOfBoundsException e) {
			 System.out.println("ArithmeticException");
				 
		
			}
		 finally {
			method();
		}
		
		}}
