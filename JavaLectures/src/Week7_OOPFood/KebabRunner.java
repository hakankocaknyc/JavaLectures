package Week7_OOPFood;

public class KebabRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Kebab obj= new Kebab();
		obj.foodName= " Turkish Kebab";
		obj.meat=  2  ;
		obj.onion= 1.5;
		obj.pepper= 1.75;
		obj.HowMade= "mix the meat with onions ";
		
		
		System.out.println(obj.foodName);
		System.out.println("you can use   meat : " + obj.meat + "lb");
		System.out.println("you can use   onion : " + obj.onion + "lb");
		System.out.println("you can use   pepper : " + obj.pepper + "lb");
		System.out.println("you can made : " + 	obj.HowMade  );
		
		System.out.println(">_-----__----____-----___<");
		obj.kebab();
		obj.siskebap();
		
	}
	

}
