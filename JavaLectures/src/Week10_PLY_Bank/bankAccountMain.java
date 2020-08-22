package Week10_PLY_Bank;

public class bankAccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		bankAccount b1= new bankAccount("Hakan", "ny", "saving", 3000);
 
 		
 		b1.paracekme(50);
 		 
 		b1.paraYatir(300);
 		b1.getInfo();
 		System.out.println( b1.musteriSayisi);
	}

}
