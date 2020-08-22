package Week11_Persembe;

import Week11_Persembe.OuterClass1.Inner;


public class OuterClass1 {

	
	 private int SerialNo= 10;
	 
	 class Inner  extends OuterClass1{
		  int number = 10;
		  
		private  int getValue(){
			 
			 return  SerialNo ;
				 
			
		 }
		
		void displayCaller(){
			
			displaySerialNo();
		}
	 }
	
    void displaySerialNo(){
    	Inner obj = new Inner();
    	obj.getValue();
    	
    	
		    }
		}
		class OuterClass2{
			
			void displaySerialNo(){
				
			
//		    	OuterClass1.Inner obj = new OuterClass1.Inner();
//		    	OuterClass1.Inner object = obj.new Inner();
		    	
//		    	obj.getValue();//-----Compiler error
			
			}
		}
