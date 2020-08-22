package Week8_AbstratMurat;

public class Test {

	public static void main(String[] args) {
		 
		AbstractDataBase obj1 = new MysqDatabase();
		AbstractDataBase obj2 = new Mongo();
		
		obj1.add();
		obj2.add();

		obj1.delete();
		obj2.delete();
	}

}
