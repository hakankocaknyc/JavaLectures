package Week9_AlexInterfacesFun;

interface WaterBottleInterface{
		String color = "Blue";
 
		void fillUp();
}
public class InterFaceExample implements WaterBottleInterface { 
	

	public static void main(String[] args) {
		
		 System.out.println(color);
		 InterFaceExample ex = new InterFaceExample();
		 ex.fillUp();
	}

	@Override
	public void fillUp() {
		System.out.println("it is fillUp");
		 
	}

}
