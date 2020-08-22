package Week10_PersException;

import java.util.Scanner;

public class EXceptiExapl {
	public static void main(String[] args) {
		
		int x = 0;
		int counter =0;
 do{
			try {
				Scanner scanner = new Scanner(System.in);
				counter++;
				if(counter>1){
					System.out.println("you've exceded number ");
					break;
				}
				System.out.println(" 1st number");
				int a = scanner.nextInt();
				System.out.println(" 2nd number");
				int b = scanner.nextInt();

				int division = a / b;
				System.out.println(division);
  x=1;
			} catch (Exception e) {

				System.out.println("Invalid value,try again");
			}
 } while( x == 0);
 }
	

}
