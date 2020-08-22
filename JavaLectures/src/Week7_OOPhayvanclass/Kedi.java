package Week7_OOPhayvanclass;

public class Kedi extends Hayvan{

	String mamaTuru;
	public Kedi(String isim, int yas,String mamaTuru) {
		super(isim, yas );
		this.mamaTuru=mamaTuru;
		 
	}
	@Override
	public void sescikar() {
		System.out.println("miyaw benim yasim :" + yas);
		
	}
	public void kediyeozel(){
		System.out.println("kediye ozel");
	}
}
