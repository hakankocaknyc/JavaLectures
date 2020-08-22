package MarchWeek2_0;

  

public class BankAccount {
	
	private String name;
    private double balance;
    private static int transaction;
    private static int customer;
    
// I would like to learn the number of the transactions in this bank account
    
    public BankAccount(String name) {
        this.name = name;
        customer++;
    }
    static void method(double amount){
        //balance += amount; compiler error
        // We can not use non-static fields-variables inside of static methods
    }
    public static void main(String[] args) {
        BankAccount object1 = new BankAccount("Ahmet"),
        object2 = new BankAccount("John"),
                object3 = new BankAccount("Ethan"),object4 = new BankAccount("Haci");
        object1.deposit(9000);object1.deposit(2000);object2.deposit(5000);
        object2.withDraw(5000);object3.deposit(7000);
        System.out.println("Kac kere islem yapmis: " +transaction);
        System.out.println("kac Musteri var : " +customer);
        System.out.println("balance : " +  object1.balance + "\nName : " 
        + object1.name + "\ntrancection :" + object1.transaction);
    }
    
    void withDraw(double amount){
        balance -= amount;
        transaction++;
    }
    void deposit(double amount){
        balance += amount;
        transaction++;
    }
}
