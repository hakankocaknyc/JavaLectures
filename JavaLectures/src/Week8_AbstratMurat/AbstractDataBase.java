package Week8_AbstratMurat;

 

public abstract class AbstractDataBase {
	
	public void add(){ // bu metotlar abstract siniftan tureyen her sinifa
		// aynen eklenecek ayni ozellikleri diger siniflar aynen alacak
		System.out.println("Eklendi...");
	}

	
	public void delete(){
		
		System.out.println("Silindi");
	}
	abstract void update();// bu metotlar soyut yani govdesiz metotlar
	abstract void get();
	
}
