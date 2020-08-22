package MarchWeek1;

import javax.swing.JOptionPane;

public class Tuesday3 {

	public static void showYourName(){
		// Create GUI(Graphical User Interface) program 
		String name;
		
		name= JOptionPane.showInputDialog(" Enter your name");
		JOptionPane.showMessageDialog(null,"Hello " + name);

	}
	
	public static void showYourFullName(){
		

		String firstname;
		String middleName;
		String lastName;
		firstname= JOptionPane.showInputDialog(" Enter your  firstname");
		middleName= JOptionPane.showInputDialog(" Enter your middleName");
		lastName= JOptionPane.showInputDialog(" Enter your lastName");
		JOptionPane.showMessageDialog(null,"Hello " + firstname+ " "+ middleName+ " "+  lastName);
	}
	
	
	public static void parsetInt() {
	int number;
	String string;
	string=JOptionPane.showInputDialog(" Enter your number");
	number=Integer.parseInt(string);
	//Integer. parselInt(String)
	System.out.println(number + 9);
		
	}
	
	
	public static void grossPay(){
		String name;
		int hours;
		String stringHours,stringPayRate,stringGrossPay;
		double payRate; // how much do you get
		double grossPay;
		
		name=JOptionPane.showInputDialog("what is your name ?");
		
		stringHours=JOptionPane.showInputDialog("How many hours did you work ?");
		hours=Integer.parseInt(stringHours);
		
		stringPayRate=JOptionPane.showInputDialog("what is your pay rate");
		payRate=Double.parseDouble(stringPayRate);
		
		grossPay= hours * payRate; // this is the formula to calculate gross pay
		
		JOptionPane.showMessageDialog(null," Hello " + name + " your grosspay is $ " + grossPay );
		
		
		
	}
	
	
	
		public static void main(String[] args) {
				
			//showYourName();
			//System.exit(0);
			//showYourFullName();
			//parsetInt();
			//grossPay();
			
			String string =JOptionPane.showInputDialog("Enter your number : \n" + "what do you want \n" + " 1- Show your name\n" + 
			"2- show your full name\n" + "3- calculate your gross pay \n" + "4- Exit");
			int command = Integer.parseInt(string);
			
			while(command!=4){
			
				switch (command) {
			case 1:
				showYourName();
				command=4;
				break;
			case 2:
				showYourFullName();
				break;
			case 3:
				grossPay();
				break;
			 
			case 4:
				System.exit(0);
				break;
			 
				
				
			}
			
			
			
			
	}
		}
		
}