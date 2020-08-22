package Week8_ogrenci;

public class MatOgr extends Ogr implements Bil {

	public MatOgr(String isim, int no) {
		super(isim, no);
		 
		
	}
	public void hesapla(){
		System.out.println("hesapladim");
	}
	@Override
	public  void bolumSoyle() {
		System.out.println("Benim Bolumum matematik");
		
	}
	 
	public void bilgisayardaYaz() {
	 System.out.println("yazdim");
		
	}
 
	public int bilgi(int a, int b) {
	 
		return a * b;
	}
	 
}
