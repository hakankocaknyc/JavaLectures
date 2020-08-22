package Week9_Dad;

public class DadMain {

	public static void main(String[] args) {
		  
		Kid hkn = new Kid();
		System.out.println(hkn.name);
		System.out.println("babasinin metodu : " +hkn.dad());
		System.out.println("annesinin ozellikleri : " +hkn.momEyes);
		System.out.println("annesinin  ozellikleri : " +hkn.momHeight);
		System.out.println("Annesinin metodu :" + hkn.mom());
		System.out.println("babasinin ozellikleri : " +hkn.dadHeight1);
		System.out.println("babasinin ozellikleri : " + hkn.dadEyes);
 
		final int d;
		d=5;
 
		System.out.println(d);
	}

}
