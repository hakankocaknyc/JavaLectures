package Week9_InterfacelerinOnemi;

public class Mysqldatabase implements Idatabase{

	@Override
	public void add() {
		 System.out.println("Mysql ekleme");
		
	}

	@Override
	public void delete() {
		System.out.println("Mysql silme");
		
	}

	@Override
	public void get() {
		System.out.println("Mysql elde etme");
		
	}

	@Override
	public void update() {
		System.out.println("Mysql guncelleme");
		
	}

}
