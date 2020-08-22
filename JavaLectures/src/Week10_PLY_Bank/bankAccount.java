package Week10_PLY_Bank;

 

public class bankAccount {
	private String name;
    private String adress;
    private String BankAccountNo;
    private double balance;
	
    
    
    public bankAccount(String name, String adress, String bankAccountNo, double balance) {
		super();
		this.name = name;
		this.adress = adress;
		BankAccountNo = bankAccountNo;
		this.balance = balance;
	}


	public String getName() {
		return name;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getBankAccountNo() {
		return BankAccountNo;
	}
	public void setBankAccountNo(String bankAccountNo) {
		BankAccountNo = bankAccountNo;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public String getInfo(){
		return "Name :" + getName() + "\n Adress : " +  getAdress()+"\nBalance"
	+getBalance();
				 
	} 
	
 public void paraYatir(int a){
	 
	 if (a<1500 && a>0) {
		 this.balance=this.balance+a;
	 }
	 else {System.out.println("gunluk limit disindasiniz");

	} System.out.println("Your balance is: " + balance);
	 
	 
 }
   public static int musteriSayisi= 19 ;
	 
 
 		public void paracekme(int a){
 			if (this.balance >a) {
				 this.balance =this.balance-a;
			} else {
					System.out.println("yeterli bakiniz bulunmamkatadir !...");
			}
 		
 		}
}
