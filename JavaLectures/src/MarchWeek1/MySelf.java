package MarchWeek1;

import javax.swing.JOptionPane;

public class MySelf {

	
	public static void myresult(){
		String name;
		int midterm;
		int finaly;
		double result;
		
		String stringmidterm,stringfinaly,stringresult;//bunun mantigini anlamadim
		stringmidterm=JOptionPane.showInputDialog("enter your midterm");
		midterm=Integer.parseInt(stringmidterm);
		
		
		stringfinaly=JOptionPane.showInputDialog("enter your finaly");
		finaly=Integer.parseInt(stringfinaly);
		
		result=(midterm*0.3) +(finaly*0.7);
		
		if (result>=60 &&(result<=75) ){
		JOptionPane.showMessageDialog(null, "Your Pass CC ");
		
		}else if (result>=75 &&(result<=85) ) {
			JOptionPane.showMessageDialog(null, "You Pass BB ");
			
		} else if (result>=85 &&(result<101) ) {
			JOptionPane.showMessageDialog(null, "You Pass AA ");
			

		} else {
			System.out.println("You failed");
		}
		
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		 
		
		
		
	}

}
