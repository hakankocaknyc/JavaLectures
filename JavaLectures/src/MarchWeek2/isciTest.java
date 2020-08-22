package MarchWeek2;

 

public class isciTest {

	public static void main(String[] args) {
		 
		isci isci1= new isci("hakan", 23  );
		
		isci isci2 =new isci("can", 45, 2000, 23);
		
		 
		 isci2.calismadi();
		 isci2.calismadi();
		  
		 isci1.calismasaati=30;
		 isci1.maas=2000;
		 isci1.is();
		 System.out.println(isci1.maas );
		 
		 isci1.calismadi();
		 isci1.calismadi();
		  
	}

}
