package Week8_AbstratMurat;

public   class MysqDatabase extends AbstractDataBase {

	@Override
	void update() {
		 System.out.println("Mysql Guncelledi");
		
	}

	@Override
	void get() {
		System.out.println("Mysql verileri aldi");
		 
		
	}

}
