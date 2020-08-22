package Week8_ogrenci;

public class FenOgr extends Ogr implements Bil,ciz{

	public FenOgr(String isim, int no) {
		super(isim, no);
		 
	}
 public void bil(){
	 System.out.println("bildim");
 }
@Override
public void bolumSoyle() {
	System.out.println("Benim Bolumum Fen");
	
}
@Override
public void bilgisayardaYaz() {
	System.out.println("tamam tamam yazdim");
	
}
@Override
public int bilgi(int a, int b) {
	// TODO Auto-generated method stub
	return 0;
}
@Override
public void ciz() {
	System.out.println("tamam cizdim");
	
}
}
