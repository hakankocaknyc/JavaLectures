package Week10_ExceptionHandling;

import java.util.Scanner;

public class HataYAkalama1 {

	public static void hatayakala(){

		 
		
		try{
		 
			System.out.println(9/0);
		}
		catch (Exception hata) {
			System.out.println("Hata var yakaldim : " + hata );
		}
		 
		
		
	}
	
	public static void array(){
		try{
			String [] array = {"hata","var ","hadi ", "yakala"};
		System.out.println(array[6]);
			
		}catch (ArrayIndexOutOfBoundsException hata1) {
		System.out.println("Hata var yakaldim : " +   hata1 );
		}
		
	}
	
	static void istisna3(){
		
		Scanner input = new Scanner(System.in);
		System.out.println("bir yazi giriniz");
		String gir= input.next();
		
		do{
			System.out.println("Lutfen Yaricapi girin");
			
		} while(true);
	}
	public static void main(String[] args) {
		
		hatayakala();
		array();
		istisna3();
		
	}

}
