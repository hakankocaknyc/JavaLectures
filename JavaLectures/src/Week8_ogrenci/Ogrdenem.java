package Week8_ogrenci;

public class Ogrdenem {

	public static void main(String[] args) {
		
			Ogr O1 = new MatOgr("Ayse", 3);
			Ogr O2 = new FenOgr("Ali", 6);
			Ogr o3 = new PsiOgr("Veli", 99);
	
		 O1.adsoyle();
		 O2.adsoyle();
		 ((FenOgr) O2).bil();
		 ((MatOgr) O1).hesapla();
		 O1.bolumSoyle();
		 O2.bolumSoyle();
		 o3.bolumSoyle();
		 
		 ((MatOgr) O1).bilgisayardaYaz();
		 ((FenOgr) O2).bilgisayardaYaz();
		 ((PsiOgr) o3).ciz();
		 ((FenOgr) O2).ciz();
	}

}
