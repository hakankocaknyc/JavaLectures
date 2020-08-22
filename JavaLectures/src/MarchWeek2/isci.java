package MarchWeek2;


public class isci {

	String adi;
   int age;
   double maas;
   int calismasaati;

   public isci(String adi, int age, double maas, int calismasaati) {
 
	this.adi = adi;
	this.age = age;
	this.maas = maas;
	this.calismasaati = calismasaati;
}

public isci(String adi, int age   ) {
	super();
	this.adi = adi;
	this.age = age;
	 
}

public void setCalismasaati(int calismasaati) {
	this.calismasaati = calismasaati;
}
   public void is(){
	   maas=maas+100;
	   maas++;
	   System.out.println(maas);
   }
   public void calismadi(){
	   System.out.println(maas);
	   maas=maas-150;
	   maas--;
   }
}
