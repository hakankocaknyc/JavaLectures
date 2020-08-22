package Week10_PLY_AnimalSpeak;

 

class hayvan {
	  
	  public static void main(String[] args) {
		
		  hayvan hayvan = new hayvan();
		  hayvan.ses();
		  kedi kedi = new kedi();
		  kedi.ses();
		  
		  kopek kopek = new kopek();
		  kopek.ses();
		  
		  hayses hs = new hayses();
		  hs.haysesi(kedi);
		  hs.haysesi(kopek);
		  hs.haysesi(hayvan);
	}
	public void ses(){
		System.out.println("Havyanin cikardigi ses");
	}
  }
  
	class kedi extends hayvan {
		public void ses(){
			System.out.println("miyav");
		}
	
	}
	
class kopek extends kedi{
	
	public void ses(){
		System.out.println("hav havv");
	}
}

 class hayses extends hayvan{
	 public void haysesi(hayvan Hayvan){
	 Hayvan.ses();
		 
	 }
	 
	 
 }