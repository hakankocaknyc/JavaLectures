package Week7_OOPCatPackgace;

public class CatRunner {

	public static void main(String[] args) {
		 
		Cat obj= new Cat ();
		 obj.catAge= 2;
		 obj.catcins= "Tekir";
		 obj.catColor="Black";
		 obj.catWeiht=5;
	 
		 
		 System.out.println("Cat age is : " + obj.catAge);
		 System.out.println("Cat cinsi is : " + obj.catcins);
		 System.out.println("Cat color is : " + obj.catColor);
		 System.out.println("Cat catWeiht is :" + obj.catWeiht);
		 
		 System.out.println("............");
		 obj.cat();
		 obj.cat1();
		 

	}

}
