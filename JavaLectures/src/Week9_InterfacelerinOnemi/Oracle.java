package Week9_InterfacelerinOnemi;

public class Oracle implements Idatabase{
	@Override
	public void add() {
		 System.out.println("Oracle ekleme");
		
	}

	@Override
	public void delete() {
		System.out.println("Oraclesilme");
		
	}

	@Override
	public void get() {
		System.out.println("Oracle elde etme");
		
	}

	@Override
	public void update() {
		System.out.println("Oracle guncelleme");
		
	}

}
