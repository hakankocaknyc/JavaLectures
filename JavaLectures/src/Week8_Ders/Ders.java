package Week8_Ders;

 

public abstract class Ders {
	
	public static void main(String[] args) {
		
		
		Matematik ders = new Matematik();
		ders.sinifNo= 2;
		ders.getAd();
		ders.getsinifNo();
		 
		
	}
	private String ad;
	 public int sinifNo = 1;
	 
	 
	 public abstract String getAd();// metot
	 
	 public int getsinifNo(){ // metot
		  return this.sinifNo;
	 }
}
  class Matematik extends Ders{

	@Override
	public String getAd() {
		 
		return "matematik";
	}
	 public int getsinifNo(){
		 System.out.println("matematikten merhaba");
		 return super. getsinifNo();
	 }
	
	 class Fizik1 extends Ders{

		 
		@Override
		public String getAd() {
			 
			return "Fizik";
			
			
		}
		
		
		
		 
	 }
}