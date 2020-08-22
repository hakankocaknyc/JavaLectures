package Week7_OOPhayvanclass;

public class HayvanDeneme {

	public static void main(String[] args) {
//		 Hayvan hayvan= new Hayvan();
//		 hayvan.yuru();
		 Kedi kedi = new Kedi("Tekir",6,"sut");
		 kedi.yuru();
		 System.out.println("Kedinin yasi :" + kedi.yas);
		 System.out.println("Kedinin ismi :" + kedi.isim);
		 System.out.println("Kedinin mamasi :" + kedi.mamaTuru);
		 
 System.out.println("888************* **************888");
		 
		 Kopek kopek= new Kopek("karabas", 12,14,30);
 	 
		 	kopek.yas();
		 	kopek.sescikar();
		 	kedi.sescikar();
		 System.out.println("kopegin hizi : " + kopek.hiz);
		 System.out.println("kopegin yasi : " + kopek.yas);
		 System.out.println("kopegin adi : " + kopek.isim);
		 System.out.println("kopegin uyku saati : " + kopek.uykusaati);
		 
	}

}
