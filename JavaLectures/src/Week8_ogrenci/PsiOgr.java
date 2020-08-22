package Week8_ogrenci;

public class PsiOgr extends Ogr implements ciz {

	public PsiOgr(String isim, int no) {
		super(isim, no);
		 
	}

	@Override
	public void bolumSoyle() {
		System.out.println("Benim Bolumum psikoloji");
		
	}

	@Override
	public void ciz() {
		 System.out.println("Cizerim abi");
		
	}

}
