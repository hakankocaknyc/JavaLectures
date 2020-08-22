package Week9_InterfacelerinOnemi;

public class MongoDatabase implements Idatabase {
	@Override
	public void add() {
		 System.out.println("Mongo ekleme");
		
	}

	@Override
	public void delete() {
		System.out.println("Mongo silme");
		
	}

	@Override
	public void get() {
		System.out.println("Mongo elde etme");
		
	}

	@Override
	public void update() {
		System.out.println("Mongo guncelleme");
		
	}

}
