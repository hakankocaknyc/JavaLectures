package Week8_Arac;

public class Arac implements AracKontrol {
	int Tekersayisi = 2;
	double hiz = 0;
	int arabagucu =0;
	
	@Override
	public int getTekerlek() {
		 
		return this.Tekersayisi;
	}
	@Override
	public void tekerlekAyarla(int TekerlekSayisi) {
		 
		this.Tekersayisi=TekerlekSayisi;
	}
	@Override
	public double getHiz() {
		 
		return this.hiz;
	}
	@Override
	public void SetHiz(double hiz) {
		 this.hiz=hiz;
	}
	public Arac(int tekersayisi, double hiz, int arabagucu) {
		super();
		Tekersayisi = tekersayisi;
		this.hiz = hiz;
		this.arabagucu = arabagucu;
	}
	 
	

}
