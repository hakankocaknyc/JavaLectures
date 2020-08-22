package Week11_Persembe;

import java.awt.color.ICC_ColorSpace;

public class QOuter {
	private int serialNo =10;
	
		class Inner{
		
		int getValue(){
			
			return serialNo;
		}
		
		void displaySerialNo(){
			Inner ic = new Inner();
			
			System.out.println("Sr. Number : " + ic.getValue());
		}
		
		
	}
				public static void main(String[] args) {
					
					QOuter m1= new QOuter();
					System.out.println();
				 
//					inner.displaySerialNo();
				QOuter.Inner ic= m1.new Inner();
				ic.displaySerialNo();
			
					}
}
