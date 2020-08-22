package Week10_ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class hataYakalama {

	public static void main(String[] args) {
		 
		 Scanner input = new Scanner(System.in);
		 
		int dizi[] = { 1, 2, 3, 4, 5 };
		int index;
		boolean dogru =false;
		while (!dogru){
		try {
			System.out.println(" bir index degeri giriniz");
		index =input.nextInt();
		
		    System.out.println("Dizinin elemani :" + dizi[index]);
			 
		} catch (ArrayIndexOutOfBoundsException e) {
			 
		
					dogru=false;
			System.out.println("Dizinin disina cikilmis");
			  
		}catch (InputMismatchException e) {
			 System.out.println("d");
		}
			
		
		System.out.println("Program calisiyor");

		
		
	} 
		}
}
