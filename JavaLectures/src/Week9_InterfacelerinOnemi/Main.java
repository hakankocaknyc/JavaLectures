package Week9_InterfacelerinOnemi;

 

class DatabaseManager{
	
	public void AddDatabase(Idatabase database){
		database.add();
	}
	public void UptadeDatabase(Idatabase database){
		database.update(); 
	}
	public void GetDatabase(Idatabase database){
		database.get();
	}
	public void DeleteDatabase(Idatabase database){
		database.delete();
	}
}
public class Main {

	public static void main(String[] args) {
	 
 DatabaseManager manager = new DatabaseManager();
 
 			manager.AddDatabase(new MongoDatabase());
 			manager.AddDatabase(new Oracle());
 			manager.DeleteDatabase(new Mysqldatabase());
	}

}
