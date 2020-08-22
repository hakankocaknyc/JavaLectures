package Week7_OOPhayvanclass;

public class Hayvan {
	String isim;
	int yas;
	 
	public Hayvan(String isim, int yas) {
		super();
		this.isim = isim;
		this.yas = yas;
	}
	public void yuru(){
		
		System.out.println("yurudum");
	}
 public void yas(){
	 
	 System.out.println("yasim :" + yas);
 }
 
 public void sescikar(){
	 System.out.println("Ben bir hayvanim");
 }
}
