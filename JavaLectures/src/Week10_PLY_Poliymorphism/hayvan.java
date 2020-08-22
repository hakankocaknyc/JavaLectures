package Week10_PLY_Poliymorphism;

 

class anima {	
	private String name;

	public anima(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void konus(){
		 System.out.println("Hayvan konusuyor");
	}
	
}

class Kus extends anima{

	public Kus(String name) {
		super(name);
		 
	}

	@Override
	public void konus() {
		 System.out.println(getName()+ "otuyor");
	}
	
}

class kopek extends anima{

	public kopek(String name) {
		super(name);
		 
		System.out.println(getName()+ " havliyor");
	}
	
}

 class at extends anima{

	public at(String name) {
		super(name);
		 
		System.out.println(getName() + " Kisniyor");
	}
	 
	 
 }
public class hayvan {
	public static void speaktry( anima anima){
		
//		anima.konus();
	}
	
	public static void main(String[] args) {
		
		anima anima= new anima("hayvan");
//		anima.konus();
//		Kus kus =new Kus("limon");
//		kopek kopek = new kopek("Karbas");
//		at at= new at("Kirat");
		
//		anima anima2 =new Kus(" limon ");
//		anima2.konus();
//		 
		speaktry(new at("limon"));
		speaktry(new kopek("karabas"));
	}
	
}
