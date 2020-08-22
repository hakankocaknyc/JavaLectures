package MarchWeek2_0;

import java.util.ArrayList;
import java.util.Scanner;

public class FlightTicketMachine {

	
	
	// static seat number;
	// buyTicket()
	// Arraylist customer  objects
	   
	private static int availableSeat = 3;
	static ArrayList<Customer> custArr = new ArrayList<>();
	void buyTicket(){
	    
	    while (availableSeat>0) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("What is your name ? ");
	        String customerName = scanner.nextLine();
	        custArr.add(new Customer(customerName));
	        availableSeat--;
	    }
	    
	    
	}
}