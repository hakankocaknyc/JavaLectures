package Week10_PLY_Bank;

public class Account {
private String id;
private String name;
private int balance;
	public Account(String id, String name, int balance) {
	super();
	this.id = id;
	this.name = name;
	this.balance = balance;
}
	public Account(String id, String name) {
	super();
	this.id = id;
	this.name = name;
}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getBalance() {
		return balance;
	}
	 int credit (int amount) {
		return balance = balance + amount;
	}
	 int debit (int amount) {
		if(amount<= balance) {	
			return balance = balance - amount;
		}else{System.out.println("amount exceed");}
		return balance;
	 }
	void transferTo(Account another, int amount) {
		 if(amount<=balance) {
			 balance = balance - amount;  
			 another.balance=another.balance+amount ;
			 }
		 else {System.out.println("amount exceed");
		 
		 }}
	 public String tooString(){
			return id + " " + name + " " + balance;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account object1 = new Account("Talha","Donmez", 1700);
		Account object2 = new Account("mehmet","yilmaz",250);
		System.out.println(object1.id);
		System.out.println(object1.name);
		System.out.println(object1.balance);
		object1.debit(300);
		System.out.println(" balance :" + object1.balance);
		object1.credit(250);
		System.out.println(" balance :" + object1.balance);
		 object1.transferTo(object2, 300);
		System.out.println( object1.tooString());
		System.out.println(object2.id + " " + object2.balance);
	}
}