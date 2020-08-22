package Week8_ogrenci;

public abstract class Ogr {

	
	private String isim;
	private int no;
	
	
	public Ogr(String isim, int no) {
		super();
		this.isim = isim;
		this.no = no;
	}
	
	public abstract void bolumSoyle();
	
	public void adsoyle(){
		System.out.println(" Adim : " + isim);
	}
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	
	
}
