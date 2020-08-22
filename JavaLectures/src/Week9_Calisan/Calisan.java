package Week9_Calisan;

public interface Calisan {
	
	public void calis();
}
class Mudur implements Calisan{

	@Override//interfacedeki metotu override etmek zorundadir.
	public void calis() {
		 
		System.out.println("Mudur Calisiyor");
	}
	
	
}
class genelMudur extends Mudur{
	
	public void calis() {
		 
		System.out.println("Genel Mudur Calisiyor");
	}
	public void toplantiYonet(){
		
		System.out.println("Genel mudur toplanti yonetiyor");
	}
}

class Programci implements Calisan {

	@Override
	public void calis() {
		 System.out.println("Programci calisiyor");
		
	}
	
	
}

class AnalizProgramci extends Programci{
	public void analizYap(){
		System.out.println("Analiz yapiliyor");
	}
	
}
class SistemProgramci implements Calisan{

	@Override
	public void calis() {
		System.out.println("Sistem Inceleniyor");
		 
		
	}
	
}
 class Pazarlama implements Calisan{

	@Override
	public void calis() {
		 
		
	}
	 
 }

