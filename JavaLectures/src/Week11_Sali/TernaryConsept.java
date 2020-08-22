package Week11_Sali;

public class TernaryConsept {

	public static void main(String[] args) {
		 
		int a , b ;
		a =10;
//		
//	 if (a==1) {
//			 b=20;  
//		
//	} else {b=30;

//	} System.out.println(b);
		b =(a== 10 && true) ? 20: 30;
		System.out.println(" b bak = " + b);
		
		b= (a==10) ? 40: 10;
		System.out.println(" b = " + b);
		
		b= (b==10) ? 40: 10;
		System.out.println(" b = " + b);
		
		
	}

}
